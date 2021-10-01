/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
*/
package week3;
import java.util.Scanner;
public class soal5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String plat;
        plat = scanner.nextLine();
        String [] splitPlat = plat.split(" ");
        String number = splitPlat[0] + splitPlat[1] + splitPlat[2] + splitPlat[3];
        long change = Long.parseLong(number);
        long result =(change-999999) % 5;
        if(result  == 0) {
            System.out.println("jalan");
        }
        else {
            System.out.println("berhenti");
        }   
    }
}