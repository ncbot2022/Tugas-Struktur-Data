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

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Queue_studi_kasus {
    private Queue<Integer> queue = new LinkedList<>();
    private int nomorAntrian = 0;
    
    // Tambah pelanggan ke antrian
    public void tambahPelanggan() {
        nomorAntrian++;
        queue.add(nomorAntrian);
        System.out.println("Pelanggan dengan nomor antrian " + nomorAntrian + " telah ditambahkan.");
    }

    // Panggil pelanggan berikutnya
    public void panggilPelanggan() {
        if(queue.isEmpty()) {
            System.out.println("Tidak ada pelanggan dalam antrian.");
        } else {
            int pelanggan = queue.poll();
            System.out.println("Memanggil pelanggan nomor antrian " + pelanggan);
        }
    }

    // Tampilkan semua antrian
    public void tampilkanAntrian() {
        if(queue.isEmpty()) {
            System.out.println("Antrian kosong.");
        } else {
            System.out.println("Daftar pelanggan yang sedang menunggu antrian:");
            for(int nomor : queue) {
                System.out.print(nomor + " ");
            }
            System.out.println();
        }
    }

    // Tampilkan jumlah antrian
    public void jumlahAntrian() {
        System.out.println("Jumlah pelanggan dalam antrian: " + queue.size());
    }
    
    public static void main(String[] args) {
        Queue_studi_kasus pos = new Queue_studi_kasus();
        Scanner scanner = new Scanner(System.in);
        int pilihan;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah pelanggan");
            System.out.println("2. Panggil pelanggan berikutnya");
            System.out.println("3. Tampilkan antrian");
            System.out.println("4. Tampilkan jumlah antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    pos.tambahPelanggan();
                    break;
                case 2:
                    pos.panggilPelanggan();
                    break;
                case 3:
                    pos.tampilkanAntrian();
                    break;
                case 4:
                    pos.jumlahAntrian();
                    break;
                case 0:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}
