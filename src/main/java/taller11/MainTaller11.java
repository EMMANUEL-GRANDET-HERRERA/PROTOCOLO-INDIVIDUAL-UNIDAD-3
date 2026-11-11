package taller11;

public class MainTaller11 {
    public static void main(String[] args) {
        Perro perro = new Perro("Max");
        perro.mostrarNombre();
        perro.hacerSonido();

        Gerente gerente = new Gerente("Ana", 3000000, 500000);
        Vendedor vendedor = new Vendedor("Luis", 1800000, 350000);
        gerente.mostrarDetalles();
        vendedor.mostrarDetalles();

        Figura circulo = new Circulo(5);
        Figura rectangulo = new Rectangulo(4, 6);
        circulo.mostrarArea();
        rectangulo.mostrarArea();
    }
}
