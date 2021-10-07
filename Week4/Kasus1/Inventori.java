/*
    Nama : Muhammad Akbar Alfarisi
    NIM : 201511049
    Kelas : 2B-D3 Teknik Informatika
*/
package Kasus1;

/**
 *
 * @author akbar
 */
public class Inventori {
    Barang[] barangs; 
    void initBarang() { 
        barangs = new Barang[2]; 
        barangs[0] = new Barang("001", "Baju", 10);  
        barangs[1] = new Barang("002", "Celana", 20); 
    } 
    void showBarang() { 
        System.out.println(barangs[0].nama_barang + "(" + barangs[0].getStok() + ")");
        System.out.println(barangs[1].nama_barang + "(" + barangs[1].getStok() + ")");
    }
    void pengadaaan(){
        initBarang();
        barangs[0].setStok(20);
        barangs[1].setStok(20);
        showBarang();
        //barangs[0].stok += 20;
        //barangs[0].stok -= 20;//gaboleh
        //barangs[0].stok *= 20;//gaboleh
    }
    public static void main(String[] args){
        Inventori beli = new Inventori();
        beli.pengadaaan();
    }
}
