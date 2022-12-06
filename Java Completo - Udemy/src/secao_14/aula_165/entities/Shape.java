package secao_14.aula_165.entities;

import secao_14.aula_165.entities.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(){
    }

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();
}
