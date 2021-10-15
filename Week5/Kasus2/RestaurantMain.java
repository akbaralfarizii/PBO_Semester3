package Kasus2;
import java.util.Scanner;
public class RestaurantMain {
    public static void main(String[] args){
        //int menu, jumlah;
        Scanner scanner = new Scanner(System.in);
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan("Bala-Bala", 1_000, 20);
        menu.tambahMenuMakanan("Gehu", 1_000, 20);
        menu.tambahMenuMakanan("Tahu", 1_000, 20);
        menu.tambahMenuMakanan("Molen", 1_000, 20);
        menu.tampilMenuMakanan();
        
        System.out.println();
        menu.pesanMenuMakanan(1, 10);		
        menu.pesanMenuMakanan(2, 20);
		
        menu.tampilMenuMakanan();
    }
}
