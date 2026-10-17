public class Departamento extends Inmueble{
    private double expensasMensuales;
    private int pisoUbicacion;

    public Departamento(String direccion, double superficieMetros2, double precioBase, double expensasMensuales, int pisoUbicacion) {
        super(direccion, superficieMetros2, precioBase);
        this.expensasMensuales = expensasMensuales;
        this.pisoUbicacion = pisoUbicacion;
    }

    @Override
    public double calcularTasacionComercial() {
        double tasacionBase = super.calcularTasacionComercial();
        double factorPiso = this.pisoUbicacion * 1500.0;
        double ajusteExpensas = this.expensasMensuales * 10.0;
        return tasacionBase + factorPiso - ajusteExpensas;
    }

    @Override
    public String obtenerDetalles() {
        return "[Departamento] " + super.obtenerDetalles() +
                " | Expensas: $" + this.expensasMensuales + " USD" +
                " | Piso: " + this.pisoUbicacion;
    }
}
