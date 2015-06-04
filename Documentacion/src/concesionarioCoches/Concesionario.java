package concesionarioCoches;
import java.util.ArrayList;
/**
 * No pueden existir dos coches con la misma matr&iacute;cula en el almac&eacute;n del concesinario.
 * No puede a&ntilde;adirse un coche al concesionario con alguno de sus atributos inv&aacute;lidos.
 * 
 * L&oacute;gicamente, no podr&aacute; a&ntilde;adirse un coche inv&aacute;lido al almac&eacute;n del concesinario).
 * 
 * Han de conocerse todas sus caracter&iacute;sticas, ninguno de los valores puede ser por defecto.
 * 
 * @author Roberto Carlos Flores Gomez
 * @version 1.0
 */
public class Concesionario {
	/**
	 * Colecci&oacute;n de coches.
	 */
	private ArrayList<Coche> almacen = new ArrayList<Coche>();
	
	/**
	 * Nombre del concesionario.
	 */
	private final String nombre = "IES Gran Capit&aacute;n";

	/**
	 * A&ntilde;ade un coche al ArrayList.
	 * @param matricula
	 * @param color
	 * @param modelo
	 * @return true cuando a&ntilde;ade el coche correctamente, false cuando coche es nulo o ya existe el coche.
	 */
	boolean annadir(String matricula, Color color, Modelo modelo) {
		Coche coche = Coche.instanciarCoche(matricula, color, modelo);
		if (coche == null || almacen.contains(coche))
			return false;
		return almacen.add(coche);
	}

	/**
	 * Elimina un coche del ArrayList.
	 * @param matricula
	 * @return true si elimina el coche correctamente, false en otro caso.
	 */
	boolean eliminar(String matricula) {
		return almacen.remove(Coche.instanciarCoche(matricula));
	}

	/**
	 * Cantidad de elementos que contiene el ArrayList
	 * @return n&uacute;mero de elementos que contiene el ArrayList
	 */
	int size() {
		return almacen.size();
	}

	/**
	 * Devuelve un elemento del ArrayList.
	 * @param matricula
	 * @return Coche contenido en el almac&eacute;n, null si no existe
	 */
	Coche get(String matricula) {
		Coche coche = Coche.instanciarCoche(matricula);
		int index = almacen.indexOf(coche);
		if (index != -1) {
			return almacen.get(index);
		}
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Concesionario " + nombre + "[almacen=" + almacen + "]";
	}

	/**
	 * Genera un ArrayList con una lista de coches de un color determinado.
	 * @param color
	 * @return ArrayList con lista de coches.
	 */
	public ArrayList<Coche> getCochesColor(Color color) {
		ArrayList<Coche> arrCochesColor = new ArrayList<Coche>();
		for (Coche coche : almacen) {
			if(coche.getColor()== color)
				arrCochesColor.add(coche);
		}
		return arrCochesColor;
	}

}
