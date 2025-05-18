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
public class Stack_Tanpa_Library {
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
    
    // METHOD PROSEDURE UNTUK MENAMPILKAN ISI STACK PALING AKHIR ATAU TERATAS
     void pick(){
        int top_1 = top;
         
        if(check_isi_stack_min() == true){ // DECISION APAKAH STACK KOSONG?
            System.out.println("Data dalam stack kosong, tidak ada data");
        }else{
            // TAMPILKAN DATA DALAM STACK YANG DIMANA DATA YANG TERAKHIR DI SIMPAN AKAN DITAMPILKAN;
            top_1--;
            System.out.println("Data " + Stack[top_1] + ", Dikeluarkan dari tumpukan");
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
            System.out.println("Data yang anda cari : " + i + " ditemukan pada tumpukan ke : " + cari );
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
        Stack_Tanpa_Library a = new Stack_Tanpa_Library();
        a.inisial_ukuran_stack(6);
        a.insert_data("Piring");
        a.insert_data("Gelas");
        a.insert_data("Sendok");
        a.insert_data("Garbu");
        a.insert_data("Mangkok");
        a.insert_data("Lepek");
        a.pick();
        a.display();
        a.find("Mangkok");
        a.find("Pisau");
    }
}
