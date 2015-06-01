package concesionarioCoches;
/**
 * Se limitar&aacute;n los colores a tres: plata, rojo y azul. Para solicitar el color
 * al dar de alta al coche podr&aacute; implementarse un m&eacute;todo pedirColor que mediante
 * la gesti&oacute;n de un men&uacute;, devolver&aacute; el color indicado
 * 
 * @author Roberto Carlos Flores Gomez
 * @version 1.0
 */
public enum Color {
	/**
	 * Color plata.
	 */
	PLATA,
	
	/**
	 * Color rojo.
	 */
	ROJO,
	
	/**
	 * Color azul.
	 */
	AZUL;

	/**
	 * Vector los valores de la enumeraci&oacute;n.
	 */
	private static final Color[] VALUES = Color.values();

	/**
	 * Genera un men&uacute; de opciones con los valores de la enumeraci&oacute;n.
	 * @return vector con los valores de la enumeraci&oacute;n.
	 */
	public static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[getValues().length + 1];
		int i = 0;
		for (Color color : getValues()) {
			opcionesMenu[i++] = color.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Utiliza el vector definido anteriormente con los valores de la enumeraci&oacute;n.
	 * @return vector con los valores de la enumeraci&oacute;n.
	 */
	public static Color[] getValues() {
		return VALUES;
	}

}
