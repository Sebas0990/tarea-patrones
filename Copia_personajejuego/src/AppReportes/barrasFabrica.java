package AppReportes;

public class barrasFabrica implements fabricaReportes {
    @Override
    public EXCEL reporteExcel() {
        return new barrasExcel();
    }

    @Override
    public HTML reporteHTML() {
        return new barrasHTML();
    }

    @Override
    public XML reporteXML() {
        return new barrasXML();
    }
}
