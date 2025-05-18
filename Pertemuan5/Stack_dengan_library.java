/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan5;

/**
 *
 * @author x260
 */

import java.util.Stack;
public class Stack_dengan_library {
    public static void main(String[] args) {
        Stack<String> tumpukan = new Stack<>();
        
        // PANGGIL METHOD PUSH UNTUK MENAMBAHKAN DATA PADA STUCK
        tumpukan.push("1.Piring");
        tumpukan.push("2. Gelas");
        tumpukan.push("3. Garbu");
        
        // UNTUK MELIHAT SEMUA DATA PADA STACK
        System.out.println("Isi stack: " + tumpukan + "\n");
         
        
        // PANGGIL METHOD FUNGSI PEEK UNTUK UNTUK MELIHAT DATA TERATAS
        String puncak1 = tumpukan.peek();
        System.out.println("Elemen teratas sekarang: " + puncak1);
        
        // PANGGIL METHOD FUNGSI POP UNTUK UNTUK MENGELUARKAN DATA TERATAS
        String elemenTeratas = tumpukan.pop();
        System.out.println("Elemen yang di-pop: " + elemenTeratas);
        
        // PANGGIL METHOD FUNGSI PEEK UNTUK UNTUK MELIHAT DATA TERATAS SETELAH TADI DIKELUARKAN 1X     
        String puncak2 = tumpukan.peek();
        System.out.println("Elemen teratas sekarang: " + puncak2);
        
       // PANGGIL METHOD FUNGSI POP UNTUK UNTUK MENGELUARKAN DATA TERATAS
        String elemenTeratas2 = tumpukan.pop();
        System.out.println("Elemen yang di-pop: " + elemenTeratas2);
        
        // PANGGIL METHOD FUNGSI PEEK UNTUK UNTUK MELIHAT DATA TERATAS SETELAH TADI DIKELUARKAN KE 2X NYA    
        String puncak = tumpukan.peek();
        System.out.println("Elemen teratas sekarang: " + puncak);
        
        // PANGGIL METHOD FUNGSI isEmpty UNTUK UNTUK MELIHAT APAKAH DATA KOSONG
        System.out.println("Apakah stack kosong? " + tumpukan.isEmpty());
        
        // PANGGIL METHOD FUNGSI isEmpty UNTUK UNTUK MELIHAT APAKAH DATA KOSONG
        System.out.println("Ukuran stack: " + tumpukan.size());
    }
}
