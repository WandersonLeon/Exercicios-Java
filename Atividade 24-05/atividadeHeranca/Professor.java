/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeCadastro;

public class Professor extends Funcionario {
    private String titulacao;

    public Professor(String nome, int anoNascimento, double salario, String titulacao) {
        super(nome, anoNascimento, salario);
        this.titulacao = titulacao;
    }

    public String retornarDados() {
        return super.retornarDados() + "\tTitulação: " + titulacao;
    }
}