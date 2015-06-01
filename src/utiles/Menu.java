package utiles;
/**
 * Clase utilizada para la gestión de un menú. Se dedica a:
 * 
 * <li>Mostrar las opciones del menú
 * 
 * <li>Recoger y devolver las opciones de un menú
 * 
 * @author Roberto Carlos Flores Gomez
 * @version 1.0
 */
public class Menu {
	String titulo = null;
	String opciones[] = null;
	int numOpciones = 2;

	/**
	 * 
	 * @param titulo t&iacute;tulo del men&uacute;
	 * @param opciones opciones del men&uacute;
	 */
	public Menu(String titulo, String[] opciones) {
		this.titulo = titulo;
		this.opciones = opciones;
		this.numOpciones = this.opciones.length;
	}

	/**
	 * Gestiona el men&uacute;. Consiste en mostrar las opciones y recoger la opci&oacute;n
	 * seleccionada por el usuario
	 * 
	 * @return opci&oacute;n v&aacute;lida del men&uacute;
	 */
	public int gestionar() {
		mostrar();
		return recogerOpcion();
	}

	/**
	 * Muestra las opciones del men&uacute;
	 */
	private void mostrar() {
		int i = 1;
		System.out.println("**" + titulo);
		for (String elemento : opciones)
			System.out.println("(" + (i++) + ") " + elemento);
	}

	/**
	 * Recoge la opci&oacute;n v&aacute;lida del men&uacute;
	 * 
	 * @return opci&oacute;n v&aacute;lida
	 */
	private int recogerOpcion() {
		int opcion;
		do {
			opcion = Teclado.leerEntero();
		} while (opcion < 1 || opcion > numOpciones);
		return opcion;
	}

}
