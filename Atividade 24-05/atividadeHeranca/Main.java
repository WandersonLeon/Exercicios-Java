package atividadeCadastro;

public class Main {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Gabriel", 2001, 323220223);
        Pessoa p2 = new Pessoa("João", 2005);
        Funcionario f1 = new Funcionario("Roberto", 1990, 21000);
        Professor professor = new Professor("Pedro", 1987, 12000, "Mestre");
        Secretaria secretaria = new Secretaria("Maria", 1998, 2900, "ingles");

        System.out.println(p2.retornarDados());
        System.out.println(p2.calcularIdade(2024));

        System.out.println(a1.retornarDados());
        System.out.println(a1.calcularIdade(2024));

        System.out.println(f1.retornarDados());
        System.out.println(f1.calcularIdade(2024));

        System.out.println(professor.retornarDados());
        System.out.println(professor.calcularIdade(2024));

        System.out.println(secretaria.retornarDados());
        System.out.println(secretaria.calcularIdade(2024));
    }
}