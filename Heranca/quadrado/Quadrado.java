
public class Quadrado extends Retangulo {
    private double lado; 
    protected double largura;
    protected double altura;

    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        if(lado < 0)
            throw new IllegalArgumentException("Lado deve ser maior ou igual a 0");
        this.lado = lado;
        this.largura = lado;
        this.altura = lado;
    }

    public String toString(){
        return "[Quadrado] " + lado;
    }

    public Object area() {
        return lado  * lado;
    }
}
