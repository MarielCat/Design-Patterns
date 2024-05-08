/**
 * Interfaz del patrón Observer, diseñada para los espectadores 
 * de la pelea
 */
public interface Observador{
	/**
	 * Método al que se llama cuando el estado de un sujeto cambia
	 * @param mensaje mensaje que se le transmitirá al observador 
	 */
	public void actualizar(String mensaje);

}
