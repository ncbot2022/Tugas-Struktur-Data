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
public class Stack_Sederhana {
    static String[] Stack; // TIPE VARIABEL ARRAY UNTUK MEYIMPAN KUMPULAN DATA
    static int ukuran;
    static int top;
    
    // METHOD PROSUDER UNTUK INISIALISASI UKURAN STACK
    void inisial_ukuran_stack(int i){
        ukuran = i;
        Stack = new String[ukuran];
        top = 0;
    }
    
    // METHOD FUNGSI UNTUK CHECK ISI UKURAN STACK YANG ADA
    boolean check_isi_stack_min(){
        return top<=0;
    }
    boolean check_isi_stack_max(){
        return top>=ukuran;
    }
    
    // METHOD PROSUDER UNTUK MENAMBAHKAN DATA PADA STACK
    void insert_data(String i){
        if(check_isi_stack_max() == true){ // DECISION APAKAH STACK SUDAH PENUH SESUAI DENGAN INISIAL UKURAN?
            System.out.println("Maaf data tidak bisa ditambakan..!!, karena suah penuh");
        }else{
            System.out.println("Data " + i + " Masuk ke dalam tumpukan stack..");
            Stack[top++] = i;
        }
    }
    
    // METHOD PROSEDURE UNTUK MENAMPILKAN SELURUH ISI STACK
     void pick(){
        if(check_isi_stack_min() == true){ // DECISION APAKAH STACK KOSONG?
            System.out.println("Data dalam stack kosong, tidak ada data");
        }else{
            // TAMPILKAN DATA DALAM STACK YANG DIMANA DATA YANG TERAKHIR DI SIMPAN AKAN DITAMPILKAN;
            top--;
            System.out.println("Data " + Stack[top] + ", Dikeluarkan dari tumpukan");
        }
    }
    
    // METHOD PROSEDURE UNTUK MENEMUKAN DATA PADA TUMPUKAN STACK
    void find(String i){
        boolean hasil = false;
        int cari = 0;
        while(cari<top){
            if(i == Stack[cari]){
                hasil = true;
                break;
            }
            cari++;
        }
        if(hasil == true){
            System.out.println("Data ditemukan pada tumpukan ke : " + cari );
        }else{
            System.out.println("Data tidak di temukan pada tumpukan..!!!");
        }
    }
    
    void display(){
        System.out.println("________________________________________________________________");
        System.out.println("________________Tampikan Semua data stack dengan________________");
        int i=top-1;
        while(i>=0){
            System.out.println("Data stack ke "+(i+1)+" adalah "+Stack[i]);
            i--;
        }
        System.out.println("________________________________________________________________");
    } 
    
    public static void main(String[] args) {
        Stack_Sederhana a = new Stack_Sederhana();
        a.inisial_ukuran_stack(3);
        a.insert_data("Piring");
        a.insert_data("Gelas");
        a.insert_data("Sendok");
        a.display();
        a.find("Piring");
    }
}
