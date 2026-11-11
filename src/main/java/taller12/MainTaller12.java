package taller12;

public class MainTaller12 {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.caminar();
        robot.hablar();

        Coche coche = new Coche();
        coche.encender();
        coche.acelerar();

        Pato pato = new Pato();
        pato.volar();
        pato.nadar();

        Persona persona = new Persona();
        persona.hablar();
        persona.trabajar();

        Animal animal = new Animal();
        animal.volar();
        animal.nadar();
    }
}
