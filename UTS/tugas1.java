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
public class tugas1 {
    public static void main(String[] args) {
        int []data_input = {1, 2, 3, 4};
        System.out.print("Data elemen array sebagai input : [");
        for (int i = 0; i < data_input.length; i++) {
            System.out.print(data_input[i]);
            if (i < data_input.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
        
        System.out.print("Array terbalik: [ ");
        for (int i = data_input.length - 1; i >= 0; i--) {
            System.out.print(data_input[i]);
            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println(" ]");
    }
}
