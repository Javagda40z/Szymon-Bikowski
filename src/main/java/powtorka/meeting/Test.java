package powtorka.meeting;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Meeting meeting = new Meeting("opis", "adres");
        Meeting meeting1 = new Meeting("opis2", LocalDate.now().plusDays(2), "adres", 20);

        System.out.println(meeting.descriptionOfMeeting());
        System.out.println(meeting1.descriptionOfMeeting());
    }


}
