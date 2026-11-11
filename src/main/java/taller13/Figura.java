package taller13;

public abstract class Figura {
    public abstract double calcularArea();

    public void mostrarFigura() {
        System.out.println("Área: " + calcularArea());
    }
}
