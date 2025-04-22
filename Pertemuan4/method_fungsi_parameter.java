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
public class method_fungsi_parameter {
    public static void main(String[] args) {
        method_fungsi_parameter mahasiswa = new method_fungsi_parameter();
        mahasiswa.simpan_nilai("Huseen", 90, 78, 100);
        mahasiswa.simpan_nilai("bayu", 80, 40, 100); 
        
        method_fungsi_parameter Kalkulator = new method_fungsi_parameter();
        double rata2_Huseen = Kalkulator.hitung_rata2("Huseen", 90, 78, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Huseen + "\n");
        
        double rata2_Bayu = Kalkulator.hitung_rata2("Bayu", 80, 40, 100);
        System.out.println("Nilai Rata Rata nya Adalah " + rata2_Bayu + "\n");
        
    }
    
    public void simpan_nilai(String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        String[] matkul = {"IPA ", "MTK ", "Struktuk Data "};
        for(int i=0; i<matkul.length; i++){
          System.out.println("Nilai " +  matkul[i] + nama + " : " + kumpulan_nilai[i]);
        }
        System.out.println("\n");
    }
    
    public double hitung_rata2 (String nama, int ipa, int mtk, int struktur_data){
        int[] kumpulan_nilai = {ipa, mtk, struktur_data};
        double jumblah = 0;
        double rata2;
        for(int i = 0; i<kumpulan_nilai.length; i++){
            jumblah += kumpulan_nilai[i];
        }
        rata2 = jumblah/kumpulan_nilai.length;
        System.out.println("Nama : " + nama);;
        return rata2;
    }
}
