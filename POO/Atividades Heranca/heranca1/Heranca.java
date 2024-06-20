
package heranca;

/**
 *
 * @author wande
 */
public class Heranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    // Instanciando objetos
    Pessoa p1 = new Pessoa();
    Aluno p2 = new Aluno();
    Professor p3 = new Professor();
    Funcionario p4 = new Funcionario();
    
    p1.setNome("Josimar");
    p2.setNome("Augostinho");
    p3.setNome("Linguini");
    p4.setNome("Jussara");
    p2.setIdade(18);
    p3.setSexo("M");
    
    p2.setCurso("ADS");
    p3.setSalario(2345.60);
    p4.setSetor("Segurança");
    p3.receberAumento(450.20);
    p4.mudarTrabalho();
    
    
System.out.println(p1.toString());   
System.out.println(p2.toString());    
System.out.println(p3.toString());    
System.out.println(p4.toString());
    }
    
}
