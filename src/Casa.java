public class Casa extends Inmueble{
    private double superficiePatioMetros2;
    private int cantidadPlantas;

    public Casa(String direccion, double superficieMetros2, double precioBase, double superficiePatioMetros2, int cantidadPlantas) {
        super(direccion, superficieMetros2, precioBase);
        this.superficiePatioMetros2 = superficiePatioMetros2;
        this.cantidadPlantas = cantidadPlantas;
    }

    @Override
    public double calcularTasacionComercial() {
        double tasacionBase = super.calcularTasacionComercial();
        double valorPatio = this.superficiePatioMetros2 * 800.0;
        double recargoPlantas = this.cantidadPlantas * 5000.0;
        return tasacionBase + valorPatio + recargoPlantas;
    }

    @Override
    public String obtenerDetalles() {
        return "[Casa] " + super.obtenerDetalles() +
                " | Patio: " + this.superficiePatioMetros2 + " m²" +
                " | Plantas: " + this.cantidadPlantas;
    }
}
