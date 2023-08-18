import java.util.Scanner;
public class Prueba {
    public static void main(String... args) {
        Kirby gooie = new Kirby();

        gooie.setNombre("Gooie");
        gooie.setRopa("gorrita");
        gooie.setAtaque("cachetada");
        gooie.setDefensa("cubrir");
        gooie.setMagia("hielo");
        gooie.setNivel(2);
        gooie.setPuntosHabilidad(7);
        gooie.setXP(23872);

        System.out.println("nuevo personaje: "+ gooie.getNombre());
        System.out.println("ropa: "+ gooie.getRopa());
        System.out.println("ataque: "+ gooie.getAtaque());
        System.out.println("defensa: "+ gooie.getDefensa());
        System.out.println("magia: "+ gooie.getMagia());
        System.out.println("nivel: "+ gooie.getNivel());
        System.out.println("Puntos de habilidad: "+ gooie.getPuntosHabilidad());
        System.out.println("XP: "+ gooie.getXP());
    }

}
