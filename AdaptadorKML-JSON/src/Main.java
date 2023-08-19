import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Coordenada objetoCoordenada = new Coordenada();
        System.out.println("Digite las 2 coordenadas separadas por espacio");
        System.out.println(DataBaseSims.JSONDatabaseSim);
        objetoCoordenada.setCoordenadasJSON(scanner.nextLine());
        AdaptadorJSON adaptadorJSON = new AdaptadorJSON(objetoCoordenada);
        String t1 = adaptadorJSON.target1;
        String t2 = adaptadorJSON.target2;
        String KML = DataBaseSims.KMLRecieveSim;
        String KMLFix1 = KML.replace(t1, adaptadorJSON.Coordenada1);
        String KMLOutput = KMLFix1.replace(t2, adaptadorJSON.Coordenada2);
        System.out.println(KMLOutput);
    }
}