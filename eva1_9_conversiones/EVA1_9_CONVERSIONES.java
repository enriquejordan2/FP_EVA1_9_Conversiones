/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_conversiones;

import java.util.Scanner;

/**
 *
 * @author Jose Enrique
 */
public class EVA1_9_CONVERSIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Far, Ce;
        Scanner captu = new Scanner(System.in);
        
        System.out.println("Temperatura en grados Farenheit:");
        Far = captu.nextDouble();
        Ce = (Far-32)/1.8;
        System.out.println("°C ="+ Ce);
        
        //CENTRIGADOS A FARENHEIT
         System.out.println("Temperatura en grados Centigrados:");
        Ce = captu.nextDouble();
        Far = Ce*1.8+32;
        System.out.println("°F ="+ Far);
    }
    
}
