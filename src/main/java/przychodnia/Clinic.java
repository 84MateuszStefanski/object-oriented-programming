package przychodnia;

import java.util.ArrayDeque;
import java.util.Queue;

public class Clinic {

    private Queue<String> patientQ;

    public Queue<String> getPatientQ() {
        return patientQ;
    }

    public Clinic() {
        this.patientQ = new ArrayDeque<>();
    }

    public void registerPatient(String patientName) {
        this.patientQ.offer(patientName);
    }

    public String handlePatient(Doctor doctor) {
        //todo zapisać obsłużonego pacjenta do historii doktora
       doctor.savePatient(patientQ.peek());
       return patientQ.poll();

    }


}
