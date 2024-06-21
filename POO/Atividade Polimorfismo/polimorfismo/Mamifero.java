package polimorfismo;
public class Mamifero extends Animal{
    //Atributos
    private String corPelo;
    
    //Metodos
    @Override
    public void emitirSom() {
        System.out.println("Som de Mamifero!");
    }

   
}
