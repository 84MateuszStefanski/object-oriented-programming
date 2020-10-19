package exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionExample {

    public static void main(String[] args) throws NoInternetConectionException{

        int[] array = new int[5];

        try {
            System.out.println(array[10]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("Print it anyway");

        File file = new File("file.txt");
        try {
            Scanner scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("Print it anyway2");

       // throw new NoInternetConectionException();

        throw new NameToShortException();

    }
}
