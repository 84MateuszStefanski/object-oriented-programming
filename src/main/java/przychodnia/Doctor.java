package przychodnia;

import java.util.ArrayList;
import java.util.List;

public class Doctor {
    private String docName;
    private String docSurname;
    private String docSpecial;
    private List<String> history;

    public Doctor(String docName, String docSurname, String docSpecial) {
        this.docName = docName;
        this.docSurname = docSurname;
        this.docSpecial = docSpecial;
        this.history = new ArrayList<>();
    }

    public String getDocName() {
        return docName;
    }

    public String getDocSurname() {
        return docSurname;
    }

    public String getDocSpecial() {
        return docSpecial;
    }

    public List<String> getHistory() {
        return history;
    }


    public void savePatient(String name) {
        this.history.add(name);
    }


}
