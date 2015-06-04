package concesionarioCoches;
import utiles.Menu;
import utiles.Teclado;
/**
 * Queremos modelar un concesionario de coches en Java. Nos limitaremos a las
 * siguientes opciones: A&ntilde;adir un coche (se pedir&aacute; matricula, color y modelo),
 * Eliminar un coche (por matr&aacute;cula), mostrar un coche (por matr&iacute;cula), mostrar
 * coches (todo el concesionario)
 * 
 * @author Roberto Carlos Flores Gomez
 * @version 1.0
 */
public class TestConcesionario extends Concesionario {
	
	/**
	 * Men&uacute; para el concesionario.
	 */
	static Menu menu = new Menu("Concesionario de coches", new String[] {"Alta Coche", "Baja Coche", "Mostrar Coche", "Mostrar concesionario", "Contar coches del concesionario", "Mostrar coches de un color", "Salir" });
	
	/**
	 * Men&uacute; con los colores disponibles.
	 */
	private static Menu menuColores = new Menu("Colores de los coches", Color.generarOpcionesMenu());
	
	/**
	 * Variable de clase que muestra un men&uacute; con los modelos disponibles.
	 */
	private static Menu menuModelos = new Menu("Modelos de los coches", Modelo.generarOpcionesMenu());
	
	/**
	 * Instancia de la clase concesionario.
	 */
	static Concesionario concesionario = new Concesionario();

	/**
	 * Permite elegir distintas opciones en funci&oacute;n del men&uacute; mostrado.
	 */
	public static void main(String[] args) {
		do {
			switch (menu.gestionar()) {
			case 1:// "A�adir Coche
				annadirCoche();
				break;
			case 2:// Eliminar Coche
				eliminarCoche();
				break;
			case 3:// Obtener Coche
				getCoche();
				break;
			case 4:// Mostrar lista
				System.out.println(concesionario);
				break;
			case 5:// Contar coches
				System.out.println("N&uacute;mero de coches en el concesionario: "
						+ concesionario.size());
				break;
			case 6:// Mostrar coches de un color
				System.out.println(concesionario.getCochesColor(pedirColor()));
				break;

			default:// Salir
				System.out.println("Adios");
				return;
			}
		} while (true);
	}

	/**
	 * Muestra un coche del concesionario.
	 */
	private static void getCoche() {
		Coche coche = concesionario.get(Teclado
				.leerCadena("Introduce la matr&iacute;cula"));
		if (coche == null)
			System.out.println("No existe el coche en el concesionario.");
		else
			System.out.println(coche);
	}

	/**
	 * Elimina un coche del concesionario.
	 */
	private static void eliminarCoche() {
		if (concesionario.eliminar(Teclado.leerCadena("Introduce la matr&iacute;cula")))
			System.out.println("Coche eliminado");
		else
			System.out.println("No se ha podido eliminar");
	}

	/**
	 * A&ntilde;ade un coche al concesionario.
	 */
	private static void annadirCoche() {
		if (concesionario.annadir(Teclado.leerCadena("Introduce la matr&iacute;cula"),
				pedirColor(), pedirModelo()))
			System.out.println("Coche a&ntilde;adido con &eacute;xito");
		else
			System.out.println("No se ha podido a&ntilde;adir");
	}

	/**
	 * Elige un modelo para asignarlo a un coche.
	 * @return modelo de un coche.
	 */
	private static Modelo pedirModelo() {
		int opcion = menuModelos.gestionar();
		Modelo[] arrModelos = Modelo.getValues();
		if (opcion == arrModelos.length + 1)
			return null;
		return arrModelos[opcion - 1];
	}

	/**
	 * Elige un color para asignarlo a un coche.
	 * @return color de un coche.
	 */
	private static Color pedirColor() {
		int opcion = menuColores.gestionar();
		Color[] arrColores = Color.getValues();
		if (opcion == arrColores.length + 1)
			return null;
		return arrColores[opcion - 1];
	}
}
