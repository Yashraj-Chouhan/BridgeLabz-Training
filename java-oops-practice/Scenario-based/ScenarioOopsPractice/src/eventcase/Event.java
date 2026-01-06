package eventcase;
public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;          // cannot be modified
    private double venueCost;
    private double serviceCost;
    private double discount;

    protected User organizer;

    // Basic constructor
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double venueCost,
                 User organizer) {

        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.venueCost = venueCost;
        this.organizer = organizer;
        this.serviceCost = 0;
        this.discount = 0;
    }

    // Constructor with services
    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double venueCost,
                 double serviceCost, double discount, User organizer) {

        this(eventId, eventName, location, date, attendees, venueCost, organizer);
        this.serviceCost = serviceCost;
        this.discount = discount;
    }

    // Cost calculation using operators
    protected double calculateTotalCost() {
        return venueCost + serviceCost - discount;
    }

    public int getEventId() {
        return eventId;
    }

    public abstract void schedule();

    @Override
    public void reschedule(String newDate) {
        this.date = newDate;
        System.out.println(eventName + " rescheduled to " + newDate);
    }

    @Override
    public void cancel() {
        System.out.println(eventName + " has been cancelled.");
    }
}
