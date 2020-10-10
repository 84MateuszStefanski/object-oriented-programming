package meetings;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MeetingTest {

    @Test
    void shouldDelayMeetting() {

        //given
        Meeting meeting = new Meeting("Test description" , LocalDate.of(2020,10,10),
                "Test address",
                10);
        //when
        meeting.delayMeetting(5);
        //then
        LocalDate expected = LocalDate.of(2020,10,15);
        assertThat(meeting.getDate()).isEqualTo(expected);

    }
}