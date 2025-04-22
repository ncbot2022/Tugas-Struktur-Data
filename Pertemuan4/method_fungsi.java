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
public class method_fungsi {
    public static void main(String[] args) {
        method_fungsi rata_rata = new method_fungsi();
        double nilai = rata_rata.rata_rata();
        System.out.println("Rata Rata Nilai dari fungsi = " + nilai);
    }
    
    // fungsi untuk menghitung nilai rata rata 
    public double rata_rata(){   
        int ipa = 100;
        int mtk = 95;
        int jawa = 98;
        
        int[] semua_nilai = {ipa, mtk, jawa};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumblah += semua_nilai[i];
        }
        rata2 = jumblah/semua_nilai.length;
        return rata2;
    }
}
