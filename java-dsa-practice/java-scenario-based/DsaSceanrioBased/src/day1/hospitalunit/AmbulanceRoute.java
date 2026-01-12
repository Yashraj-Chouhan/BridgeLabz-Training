package day1.hospitalunit;

public class AmbulanceRoute {

    private HospitalUnit head;
    private HospitalUnit tail;

    // Add hospital unit
    public void addUnit(String name, boolean available) {
        HospitalUnit newUnit = new HospitalUnit(name, available);

        if (head == null) {
            head = tail = newUnit;
            tail.next = head; // circular link
        } else {
            tail.next = newUnit;
            tail = newUnit;
            tail.next = head;
        }
        System.out.println("🏥 Unit added: " + name);
    }

    // Find nearest available unit
    public void findAvailableUnit() {
        if (head == null) {
            System.out.println("❌ No hospital units available");
            return;
        }

        HospitalUnit temp = head;

        do {
            if (temp.available) {
                System.out.println("🚑 Redirect patient to: " + temp.unitName);
                return;
            }
            temp = temp.next;
        } while (temp != head);

        System.out.println("❌ No available unit found");
    }

    // Remove unit under maintenance
    public void removeUnit(String unitName) {

        if (head == null) {
            System.out.println("❌ No units to remove");
            return;
        }

        HospitalUnit curr = head;
        HospitalUnit prev = tail;

        do {
            if (curr.unitName.equals(unitName)) {

                if (curr == head && curr == tail) {
                    head = tail = null;
                } else {
                    prev.next = curr.next;
                    if (curr == head) head = curr.next;
                    if (curr == tail) tail = prev;
                }

                System.out.println("🛠️ Unit removed (maintenance): " + unitName);
                return;
            }
            prev = curr;
            curr = curr.next;
        } while (curr != head);

        System.out.println("❌ Unit not found");
    }

    // Display circular route
    public void displayRoute() {
        if (head == null) {
            System.out.println("No hospital units");
            return;
        }

        HospitalUnit temp = head;
        System.out.println("\n🔁 Circular Hospital Route:");
        do {
            System.out.print(temp.unitName + " → ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to " + head.unitName + ")");
    }
}
