/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajopracticog1;
public class TrabajoPracticoG1 {
    
public static PronosticoDeportivo PRODE;
    
public static void main(String[] args) {
        
        System.out.println ("Sistema de simulación de pronósticos deportivos.");
        
        PRODE = new PronosticoDeportivo();

        PRODE.play();
    }
    
}
