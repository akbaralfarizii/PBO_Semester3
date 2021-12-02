package Soal3;

import java.util.Scanner;

public class TextField {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Silahkan input: ");
	try {
            int integer = input.nextInt();
            System.out.println("Nilai input: " + integer);
	}
        catch(Exception ex) {
            System.out.println(" Nilai yang diinputkan bukan merupakan sebuah integer");
	}
    input.close();
    }
}
