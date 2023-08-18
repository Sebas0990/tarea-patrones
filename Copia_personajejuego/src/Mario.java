import Clases.Arquero;
import Clases.Guerrero;

public class Mario implements Personajes, Arquero, Guerrero {
    private String nombre;
    private String ropa;
    private String ataque;
    private String defensa;
    private String magia;
    private int nivel;
    private int puntos;
    private int experiencia;
    public Mario(){}
    public Arquero Arco() {
        return null;
    }

    @Override
    public void setNombre(String n) {
        this.nombre = n;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setRopa(String r) {
        this.ropa = r;
    }

    @Override
    public String getRopa() {
        return ropa;
    }

    @Override
    public void setAtaque(String a) {
        this.ataque = a;
    }

    @Override
    public String getAtaque() {
        return ataque;
    }

    @Override
    public void setDefensa(String d) {
        this.defensa = d;
    }

    @Override
    public String getDefensa() {
        return defensa;
    }

    @Override
    public void setMagia(String m) {
        this.magia = m;
    }

    @Override
    public String getMagia() {
        return magia;
    }

    @Override
    public void setNivel(int n) {
        this.nivel = n;
    }

    @Override
    public int getNivel() {
        return nivel;
    }

    @Override
    public void setPuntosHabilidad(int p) {
        this.puntos = p;
    }

    @Override
    public int getPuntosHabilidad() {
        return puntos;
    }

    @Override
    public void setXP(int xp) {
        this.experiencia = xp;
    }

    @Override
    public int getXP() {
        return experiencia;
    }


    @Override
    public Personajes clonar() {
        Personajes personaje = new Mario();
        personaje.setNombre(this.nombre);
        personaje.setRopa(this.ropa);
        personaje.setAtaque(this.ataque);
        personaje.setDefensa(this.defensa);
        personaje.setMagia(this.magia);
        personaje.setNivel(this.nivel);
        personaje.setPuntosHabilidad(this.puntos);
        personaje.setXP(this.experiencia);
        return personaje;
    }

    @Override
    public Guerrero Espada() {
        return null;
    }
}
