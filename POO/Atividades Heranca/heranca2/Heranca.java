
package heranca2;

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
    Visitante v1 = new Visitante();
    Aluno a1 = new Aluno();
    Bolsista b1 = new Bolsista();
    Tecnico t1 = new Tecnico();
    
    t1.setNome("Gerivaldo");
    t1.setRegistroProfissional(32211);
    t1.praticar();
    /*
    b1.setNome("Julia");
    b1.setMatricula(3224680);
    b1.setCurso("TI");
    b1.setBolsa(25);
    b1.setIdade(19);
    b1.setSexo("F");
    System.out.println(b1.toString());
    b1.pagarMensalidade();
    
    
    a1.setNome("Roberto");
    a1.setMatricula(3224680);
    a1.setCurso("TI");
    a1.setIdade(33);
    a1.setSexo("M");
    System.out.println(a1.toString());
    a1.pagarMensalidade();
    
    v1.setNome("Gilberto");
    v1.setIdade(21);
    v1.setSexo("M");
    System.out.println(v1.toString());
 */
    }
   
}
