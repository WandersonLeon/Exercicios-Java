/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author wande
 */
public class Funcionario extends Pessoa {
    //Atributos
    private String setor;
    private  boolean trabalhando = true;
    
    //Metodos
    public void mudarTrabalho(){
      this.setTrabalhando(!this.isTrabalhando());
    }
    
    //Metodos Getters e Setters
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean isTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
    }
    
    
}
