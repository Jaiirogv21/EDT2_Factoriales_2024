package es.studium.Ejercicio3;



public class PruebaEmpleado {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado ();
		empleado1.setNombre("Jairo");
		empleado1.setApellidos("González Vega");
		empleado1.setDni("49135797T");
		empleado1.setDomicilio("Calle Zorzaleña");
		empleado1.setPuesto("Carnicero");
		empleado1.setTelefono(658801781);
		
		System.out.println("El nombre del empleado es: " + empleado1.getNombre() +
				"\nLos apellidos del empleado es: " + empleado1.getApellidos() +
				"\nEl DNI del empleado es: " + empleado1.getDni() +
				"\nEl domicilio del empleado es: " + empleado1.getDomicilio()+
				"\nEl puesto del empleado es: " + empleado1.getPuesto()+
				"\nEl telefono del empleado es: " + empleado1.getTelefono());
		
		Empleado empleado2 = new Empleado ("Jorge", "Sanchéz García", "34231232", "Avda, La Paz, nº 3", "Programador", 954654756);
		System.out.println("El nombre del empleado es: " + empleado2.getNombre() +
				"\nLos apellidos del empleado es: " + empleado2.getApellidos() +
				"\nEl DNI del empleado es: " + empleado2.getDni() +
				"\nEl domicilio del empleado es: " + empleado2.getDomicilio()+
				"\nEl puesto del empleado es: " + empleado2.getPuesto()+
				"\nEl telefono del empleado es: " + empleado2.getTelefono());
		
	}

}
