public interface Personajes {
    public void setNombre(String n);
    public String getNombre();
    public void setRopa(String r);
    public String getRopa();
    public void setAtaque(String a);
    public String getAtaque();
    public void setDefensa(String d);
    public String getDefensa();
    public void setMagia(String m);
    public String getMagia();
    public void setNivel(int n);
    public int getNivel();
    public void setPuntosHabilidad(int p);
    public int getPuntosHabilidad();
    public void setXP(int xp);
    public int getXP();
    public Personajes clonar();
}
