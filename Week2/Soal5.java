import java.util.Scanner;
public class Soal5 {
    public static void main(String[] args) {
        String A, B;
        int length, i;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Masukkan kata: ");
        A = keyboard.nextLine();
        System.out.println("Masukkan kata: ");
        B = keyboard.nextLine();
        A = A.substring(0,1).toUpperCase()+A.substring(1);
        B = B.substring(0,1).toUpperCase()+B.substring(1);

        length = A.length() + B.length();

        System.out.println("Panjang jarak A ke B adalah : " + length);

        i = A.compareTo(B);
        if(i>0){
            System.out.println("Lexychographi : Yes");
        }
        else{
            System.out.println("Lexychographi : No");
        }
        System.out.printf("kalimat terbentuk : " + A + " " + B);
    }
}
