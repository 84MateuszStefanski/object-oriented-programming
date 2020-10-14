package przychodnia;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class DoctorTest {

    @Test
    void shouldSavePatient() {
        //given
        Doctor doctor = new Doctor("Jan", "Nowak","Ortopeda");
        //when
        doctor.savePatient("Michał");
        //then
        assertThat(doctor.getHistory()).containsExactly("Michał");
    }
}