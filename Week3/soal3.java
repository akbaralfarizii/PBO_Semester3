/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
*/
package week3;
import java.util.*;
public class soal3 {
    public static void main (String[] args) {
	Scanner scanner = new Scanner(System.in);
        String input;
        int hasil;
        input = scanner.nextLine();
        String [] value = input.split(" ");
        int A = Integer.parseInt(value[0]);
        int B = Integer.parseInt(value[2]);
        if(1<=A && B<=1000) {
	    switch (value[1]) {
		case "+":
		    hasil= A+B;
		    System.out.println(hasil);
                    break;
		case "-":
                    hasil= A-B;
		    System.out.println(hasil);
		    break;
		case "*":
		    hasil= A*B;
		    System.out.println(hasil);
		    break;
		case "/":
		    hasil= A/B;
		    System.out.println(hasil);
		    break;
		case "%":
		    hasil= A%B;
		    System.out.println(hasil);
		    break;
	    }
        }
        else {
        	System.out.println("Syarat inputan 1-1ooo");
        }   
    }
}