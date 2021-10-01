/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
*/
package week3;
import java.math.BigInteger;
import java.util.Scanner;
public class soal6 {
    public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    BigInteger A,B;
    A=scanner.nextBigInteger();
    B=scanner.nextBigInteger();
    System.out.println(A.add(B));
    System.out.println(A.multiply(B));
    }
}