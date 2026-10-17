//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Inmueble> carteraInmobiliaria = new ArrayList<>();

    carteraInmobiliaria.add(new Casa("Av. San Martín 1240", 180.0, 95000.0, 65.0, 2));
    carteraInmobiliaria.add(new Departamento("Calle Belgrano 450, Depto 7B", 75.0, 65000.0, 120.0, 7));
    carteraInmobiliaria.add(new LocalComercial("Paseo Peatonal Local 12", 110.0, 150000.0, true, "Comercial"));

    System.out.println("==========================================================================================");
    System.out.println("                 REPORTE DE TASACIONES COMERCIALES - CARTERA INMOBILIARIA                 ");
    System.out.println("==========================================================================================\n");

    for (Inmueble inmueble : carteraInmobiliaria) {
        System.out.println(inmueble.obtenerDetalles());
        System.out.printf("-> Tasación Comercial Estimada: $%.2f USD%n", inmueble.calcularTasacionComercial());
        System.out.println("------------------------------------------------------------------------------------------");
    }
}

