package taller13;

public class MainTaller13 {
    public static void main(String[] args) {
        Figura rectangulo = new Rectangulo(5, 4);
        Figura triangulo = new Triangulo(6, 3);
        rectangulo.mostrarFigura();
        triangulo.mostrarFigura();

        Pato pato = new Pato();
        pato.volar();
        pato.nadar();
    }
}
