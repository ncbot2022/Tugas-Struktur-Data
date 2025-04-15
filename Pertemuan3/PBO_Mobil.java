/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author x260
 */
public class PBO_Mobil {
    public static void main(String[] args) {
        PBO_MasterMobil Avanza = new PBO_MasterMobil();
        Avanza.karakteristik = "Irit, Keluarga, Nyaman";
        Avanza.merk = "Toyota";
        Avanza.tahunPembuatan = "2022";
        
        System.out.println("1. Avanza");
        System.out.println("Karateristik : " + Avanza.karakteristik);
        System.out.println("Merek        : " + Avanza.merk);
        System.out.println("Keluaran     : " + Avanza.tahunPembuatan);
        
        Avanza.berjalan("lambat");
        Avanza.berjalan("normal");
        Avanza.berjalan("cepat");
        Avanza.berhenti();
        
        PBO_MasterMobil Honda_civic = new PBO_MasterMobil();
        Honda_civic.karakteristik = " Sporty, Irit Bensin, Desain Elegan";
        Honda_civic.merk = "Honda";
        Honda_civic.tahunPembuatan = "2022";
        
        System.out.println("\n2. Honda Civic");
        System.out.println("Karateristik : " + Honda_civic.karakteristik);
        System.out.println("Merek        : " + Honda_civic.merk);
        System.out.println("Keluaran     : " + Honda_civic.tahunPembuatan);
        
        Avanza.berjalan("lambat");
        Avanza.berjalan("normal");
        Avanza.berjalan("cepat");
        Avanza.berhenti();
        
        System.out.println("\n1. Avanza");
        System.out.println("Karateristik : " + Avanza.karakteristik);
        System.out.println("Merek        : " + Avanza.merk);
        System.out.println("Keluaran     : " + Avanza.tahunPembuatan);
    }
    
}
