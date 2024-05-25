/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividadeCadastro;

public class Secretaria extends Funcionario {
    private String linguaEstrangeira;

    public Secretaria(String nome, int anoNascimento, double salario, String linguaEstrangeira) {
        super(nome, anoNascimento, salario);
        this.linguaEstrangeira = linguaEstrangeira;
    }

    public String retornarDados() {
        return super.retornarDados() + "\tLíngua Estrangeira: " + linguaEstrangeira;
    }
}