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
public class Queue_tanpa_library {
    private final int maxSize;
    private int front;
    private int rear;
    private final int[] queueArray;

    // Konstruktor
    public Queue_tanpa_library(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
    }

    // Menambahkan elemen ke antrian (mirip offer() pada Queue)
    public boolean add(int value) {
        if (rear == maxSize - 1) {
            System.out.println("Antrian penuh!");
            return false;
        } else {
            rear++;
            queueArray[rear] = value;
            System.out.println("Menambahkan: " + value);
            return true;
        }
    }

    // Menghapus elemen dari antrian (mirip poll() pada Queue)
    public int poll() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return 0;
        } else {
            int temp = queueArray[front];
            front++;
            return temp;
        }
    }

    // Melihat elemen terdepan tanpa menghapus (mirip peek() pada Queue)
    public int peek() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
            return 0;
        } else {
            return queueArray[front];
        }
    }

    // Cek apakah antrian kosong
    public boolean isEmpty() {
        return front > rear;
    }

    // Menampilkan isi antrian
    public void printQueue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.print("Isi antrian: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int keluar;
        int pertama;
        Queue_tanpa_library antrian = new Queue_tanpa_library(10);
        
        antrian.add(1);
        antrian.add(2);
        antrian.add(3);
        antrian.add(4);
        antrian.add(5);
        antrian.add(6);
        
        antrian.printQueue();
        keluar = antrian.poll(); // PANGGIL METHOD FUNGSI POLL MENGELUARKAN ANTRIAN DALAM QUEUE YANG TERDEPAN
        System.out.println("\nYang keluar dari antrian: " + keluar);
        pertama = antrian.peek();
        System.out.println("Elemen terdepan sekarang: " + pertama);
        
        antrian.printQueue();
        keluar = antrian.poll(); // PANGGIL METHOD FUNGSI POLL MENGELUARKAN ANTRIAN DALAM QUEUE YANG TERDEPAN
        System.out.println("\nYang keluar dari antrian: " + keluar);
        pertama = antrian.peek();
        System.out.println("Elemen terdepan sekarang: " + pertama);
        
        antrian.printQueue();
        keluar = antrian.poll(); // PANGGIL METHOD FUNGSI POLL MENGELUARKAN ANTRIAN DALAM QUEUE YANG TERDEPAN
        System.out.println("\nYang keluar dari antrian: " + keluar);
        pertama = antrian.peek();
        System.out.println("Elemen terdepan sekarang: " + pertama);
    }
}
