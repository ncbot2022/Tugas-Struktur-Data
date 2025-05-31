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
public class tugas6 {
    public int[][] transposisi(int[][] matriks) {
        int n = matriks.length;
        int[][] hasil = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                hasil[j][i] = matriks[i][j];
            }
        }

        return hasil;
    }
    
    public void tampilkanMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
        
    public static void main(String[] args) {
        tugas6 function = new tugas6();
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("Matriks asli:");
        function.tampilkanMatriks(matriks);
        
        int[][] transpose = function.transposisi(matriks);
        System.out.println("\nMatriks setelah transposisi:");
        function.tampilkanMatriks(transpose);  
    }
}
