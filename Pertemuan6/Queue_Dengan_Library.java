/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan6;

/**
 *
 * @author x260
 */

// IMPORT LIBRARY YANG DIGUNAKAN UNTUK STRUKTUR QUEUE
import java.util.Queue;
import java.util.LinkedList;

public class Queue_Dengan_Library {
    static String keluar = "";
    static String pertama = "";
    public static void main(String[] args) {
        Queue<String> antrian = new LinkedList<>(); 
        
        // PANGGIL METHOD ADD UNTUK MENAMBAHKAN DATA PADA QUEUE
        antrian.add("1. Anisa");
        antrian.add("2. Budi");
        antrian.add("3. Citra");
        antrian.add("4. Dika");
        antrian.add("5. Cika");
        
        System.out.println("Isi antrian: " + antrian + "\n");
        
        keluar = antrian.poll(); // PANGGIL METHOD FUNGSI POLL MENGELUARKAN ANTRIAN DALAM QUEUE YANG TERDEPAN
        System.out.println("Yang keluar dari antrian: " + keluar);
        pertama = antrian.peek();
        System.out.println("Elemen terdepan sekarang: " + pertama);
        
        System.out.println("Isi antrian sekarang: " + antrian + "\n");
        
        keluar = antrian.poll();
        System.out.println("Yang keluar dari antrian: " + keluar);
        pertama = antrian.peek();
        System.out.println("Elemen terdepan sekarang: " + pertama);
        
        System.out.println("Isi antrian sekarang: " + antrian);
        
        System.out.println("Berapa isinya ? " + antrian.size());     
        System.out.println("Sapakah Kosong ? " + antrian.isEmpty());  
        System.out.println(antrian.contains("B")); 
    }
}
