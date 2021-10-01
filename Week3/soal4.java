/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
*/
package week3;
import java.util.Scanner;
public class soal4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gaji = 500000;
        int item = 50000;
        int bonus = 0;
        System.out.printf("Masukkan hasil penjualan item : ");
        int itemDijual = scanner.nextInt();
        if(itemDijual >= 40 && itemDijual < 80) {
            bonus = itemDijual * item * 25/100;
            gaji = gaji + bonus;
        }
        else if(itemDijual >= 80) {
            bonus= itemDijual * item * 35/100;
            gaji= gaji+ bonus;
        }
        else if(itemDijual < 15) {
            bonus= (15 - itemDijual) * item * 15/100;
            gaji = gaji - bonus;
        }
        else {
            bonus= itemDijual * item * 10/100;
            gaji= gaji + bonus;
        }
        System.out.println("Total gaji : " + gaji);
    }
}
