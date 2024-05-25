/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeCadastro;

public class Aluno extends Pessoa {
    private int ra;

    public Aluno() {
        ra = 0;
    }

    public Aluno(String nome, int anoNascimento, int ra) {
        super(nome, anoNascimento);
        this.ra = ra;
    }

    public String retornarDados() {
        return super.retornarDados() + "\tRA: " + ra;
    }
}