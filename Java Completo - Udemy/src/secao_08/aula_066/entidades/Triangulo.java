package secao_08.aula_066.entidades;

public class Triangulo {

    public double a;
    public double b;
    public double c;

    public double calcularArea(){
        double p = (this.a + this.b + this.c) / 2;
        double area = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        return area;
    }
}
