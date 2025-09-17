/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas5;

/**
 *
 * @author ASUS
 */
class AkarKuadratTidakValidException extends Exception {
    public AkarKuadratTidakValidException(String pesan) {
        super(pesan);
    }
}

public class AkarKuadratException {
    // Method untuk menghitung akar kuadrat dengan pengecekan input negatif
    public static double akarKuadrat(double nilai) throws AkarKuadratTidakValidException {
        if (nilai < 0) {
            throw new AkarKuadratTidakValidException("Nilai tidak boleh negatif "
                    + "untuk operasi akar kuadrat: " + nilai);
        }
        return Math.sqrt(nilai);
    }
    public static void main(String[] args) {
        double[] nilaiUji = {25, 0, -9, 16};
        for (double nilai : nilaiUji) {
            try {
                double hasil = AkarKuadratException.akarKuadrat(nilai);
                System.out.println("Akar kuadrat dari " + nilai + " adalah " + hasil);
            } catch (AkarKuadratTidakValidException e) {
                System.err.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }
}
