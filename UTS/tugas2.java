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
public class tugas2 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};
        
        int totalLength = array1.length + array2.length;
        
        int[] Gabungan = new int[totalLength];

        for (int i = 0; i < array1.length; i++) {
            Gabungan[i] = array1[i];
        }
        
        for (int i = 0; i < array2.length; i++) {
            Gabungan[array1.length + i] = array2[i];
        }
        
        System.out.print("Array gabungan: [");
        for (int i = 0; i < Gabungan.length; i++) {
            System.out.print(Gabungan[i]);
            if (i < Gabungan.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
