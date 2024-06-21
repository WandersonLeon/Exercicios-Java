/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author wande
 */
public class Professor extends Pessoa{
    //Atributos
    private double salario;
    private String especialidade;
    
    //Metodos
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    //Metodos Simples

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
