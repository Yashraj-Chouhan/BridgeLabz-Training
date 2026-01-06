package eventcase;
public class EventEaseDriver {

    public static void main(String[] args) {

        User organizer = new User("Yashraj", "yashraj@email.com");

        Event birthday = new BirthdayEvent(
                101,
                "Yash Birthday",
                "Indore",
                "10-Oct-2026",
                50,
                20000,
                8000,
                2000,
                organizer
        );

        Event conference = new ConferenceEvent(
                102,
                "Tech Conference",
                "Bangalore",
                "15-Nov-2026",
                300,
                100000,
                organizer
        );

        birthday.schedule();
        conference.schedule();

        birthday.reschedule("12-Oct-2026");
        conference.cancel();
    }
}
