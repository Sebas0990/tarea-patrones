package AppReportes;

public class productoXML implements XML{
    @Override
    public void formatoTabla() {
        System.out.println("We have this and those, with a pinch of maybe and a perhaps");

    }

    @Override
    public void getExtension() {
        System.out.println(".XML");
    }

    @Override
    public void getUniqueToXML() {
        System.out.println("Off-brand CSV");
    }
}
