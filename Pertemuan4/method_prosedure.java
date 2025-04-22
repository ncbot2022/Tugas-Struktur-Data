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
public class method_prosedure {
    public static void main(String[] args) {
        method_prosedure rata_rata = new method_prosedure();
        rata_rata.rata_rata();
    }
    
    // prosedure meng hitutung rata rata
    public void rata_rata (){
        int ipa = 69;
        int mtk = 90;
        int jawa = 80;
        
        int[] semua_nilai = {ipa, mtk, jawa};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<semua_nilai.length; i++){
            jumblah += semua_nilai[i];
        }
        rata2 = jumblah/semua_nilai.length;
        System.out.println("Rata Rata Nilai = " + rata2);
    }
}
