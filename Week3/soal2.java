/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
*/
package week3;
import java.util.*;
public class soal2 {
    public static void main(String[] args){
    	Scanner Scanner = new Scanner(System.in);
        String word;
        String [][] value = new String[3][2];
        for(int i = 0; i < 3; i++){
            word = Scanner.nextLine();
            value[i] = word.split(" ");
        }
        System.out.println("================================");
        for(String[] printed : value){
            System.out.println(String.format("%-15s", printed[0]).toLowerCase() + String.format("%3s", printed[1]).replace(" ", "0"));
        }
        System.out.println("================================");            
    }
}
