import java.util.*;

public class Soal1 {
    public static void main(String[] args) {
        int i, t;
        long n;
        Scanner keyboard = new Scanner(System.in);
        System.out.printf("Masukkan banyaknya nilai yang akan di cek:");
        t = keyboard.nextInt();
        for(i=0 ; i < t; i++){
            try{
                System.out.printf("Masukkan nilai ke-" +(i+1)+": ");
                n = keyboard.nextInt();
                if(n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE)
                    System.out.println("* byte");
                if(n >= Short.MIN_VALUE && n <= Short.MAX_VALUE)
                    System.out.println("* short");
                if(n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE)
                    System.out.println("* integer");
                if(n >= Long.MIN_VALUE && n <= Long.MAX_VALUE)
                    System.out.println("* long");        
                else
                System.out.println("Can't be filled anywhere.");
            }
            catch(Exception e){
                System.out.println("Can't be filled anywhere.");
            }
        }
    }
}
