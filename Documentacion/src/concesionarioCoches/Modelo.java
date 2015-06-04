package concesionarioCoches;
/**
 * Modelos de coches.
 * 
 * @author Roberto Carlos Flores Gomez
 * @version 1.0
 */
public enum Modelo {
	/**
	 * Modelo SERIE1.
	 */
	SERIE1(Marca.BMW),
	
	/**
	 * Modelo SERIE2.
	 */
	SERIE2(Marca.BMW),
	
	/**
	 * Modelo SERIE3.
	 */
	SERIE3(Marca.BMW),
	
	/**
	 * Modelo SERIE5.
	 */
	SERIE5(Marca.BMW),
	
	/**
	 * Modelo CORDOBA.
	 */
	CORDOBA(Marca.SEAT),
	
	/**
	 * Modelo IBIZA.
	 */
	IBIZA(Marca.SEAT),
	
	/**
	 * Modelo TOLEDO.
	 */
	TOLEDO(Marca.SEAT);
	
	/**
	 * Marca de la clase Marca.
	 */
	private Marca marca;

	/**
	 * Recibe el objeto marca.
	 * @param marca del coche.
	 */
	private Modelo(Marca marca) {
		this.marca = marca;
	}

	/**
	 * Devuelve la marca del coche.
	 * @return marca del coche.
	 */
	public Marca getMarca() {
		return marca;
	}

	/**
	 * @return Devuelve el nombre de la enumeraci&oacute;n modelo y la marca.
	 */
	public String toString() {
		return name() + ", " + getMarca();

	}

	// Para el men&uacute;-------------------------------------------------
	/**
	 * Contiene los valores de la enumeraci&oacute;n modelo.
	 */
	private static final Modelo[] VALUES = Modelo.values();

	/**
	 * Genera un men&uacute; de opciones con los valores de la enumeraci&oacute;n Modelo.
	 * @return vector con los valores de la enumeraci&oacute;n.
	 */
	static String[] generarOpcionesMenu() {
		String[] opcionesMenu = new String[VALUES.length + 1];
		int i = 0;
		for (Modelo modelo : VALUES) {
			opcionesMenu[i++] = modelo.name();
		}
		opcionesMenu[i] = "Salir";
		return opcionesMenu;
	}

	/**
	 * Utiliza el vector creado anteriormente con los valores de la enumeraci&oacute;n.
	 * @return vector con valores de la enumeraci&oacute;n Modelo.
	 */
	public static Modelo[] getValues() {
		return VALUES;
	}
	// -------------------------------------------------

}
