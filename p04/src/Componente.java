/**
 * La interfaz `Componente` define un conjunto de métodos que representan las características
 * comunes de los componentes utilizados en la construcción de naves.
 */
public interface Componente {

    /**
     * Obtiene el precio del componente.
     *
     * @return El precio del componente.
     */
    public double precio();

    /**
     * Obtiene el valor de ataque del componente.
     *
     * @return El valor de ataque del componente.
     */
    public int ataque();

    /**
     * Obtiene el valor de defensa del componente.
     *
     * @return El valor de defensa del componente.
     */
    public int defensa();

    /**
     * Obtiene la velocidad del componente.
     *
     * @return La velocidad del componente.
     */
    public int velocidad();

    /**
     * Obtiene el peso del componente.
     *
     * @return El peso del componente.
     */
    public int peso();

    /**
     * Obtiene el nombre del componente.
     *
     * @return El nombre del componente.
     */
    public String nombre();

    /**
     * Obtiene la descripción del componente.
     *
     * @return La descripción del componente.
     */
    public String descripcion();

    /**
     * Muestra una descripción completa del componente, incluyendo su nombre, descripción, precio,
     * ataque, velocidad y defensa.
     */
    public void descripcionCompleta();
}
