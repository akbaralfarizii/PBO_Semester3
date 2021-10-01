/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
 */
package week3;
import java.util.*;
public class Soal1 {
    public static void main(String[] args){
    	Scanner scanner= new Scanner(System.in);
    	String sentence;
    	sentence = scanner.nextLine();
    	String[] tokens = sentence.split("\\s+|!|,|\\?|\\.|\\_|\\@|'");
    	System.out.println(tokens.length);
    	System.out.println(sentence.replaceAll("\\s+|!|,|\\?|\\.|_|'|@", "\n"));
    }
} 
