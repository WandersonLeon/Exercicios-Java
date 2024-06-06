/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ufc;
import java.util.*;
/**
 *
 * @author wande
 */
public class UFC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando OBJETOS com VETOR
        Lutadores[] lutador = new Lutadores[5];
        Luta ufc = new Luta();
        
        //Declarando os lutadores
        lutador[0] = new Lutadores("Wanderson", "Brasil",25, 1.73, 80, 21, 0, 2 );
        lutador[1] = new Lutadores("Charles","Brasil",22, 1.80, 81, 14, 6, 3);
        lutador[2] = new Lutadores("Chama","Brasil", 25, 1.65, 55, 20, 5, 2);
        lutador[3] = new Lutadores("Jon","EUA",35, 1.85, 90, 25, 4, 3);
        lutador[4] = new Lutadores("Cbum","Canada",27, 1.70, 60, 18, 1, 1);
        
        //Chamando Metodos
        ufc.marcarLuta(lutador[1], lutador[4]);
        ufc.lutar();
        
        lutador[0].status();
    }
}
