package AppReportes;

public class barrasHTML implements HTML{
    @Override
    public void formatoTabla() {
        System.out.println("Give me some Bootstrap and I'll do it \n C|_|");
    }

    @Override
    public void getExtension() {
        System.out.println(".HTML");
    }

    @Override
    public void ToWeb() {
        System.out.println("DOCTYPE = HTML \n <br><br>");
    }
}
