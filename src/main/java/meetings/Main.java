package meetings;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Meeting firstMeeting = new Meeting("Planowanie ", "Okopowa 55");
        Meeting secondMeeting = new Meeting("Retrospekcja",
                LocalDate.of(2020,10,12),"Sala 10",
                10);

        Meeting[] meetings = {firstMeeting, secondMeeting};
        for (Meeting m : meetings){
            System.out.println(m);
        }


    }
}
