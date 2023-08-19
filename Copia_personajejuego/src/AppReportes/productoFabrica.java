package AppReportes;

public class productoFabrica implements fabricaReportes {
    @Override
    public EXCEL reporteExcel() {
        return new productoExcel();
    }

    @Override
    public HTML reporteHTML() {
        return new productoHTML();
    }

    @Override
    public XML reporteXML() {
        return new productoXML();
    }
}
