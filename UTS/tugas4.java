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

public class tugas4 {
     public int[] hapusDuplikat(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int j = 0; 

        for (int i = 0; i < n; i++) {
            boolean sudahAda = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    sudahAda = true;
                    break;
                }
            }

            if (!sudahAda) {
                temp[j] = array[i];
                j++;
            }
        }

        int[] hasil = new int[j];
        for (int i = 0; i < j; i++) {
            hasil[i] = temp[i];
        }

        return hasil;
    }
     
    public static void main(String[] args) {
        int[] input = {1, 2, 2, 3, 4, 4, 5};
        tugas4 fuction = new tugas4();

        int[] hasil = fuction.hapusDuplikat(input);

        System.out.print("Array yang tanpa duplikat: [");
        for (int i = 0; i < hasil.length; i++) {
            System.out.print(hasil[i]);
            if (i < hasil.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
