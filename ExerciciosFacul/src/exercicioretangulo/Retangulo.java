
package exercicioretangulo;

/**
 *
 * @author wande
 */
public class Retangulo {

    private double altura, largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double areaRetangulo() {
        return altura * largura;

    }

    public double perimetroRetangulo() {
        return 2 * (altura + largura);
    }

    public String retornarDados2() {
        String areaFormatada = String.format("%.2f", areaRetangulo());
        String perimetroFormatado = String.format("%.2f", perimetroRetangulo());
        return "Altura: " + altura + "\nLargura: " + largura + "\nÁrea: " + areaFormatada + "\nPerímetro: " + perimetroFormatado;
    }

    public static void main(String[] args) {
        Retangulo r1 = new Retangulo(3.0, 5.0);
        System.out.println(r1.retornarDados2());
    }
}
