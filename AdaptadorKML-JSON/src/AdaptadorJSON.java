public class AdaptadorJSON {
    public Coordenada objetoCoordenada;
    public AdaptadorJSON(Coordenada s1) {
        this.objetoCoordenada = s1;
        setCoordenada1(objetoCoordenada.getCoordenadasJSON().split(" ")[0]);
        setCoordenada2(objetoCoordenada.getCoordenadasJSON().split(" ")[1]);
    }
    public void setCoordenada1(String s1){
        this.Coordenada1 = s1;
    }
    public void setCoordenada2(String s2){
        this.Coordenada2 = s2;
    }
    public String getCoordenada1(){
        return this.Coordenada1;
    }
    public String getCoordenada2(){
        return this.Coordenada2;
    }
    String Coordenada1;
    String Coordenada2;
    String target1 = "-74.2083056";
    String target2 = "4.7174674";

}
