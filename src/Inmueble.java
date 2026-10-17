public class Inmueble {
    protected String direccion;
    protected double superficieMetros2;
    protected double precioBase;

public Inmueble(String direccion, double superficieMetros2, double precioBase){
    this.direccion = direccion;
    this.superficieMetros2 = superficieMetros2;
    this.precioBase = precioBase;
}

    public double calcularTasacionComercial() {
        return this.precioBase + (this.superficieMetros2 * 1200.0);
    }

    public String obtenerDetalles() {
        return "Dirección: " + this.direccion + " | Superficie: " + this.superficieMetros2 + " m² | Precio Base: $" + this.precioBase + " USD";
    }
}
