
package heranca;

/**
 *
 * @author wande
 */
public class Pessoa {
    private String nome, sexo;
    private int idade;
    
    //Metodos basicos
    public void fazerAniv(){
        this.setIdade(getIdade()+1);
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

    @Override
    public String toString() {
        return "Pessoa{" + "nome=" + nome + ", sexo=" + sexo + ", idade=" + idade + '}';
    }
    
    
    
}
