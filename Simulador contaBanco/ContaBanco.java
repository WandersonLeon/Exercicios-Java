/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contabanco;

/**
 *
 * @author wande
 */
public class ContaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Conta p1 = new Conta();
       p1.setConta(01);
       p1.setDono("Wanderson");
       p1.abrirConta("CC");
       
       Conta p2 = new Conta();
       p2.setConta(02);
       p2.setDono("Eduarda");
       p2.abrirConta("CP");
       
       p1.depositar(100);
       p1.pagarMensal();
       p1.sacar(30);
       p2.depositar(500);
       
       p1.estadoAtual();
       p2.estadoAtual();
    }
    
}
