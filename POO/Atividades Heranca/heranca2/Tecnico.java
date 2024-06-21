/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author wande
 */
public class Tecnico extends Aluno{
    //Atributos
    private int registroProfissional;
    
    
    //Metodos
    public void praticar(){
        System.out.println("O aluno " +this.getNome() + " com Registro Profissional " + this.getRegistroProfissional() + " esta praticando");
    }
    
    //Metodos Simples

    public int getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(int registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
}
