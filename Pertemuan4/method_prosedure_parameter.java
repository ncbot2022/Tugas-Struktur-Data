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
public class method_prosedure_parameter {
    public static void main(String[] args) {
        method_prosedure_parameter mahasiswa = new method_prosedure_parameter();
        mahasiswa.simpan_nilai("bayu", 90, 80, 100);
        mahasiswa.simpan_nilai("Huseen", 89, 90, 100);
        mahasiswa.simpan_nilai("Nur", 96, 50, 100);
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
}
