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

import java.util.Stack;
public class Stack_studi_kasus {
    public static boolean cekKurungSeimbang(String ekspresi) {
        Stack<Character> stack = new Stack<>();

        for (char ch : ekspresi.toCharArray()) {
            System.out.println("Karakter : " + ch);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
                System.out.println(stack);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (stack.isEmpty()) return false;
                char top = stack.pop();
                System.out.println("TOP : " + top);
                if (!pasangan(top, ch)) return false;
            }
        }

        return stack.isEmpty();
    }

    private static boolean pasangan(char buka, char tutup) {
        return (buka == '(' && tutup == ')') ||
               (buka == '{' && tutup == '}') ||
               (buka == '[' && tutup == ']');
    }
    
    public static void main(String[] args) {
        String ekspresi = "{()}";
        System.out.println("Ekspresi: " + ekspresi);
        
        if (cekKurungSeimbang(ekspresi)) {
            System.out.println("✅ Tanda kurung seimbang.");
        } else {
            System.out.println("❌ Tanda kurung TIDAK seimbang.");
        }
    }
}
