package eventcase;
public class ConferenceEvent extends Event {

    public ConferenceEvent(int eventId, String eventName, String location,
                           String date, int attendees, double venueCost,
                           User organizer) {

        super(eventId, eventName, location, date, attendees,
              venueCost, organizer);
    }

    @Override
    public void schedule() {
        System.out.println("📊 Conference Event Scheduled!");
        System.out.println("Attendees: " + attendees);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }
}
