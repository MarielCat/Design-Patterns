/**
 * La clase `BFortaleza` es una implementación concreta de la clase `Blindaje` y representa
 * un tipo de blindaje llamado "Blindaje Fortaleza". Este blindaje tiene valores específicos
 * para precio, ataque, defensa, velocidad, peso, nombre y descripción.
 */
public class BFortaleza extends Blindaje {

    /**
     * Obtiene el precio del blindaje Fortaleza.
     *
     * @return El precio del blindaje Fortaleza.
     */
    @Override
    public double precio() {
        return 900.00;
    }

    /**
     * Obtiene el valor de ataque del blindaje Fortaleza.
     *
     * @return El valor de ataque del blindaje Fortaleza.
     */
    @Override
    public int ataque() {
        return 17;
    }

    /**
     * Obtiene el valor de defensa del blindaje Fortaleza.
     *
     * @return El valor de defensa del blindaje Fortaleza.
     */
    @Override
    public int defensa() {
        return 1000;
    }

    /**
     * Obtiene la velocidad del blindaje Fortaleza.
     *
     * @return La velocidad del blindaje Fortaleza.
     */
    @Override
    public int velocidad() {
        return 30;
    }

    /**
     * Obtiene el peso del blindaje Fortaleza.
     *
     * @return El peso del blindaje Fortaleza.
     */
    @Override
    public int peso() {
        return 10000;
    }

    /**
     * Obtiene el nombre del blindaje Fortaleza.
     *
     * @return El nombre del blindaje Fortaleza.
     */
    @Override
    public String nombre() {
        return "Blindaje Fortaleza";
    }

    /**
     * Obtiene la descripción del blindaje Fortaleza.
     *
     * @return La descripción del blindaje Fortaleza.
     */
    @Override
    public String descripcion() {
        return "La mejor opción si lo que buscas es que tu nave sea prácticamente irrompible.";
    }
}
