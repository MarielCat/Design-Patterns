/**
 * Interfaz SujetoObserver que es el sujeto del patrón Observer.
 */
public interface SujetoObserver{
	/**
	 * Método que agrega espectadores a la lista
	 * @param observador espectador al que agregaremos
	 */
	public void agregarEspectador(Observador observador);
		
	/**
	 * Método que elimina espectadores de la lista
	 * @param observador espectador al que se eliminará
	 */
	public void eliminarEspectador(Observador observador);

	/** 
	 * Método que transmite la pelea a los espectadores en la lista
	 */
	public void notificarObservador(String mensaje);
}
