package aula29;


public abstract class FiguraPlana {

    private int lado1;
    private int lado2;

    public FiguraPlana() {
    }

    public FiguraPlana(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    public abstract double getAreaPlana();

    public abstract double getPerimetroPlana();

}
