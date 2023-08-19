package AppReportes;

public class barrasExcel implements EXCEL{
    @Override
    public void formatoTabla() {
        System.out.println("Tomando TABLAS y convirtiendo en hoja de calculo...");
    }

    @Override
    public void getExtension() {
        System.out.println(".xlsx");
    }

    @Override
    public void mapToCells() {
        System.out.println("_.~\"(_.~\"(_.~\"(_.~\"(_.~\"(");
    }
}
