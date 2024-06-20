/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author wande
 */
public class Aluno extends Pessoa {
    private boolean matricula;
    private String curso;
    
    
    //Metodos basicos
    public void cancMatric(){
    this.setMatricula(!isMatricula());
        System.out.println("A matricula foi cancelada");
    }
    
    
    //Metodos especiais

    public boolean isMatricula() {
        return matricula;
    }

    public void setMatricula(boolean matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }


    
    
    
}
