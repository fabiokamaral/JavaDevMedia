package aula29;


public class Quadrilatero extends FiguraPlana{

    public Quadrilatero() {
        super();
    }

    public Quadrilatero(int lado1, int lado2) {
        super(lado1, lado2);
    }

    @Override
    public double getAreaPlana() {
        return super.getLado1() * super.getLado2();
    }

    @Override
    public double getPerimetroPlana() {
        return (2 * super.getLado1()) + (2 * super.getLado2());
    }

    public boolean isQuadrado() {
        return super.getLado1() == super.getLado2();
    }

    public boolean isRetangulo() {
        return !isQuadrado();
    }

}
