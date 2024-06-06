
package pessoa;

/**
 *
 * @author wande
 */
public class Pessoa {
    //Atributos
   private String nome, sexo;
   private int idade;  
   
   //Metodo Construtor

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }

    
    //Metodo comum
    public void fazerAniversario(){
        this.setIdade(this.getIdade()+1);
       
    }
   
    public void status(){
        System.out.print("Meu nome e " + this.getNome());
        System.out.println(", tenho " + this.getIdade() + " anos.");
    }
   
   //Metodos Getters

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }
    
   //Metodos Setters

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;       
    }

    void abrir() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
