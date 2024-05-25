/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeCadastro;

public class Pessoa {
    private String nome;
    private int anoNascimento;
    private int idade;

    public Pessoa() {
        this.nome = "[SEM NOME]";
        this.anoNascimento = 1900;
    }

    public Pessoa(String nome, int anoNascimento) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
    }

    public String retornarDados() {
        return "Nome: " + nome + "\tAno nascimento: " + anoNascimento;
    }

    public int calcularIdade(int anoBase) {
        idade = anoBase - anoNascimento;
        return idade;
    }
}