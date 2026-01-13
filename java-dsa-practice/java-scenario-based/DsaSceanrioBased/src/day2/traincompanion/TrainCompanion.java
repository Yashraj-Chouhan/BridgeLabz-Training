package day2.traincompanion;
class TrainCompanion {

    private Compartment head;
    private Compartment tail;

    // Insert compartment at end
    public void addCompartment(String name, boolean pantry, boolean wifi) {
        Compartment newComp = new Compartment(name, pantry, wifi);

        if (head == null) {
            head = tail = newComp;
        } else {
            tail.next = newComp;
            newComp.prev = tail;
            tail = newComp;
        }
    }

    // Traverse forward
    public void traverseForward() {
        System.out.println("Forward Traversal:");
        Compartment temp = head;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.next;
        }
    }

    // Traverse backward
    public void traverseBackward() {
        System.out.println("Backward Traversal:");
        Compartment temp = tail;
        while (temp != null) {
            System.out.println(temp);
            temp = temp.prev;
        }
    }

    // Search for service
    public void searchService(String service) {
        Compartment temp = head;
        boolean found = false;

        while (temp != null) {
            if ((service.equalsIgnoreCase("pantry") && temp.hasPantry) ||
                (service.equalsIgnoreCase("wifi") && temp.hasWifi)) {
                System.out.println("Service " + service + " available in: " + temp.name);
                found = true;
            }
            temp = temp.next;
        }

        if (!found) {
            System.out.println("Service " + service + " not found.");
        }
    }

    // Remove a compartment by name
    public void removeCompartment(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                if (temp.prev != null)
                    temp.prev.next = temp.next;
                else
                    head = temp.next;

                if (temp.next != null)
                    temp.next.prev = temp.prev;
                else
                    tail = temp.prev;

                System.out.println("Removed compartment: " + name);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found: " + name);
    }

    // Show adjacent compartments
    public void showAdjacent(String name) {
        Compartment temp = head;

        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Current: " + temp.name);
                System.out.println("Previous: " +
                        (temp.prev != null ? temp.prev.name : "None"));
                System.out.println("Next: " +
                        (temp.next != null ? temp.next.name : "None"));
                return;
            }
            temp = temp.next;
        }
        System.out.println("Compartment not found.");
    }
}
