package Soal3;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class File {
    public static void main(String[] args) throws FileNotFoundException {
	FileInputStream inputFile = null;
        inputFile = new FileInputStream("test.txt");
    }
}