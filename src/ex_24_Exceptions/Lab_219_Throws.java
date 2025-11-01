package ex_24_Exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab_219_Throws {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File("c://abc.txt"));
        System.out.println(fileReader);

    }
}
