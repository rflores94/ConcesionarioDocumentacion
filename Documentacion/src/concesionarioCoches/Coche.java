package concesionarioCoches;
import java.util.regex.Pattern;
/**
 * Clase donde se crean los coches para el concesionario.
 * @author Roberto Carlos Flores Gomez
 * @version 1.0
 */
public class Coche {
	/**
	 * Matr&iacute;cula del coche.
	 * Sigue el patr&oacute;n nuevo: cuatro caracteres num&eacute;ricos y tres letras, separados o no por un gui&oacute;n o un espacio
	 */
	private String matricula;
	
	/**
	 * Color del coche.
	 */
	private Color color;
	
	/**
	 * Modelo del coche.
	 */
	private Modelo modelo;
	
	
	/**
	 * Patr&oacute;n que debe cumplir una matr&iacute;cula
	 */
	static final private Pattern patternMatricula = Pattern.compile("^\\d{4}[ -]?[[B-Z]&&[^QEIOU]]{3}$");

	/**
	 * Constructor de la clase.
	 * @param matricula
	 * @param color
	 * @param modelo
	 */
	private Coche(String matricula, Color color, Modelo modelo) {
		super();
		setMatricula(matricula);
		setColor(color);
		setModelo(modelo);
	}

	/**
	 * Getter matr&iacute;cula
	 * @param matricula
	 */
	private Coche(String matricula) {
		setMatricula(matricula);
	}

	/**
	 * Instancia un coche con todos los par&aacute;metros.
	 * null si algunas de sus caracter&iacute;sticas no son v&aacute;s: color == null, modelo == null &oacute; matr&iacute;cula inv&aacute;lida
	 * @param matricula del coche
	 * @param color del coche
	 * @param modelo del coche
	 * @return crea un nuevo coche con los par&aacute;metros v&aacute;lidos.
	 */
	static Coche instanciarCoche(String matricula, Color color, Modelo modelo) {
		if (esValida(matricula) && color != null && modelo != null)
			return new Coche(matricula, color, modelo);
		return null;
	}

	/**
	 * Instancia un coche solo con el par&aacute;metro matr&iacute;cula.
	 * @param matricula
	 * @return matricula v&aacute;lida
	 */
	static Coche instanciarCoche(String matricula) {
		if (esValida(matricula))
			return new Coche(matricula);
		return null;
	}

	/**
	 * Comprueba mediante un patr&oacute;n que la matr&iacute;cula introducida sea v&aacute;lida.
	 * @param matricula
	 * @return matr&aacute;cula v&aacute;lida.
	 */
	private static boolean esValida(String matricula) {
		return patternMatricula.matcher(matricula).matches();
	}

	/**
	 * Setter Matricula
	 * @param matricula
	 */
	private void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	/**
	 * Getter color
	 * @return color del coche
	 */
	Color getColor() {
		return color;
	}

	/**
	 * Setter color
	 * @param color
	 */
	private void setColor(Color color) {
		this.color = color;
	}

	/**
	 * Setter modelo
	 * @param modelo
	 */
	private void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((matricula == null) ? 0 : matricula.hashCode());
		return result;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/**
	 * matr&iacute;cula. Compara dos coches por su matr&iacute;cula
	 * @param obj coche que se le pasa como par&aacute;metro
	 * @return true si los dos objetos coinciden, false si no coinciden
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Coche other = (Coche) obj;
		if (matricula == null) {
			if (other.matricula != null)
				return false;
		} else if (!matricula.equals(other.matricula))
			return false;
		return true;
	}

	/*
	 * Muestra un coche con todas sus caracter&iacute;sticas.
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "\nCoche [matricula=" + matricula + ", color=" + color
				+ ", modelo=" + modelo + "]";
	}

}
