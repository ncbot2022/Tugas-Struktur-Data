/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS;

/**
 *
 * @author x260
 */
import java.util.Arrays;

public class tugas7 {
    // metode Insertion Sort
    public  void insertionSort(String[] arr) {
        for (int i = 1; i < arr.length; i++) {
            String key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j].compareTo(key) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    //metode Selection Sort
    public  void selectionSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            // Tukar elemen
            String temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    //metode Bubble Sort
    public  void bubbleSort(String[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j].compareTo(arr[j + 1]) > 0) {
                    // Tukar elemen
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        } 
    }
    
    public static void main(String[] args) {
        tugas7 function = new tugas7();
        String[] nama = {"Niko", "Dandi", "Ridho", "Dwi", "Adel", "Husna", "Zahra"};
        
        // Insertion Sort
        String[] insertionSorted = Arrays.copyOf(nama, nama.length);
        function.insertionSort(insertionSorted);
        System.out.println("Hasil Insertion Sort: " + Arrays.toString(insertionSorted));
        
        // Selection Sort
        String[] selectionSorted = Arrays.copyOf(nama, nama.length);
        function.selectionSort(selectionSorted);
        System.out.println("Hasil Selection Sort: " + Arrays.toString(selectionSorted));
        
        // Bubble Sort
        String[] bubbleSorted = Arrays.copyOf(nama, nama.length);
        function.bubbleSort(bubbleSorted);
        System.out.println("Hasil Bubble Sort   : " + Arrays.toString(bubbleSorted));
    }
}
