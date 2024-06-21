/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca2;

/**
 *
 * @author wande
 */
public abstract class Pessoa {
    //Atributos
    private String nome, sexo;
    private int idade; 
    
    //Metodos
    public final void fazerAniv(){
        this.setIdade(this.getIdade() +1);
    }
    
    //Metodos Getters e Setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return  "Nome= " + nome + ", Sexo= " + sexo + ", Idade= " + idade + '}';
    }
    
}
