package AppReportes;

public class productoExcel implements EXCEL{
    @Override
    public void formatoTabla() {
        System.out.println("We have this and those, with a pinch of maybe and a perhaps");
    }

    @Override
    public void getExtension() {
        System.out.println(".XML");
    }

    @Override
    public void mapToCells() {
        System.out.println("<:3)~~~~ This mouse stole the cheese");

    }
}
