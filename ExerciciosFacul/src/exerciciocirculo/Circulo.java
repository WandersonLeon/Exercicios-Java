/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciocirculo;

/**
 *
 * @author wande
 */
//Criar a CLASSE CIRCULO e seu metodo
public class Circulo {

    private double raio;

    //Construtor da classe Circulo para armazenar o valor do RAIO
    public Circulo(double raio) {
        this.raio = raio;

    }

    //Metodo para calclar a Área
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    //Metodo para calclar o Perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    //Metodo para retornar uma String com os valores
    public String retornarDados() {
        //Criando uma variavel String para armazenar os valores formatados 
        String areaFormatada = String.format("%.2f", calcularArea());
        String perimetroFormatado = String.format("%.2f", calcularPerimetro());

        return "Raio: " + raio + "\nArea: " + areaFormatada + "\nPerimetro: " + perimetroFormatado;
    }

    public static void main(String[] args) {
        //Instanciando o Objeto c1 da classe Circulo. 
        Circulo c1 = new Circulo(5.0);
        System.out.println(c1.retornarDados());

    }

}
