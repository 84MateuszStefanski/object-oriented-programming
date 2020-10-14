package przychodnia;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ClinicTest {

    @Test
    void shouldRegisterPatient() {
        //given
        Clinic clinic = new Clinic();
        //when
        clinic.registerPatient("Mateusz");
        //then
        String result = clinic.getPatientQ().peek();
        assertThat(result).isEqualTo("Mateusz");
    }

    @Test
    void shouldHandlePatient() {
        //given
        Clinic clinic = new Clinic();
        clinic.registerPatient("Michał");
        clinic.registerPatient("Tomasz");
        Doctor doctor = new Doctor("Jan", "Nowak", "Ortopeda");
        //when
        String result = clinic.handlePatient(doctor);
        //then
        assertThat(result).isEqualTo("Michał");
        assertThat(doctor.getHistory()).containsExactly("Michał");
    }

    @Test
    void shouldHandlePatients() {
        //given
        Clinic clinic = new Clinic();
        clinic.registerPatient("Jan");
        clinic.registerPatient("Michał");
        clinic.registerPatient("Tomasz");
        clinic.registerPatient("Endrju");
        clinic.registerPatient("Janina");
        clinic.registerPatient("Ela");


        Doctor doctor = new Doctor("Jan", "Nowak", "Ortopeda");
        //when
        String result = clinic.handlePatient(doctor);
        //then
        assertThat(result).isEqualTo("Jan");
        assertThat(doctor.getHistory()).containsExactly("Jan");
    }
}