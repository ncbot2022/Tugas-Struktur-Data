/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pertemuan3;

/**
 *
 * @author x260
 */
public class PBO_MasterPlayer {
    String nama = "";
    int speed = 0;
    int healthPoint = 0;
    int attack = 0;
     
    int serangLawan(int a, int b){
        healthPoint = b-a;
        System.out.println("Attack Peyerang : " + a);
        System.out.println("Health Poin     : " + healthPoint + " Pada lawan.");
        return healthPoint;
    }
    
    void runPlayer(){
        System.out.println(nama + " Is Running ");
    }
    
    boolean isDead(){
        if(healthPoint <=0)return true;
        return false;
    }
    
}
