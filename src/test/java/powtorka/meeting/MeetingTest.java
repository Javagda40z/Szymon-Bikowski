package powtorka.meeting;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {
    private Meeting meeting;

    @BeforeEach
    void setUp() {
        meeting = new Meeting("opis", "adres");
    }

    @Test
    void testIfDefaultDateIsNow() {
        assertEquals(LocalDate.now(), meeting.getDate(),"Domyślna data powinna być dzisiejsza");
    }

    @Test
    void tetstIfDefaultRoomCapacityIs18() {
        assertEquals(18,meeting.getSize(),"Domyslny rozmiar sali to 18!");
    }

    @Test
    void testWhenDelayingMeeting() {
        meeting.delayMeeting(5);
        assertEquals(LocalDate.now().plusDays(5),meeting.getDate());
    }

    @Test
    void testWhenDelayingMeetingOnZeroDays() {
        meeting.delayMeeting(0);
        assertEquals(LocalDate.now(),meeting.getDate());
    }
}