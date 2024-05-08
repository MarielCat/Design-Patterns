/**
 * Interfaz TransformacionesStrategyDittu que es la Estrategia
 * del patrón Strategy.
 */
public interface TransformacionesStrategyDittu {
    /**
     * Método que expresa en qué Transformación se convirtió el personaje 
	 * @return indicacion de que el personaje se ha transformado
     */
    public String transformarse ();
    /**
     * Método que forma parte de las estrategias del patrón Strategy.
     * Es un ataque simple que recibe un objeto de tipo Personaje para atacar y restarle vida,etc.
     * @param personajeAtacado personaje al que atacaremos
	 * @return indicación de que el personaje ha sido atacado
     */
    public String ataqueEstrategia(Personaje personajeAtacado);
    /**
     * Método getNombreTrans simple que nos ayuda a obtener el nombre
     * de nuestro Personaje ya transformado. 
     * @return indicación del ataque
     */
    public String getNombreTrans();
}
