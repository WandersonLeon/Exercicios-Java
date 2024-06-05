
package ufc;
import java.util.Random;

/**
 *
 * @author wande
 */
public class Luta {
    
    //Atributos
    private Lutadores desafiado;
    private Lutadores desafiante;
    private int rounds;
    private boolean aprovada;
    Random random = new Random();
     
    //Metodos
    public void marcarLuta(Lutadores l1, Lutadores l2){
        if(!l1.getCategoria().equals(l2.getCategoria()) || l1 == l2){
            this.setAprovada(false);
            System.out.println("Impossivel marcar a luta");
            setDesafiado(null);
            setDesafiante(null);
        }else{
            this.setAprovada(true);
            System.out.println("          Luta Marcada");
            setDesafiado(l1);
            setDesafiante(l2);
        }
        
    }
    
    public void lutar(){
        if(getAprovada()){
            System.out.println("No lado esquerdo do corner");
            desafiado.apresentar();
            System.out.println("No lado direito do corner");
            desafiante.apresentar();
            int vencedor = random.nextInt(3);
            System.out.println("======= Resultado da Luta! =======");
            switch (vencedor){
                case 0:
                    System.out.println("             EMPATE!");
                    this.getDesafiado().empatarLuta();
                    this.getDesafiante().empatarLuta();
                    break;
                case 1:
                    System.out.println("    Vitoria do lutador " + this.desafiado.getNome());
                    this.getDesafiado().ganharLuta();
                    this.getDesafiante().perderLuta();
                    break;
                case 2: 
                    System.out.println("    Vitoria do lutador " + this.desafiante.getNome());
                    this.getDesafiante().ganharLuta();
                    this.getDesafiado().perderLuta();
                    break;
            }   
            System.out.println("==================================");
        } else {
            System.out.println("Luta não pode acontecer!");
        }
    }
    
    //Metodos Getters

    public Lutadores getDesafiado() {
        return desafiado;
    }

    public Lutadores getDesafiante() {
        return desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }
    
    //Metodos Setters

    public void setDesafiado(Lutadores desafiado) {
        this.desafiado = desafiado;
    }

    public void setDesafiante(Lutadores desafiante) {
        this.desafiante = desafiante;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
