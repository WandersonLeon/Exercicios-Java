
package heranca;

public class Professor extends Pessoa {
    //Atributos
    private String especialidade;
    private double salario;
    
    //Metodos
    public void receberAumento(double aumento){
        this.setSalario(this.getSalario() + aumento);
    }
    
    //Metodos Getters e Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
}
