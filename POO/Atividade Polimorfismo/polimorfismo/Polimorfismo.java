/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorfismo;

/**
 *
 * @author wande
 */
public class Polimorfismo {
    public static void main(String[] args) {
        //Instanciando as classes
        Mamifero m1 = new Mamifero();
        Lobo l1 = new Lobo();
        Cachorro c1 = new Cachorro();
        
        m1.emitirSom();
        l1.emitirSom();
        c1.emitirSom();
        c1.reagir("Ola");
        c1.reagir("Vai apanhar");
        c1.reagir(11,45);
        c1.reagir(21, 00);
        c1.reagir(true);
        c1.reagir(false);
        c1.reagir(2, 12.5);
        c1.reagir(17, 4.5);
                
    }
    
}
