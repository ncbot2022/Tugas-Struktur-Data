/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertumuan2;

/**
 *
 * @author x260
 */

public class Percabangan_SWICT_CASE {
    public static void main(String[] args) {        
        
        char menu = '2';
        System.out.println("Menu Makanan : ");
        System.out.println("1. Mie Goreng");
        System.out.println("2. Mie Kuah");
        System.out.println("3. Mie Ayam");
        System.out.println("4. Mie sedaap");
        System.out.println("terimakasih snda memilih menu no : " + menu);
        
        switch(menu){
            case '1':
            System.out.println("Pilihan Anda : " + menu + ". Mie Goreng (Rp.7.000)");
            break;
            case '2':
            System.out.println("Pilihan Anda : " + menu + ". Mie Kuah (Rp.7.000)");
            break;
            case '3':
            System.out.println("Pilihan Anda : " + menu + ". Mie Ayam (Rp.12.000)");
            break;
            case '4':
            System.out.println("Pilihan Anda : " + menu + ". Mie Sedaap (Rp.6.500)");
            break;
        }
    }
}
