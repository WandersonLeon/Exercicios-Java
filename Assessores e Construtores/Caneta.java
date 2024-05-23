
package aula04;

/**
 *
 * @author wande
 */
public class Caneta {
    private String modelo, cor;
    private double ponta;
    private boolean tampada;
    
    public Caneta(String m, String c, double p){
        this.setModelo(m);
        this.setCor(c);
        this.setPonta(p);
        this.destampar();       
    }
    
    public String getModelo(){
        return this.modelo;
    }
    
    public void setModelo(String m){
        this.modelo = m;
    }
    
    public double getPonta(){
        return this.ponta;
    }
    
    public void setPonta(double p){
        this.ponta = p;
    }
    
    public String getCor(){
        return this.cor;
    }
    
    public void setCor(String c){
        this.cor = c;
    }
    
    public boolean getTampada(){
        return this.tampada;
    }
    
    public void setTampada(boolean t){
        this.tampada = t;
    }
    
    public void tampar(){
        this.tampada = true;
    }
    
    public void destampar(){
        this.tampada = false;
    }
    
    public void status(){
        System.out.println("Informacoes sobre a caneta:");
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Cor: " + this.cor);
        if(tampada == true){
            System.out.println("Esta tampada ? Sim ");
        } else {
            System.out.println("Esta tampada ? Nao ");
        }
        
    }
}
