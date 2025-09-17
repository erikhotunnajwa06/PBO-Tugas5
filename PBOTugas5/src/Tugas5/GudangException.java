/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author ASUS
 */
class StokTidakCukupException extends Exception {
    public StokTidakCukupException(String pesan) {
        super(pesan);
    }
}

public class GudangException {
    private int stok;
    public GudangException(int stokAwal) {
        this.stok = stokAwal;
    }
    public void ambilBarang(int jumlah) throws StokTidakCukupException {
        if (jumlah > stok) {
            throw new StokTidakCukupException("Stok tidak cukup untuk diambil sebesar " + jumlah);
        }
        stok -= jumlah;
        System.out.println("Pengambilan barang sebesar " + jumlah + " berhasil. Stok sekarang tinggal: " + stok);
    }
    public int getStok() {
        return stok;
    }
    
    public static void main(String[] args) {
        GudangException gudang = new GudangException(100);
        try {
            gudang.ambilBarang(30);  // pengambilan pertama
            gudang.ambilBarang(70);  // pengambilan kedua
        } catch (StokTidakCukupException e) {
            System.out.println("Error: " + e.getMessage());
        }
        System.out.println("Stok sekarang tinggal: " + gudang.getStok());  
    }
}
