/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeCadastro;

public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, int anoNascimento, double salario) {
        super(nome, anoNascimento);
        this.salario = salario;
    }

    public String retornarDados() {
        return super.retornarDados() + "\tSalário: " + salario;
    }
}