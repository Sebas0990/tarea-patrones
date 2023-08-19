package AppReportes;

public class barrasXML implements XML {
    @Override
    public void formatoTabla() {
        System.out.println("Pretty table here");
    }

    @Override
    public void getExtension() {
        System.out.println(".XML");
    }

    @Override
    public void getUniqueToXML() {
        System.out.println("I truly have no idea what to do to distinguish XMLs");
    }
}
