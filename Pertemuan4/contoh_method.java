/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan4;

/**
 *
 * @author x260
 */
public class contoh_method {
    public static void main(String[] args) {
        contoh_method lingkaran = new contoh_method();
        lingkaran.luas_lingkaran();
        double hasil_luas = lingkaran.fungsi_luas_lingkaran();
        System.out.println("Hasil Luas Lingkaran dari funsi : " + hasil_luas);
    } 
    
     // berikut adalah contoh method prosedure ciri ciri = awalan void
    public void luas_lingkaran(){
        double jari2 = 24;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        System.out.println("Hasil Luas Lingkaran dari prosedure: " + luas);
    }
    
    // berikut adalah contoh method fungsi ciri ciri = awalan tipe data dengan ada nilai balik return
    public double fungsi_luas_lingkaran(){
        double jari2 = 24;
        double phi = 3.14;
        double luas = phi*jari2*jari2;
        return luas;
    }
}
