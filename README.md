Este programa está diseñado para modelar un sistema de gestión inmobiliaria y tasación de propiedades aplicando los pilares fundamentales de la programación orientada a objetos en Java: herencia, encapsulamiento, reutilización mediante la palabra clave super y polimorfismo a través de la sobrescritura de métodos (@Override) para calcular el valor de mercado aplicando factores multiplicadores y coeficientes específicos según la tipología del inmueble.

A continuación se detalla exactamente lo que hace cada parte del programa:

Define la clase base Inmueble: Concentra los atributos protegidos comunes a cualquier propiedad (direccion, superficieMetros2 y precioBase), provee un constructor centralizado y define un método base para la estimación de tasación comercial.

Desarrollar las clases hijas (Casa, Departamento y LocalComercial): Extienden de Inmueble incorporando sus atributos particulares y especializados (superficie de patio y cantidad de plantas para la casa; monto de expensas mensuales y piso de ubicación para el departamento; metros de vidriera a la calle y zonificación municipal para el local comercial).

Sobrescribe el método de tasación: Cada subclase implementa su propia regla de negocio matemática para ponderar el valor comercial en función de factores exclusivos (como plusvalía de terreno, categoría de expensas o coeficiente de vidriera comercial).

Ejecuta la prueba en el main: Crea una lista polimórfica de inmuebles de distintas categorías, invoca dinámicamente sus cálculos de tasación y despliega un reporte consolidado por consola.
