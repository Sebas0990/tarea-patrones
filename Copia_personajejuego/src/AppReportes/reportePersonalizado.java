package AppReportes;

public class reportePersonalizado {
    public void crearReporte(fabricaReportes fabReportes){
        fabReportes.reporteXML();
        fabReportes.reporteHTML();
        fabReportes.reporteExcel();
    }

}
