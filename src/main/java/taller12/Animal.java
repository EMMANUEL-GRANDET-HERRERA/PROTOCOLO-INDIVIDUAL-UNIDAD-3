package taller12;

public class Animal implements Volador, Nadador {
    @Override
    public void volar() {
        System.out.println("El animal está volando.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal está nadando.");
    }
}
