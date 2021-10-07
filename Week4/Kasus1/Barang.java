package Kasus1;

/**
 *
 * @author akbar
 */
public class Barang {
    String kode_barang; 
    String nama_barang; 
    private int stok; 

    public void setStok(int stok) {
        this.stok += stok;
    }

    public int getStok() {
        return stok;
    }
    //int stok;
    public Barang(String kode, String nama, int stk) {  
        kode_barang = kode;
        nama_barang = nama;  
        stok = stk; 
    }
    
}
