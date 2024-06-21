/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author wande
 */
public class Bolsista extends Aluno{
    //Atributos
    private int bolsa;
    
    //Metodos
    public void pagarBolsa(){
        
    }
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() +" e bolsista! Pagamento facilitado.");
    }
    
    //Metodos simples

    public int getBolsa() {
        return bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }
    
}
