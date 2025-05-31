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
public class tugas3 {
    public static void main(String[] args) {
        int[] data = {1, 2, 1, 3, 4, 2, 1};
        boolean[] check = new boolean[data.length];
        
        System.out.println("Jumlah kemunculan setiap elemen:");
        for (int i = 0; i < data.length; i++) {
           if (check[i] == true) {
                continue; 
           }
           
           int count = 1;
           for (int j = i + 1; j < data.length; j++) {
               if (data[i] == data[j]) {
                   count++;
                   check[j] = true; 
               }
           }
           System.out.println("Angka " + data[i] + " muncul sebanyak " + count + " kali.");
       }
    }
}
