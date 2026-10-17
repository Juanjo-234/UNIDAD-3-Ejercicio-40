public class LocalComercial extends  Inmueble{
    private boolean vidrieraALaCalle;
    private String zonificacionMunicipal; // Ej: Comercial, Industrial, Mixto

    public LocalComercial(String direccion, double superficieMetros2, double precioBase, boolean vidrieraALaCalle, String zonificacionMunicipal) {
        super(direccion, superficieMetros2, precioBase);
        this.vidrieraALaCalle = vidrieraALaCalle;
        this.zonificacionMunicipal = zonificacionMunicipal;
    }

    @Override
    public double calcularTasacionComercial() {
        double tasacionBase = super.calcularTasacionComercial();
        double multiplicadorVidriera = this.vidrieraALaCalle ? 1.35 : 1.0;
        double recargoZonificacion = this.zonificacionMunicipal.equalsIgnoreCase("Comercial") ? 20000.0 : 10000.0;
        return (tasacionBase * multiplicadorVidriera) + recargoZonificacion;
    }

    @Override
    public String obtenerDetalles() {
        String vidrieraStr = this.vidrieraALaCalle ? "Sí" : "No";
        return "[Local Comercial] " + super.obtenerDetalles() +
                " | Vidriera a la calle: " + vidrieraStr +
                " | Zonificación: " + this.zonificacionMunicipal;
    }
}
