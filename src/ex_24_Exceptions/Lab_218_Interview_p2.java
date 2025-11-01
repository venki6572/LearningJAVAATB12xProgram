package ex_24_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_218_Interview_p2 {
    public static void main(String[] args) {

        try {
            FileReader fileReader = new FileReader(new File("c://abc.txt"));
        }
        catch (FileNotFoundException e) {
           System.out.println(e.getMessage());
        }
        finally {
            System.out.println("i will always be called");
        }
    }
}
