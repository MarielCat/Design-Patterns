/**
 * La clase `BReforzado` es una implementación concreta de la clase `Blindaje` y representa
 * un tipo de blindaje llamado "Blindaje Reforzado". Este blindaje tiene valores específicos
 * para precio, ataque, defensa, velocidad, peso, nombre y descripción.
 */
public class BReforzado extends Blindaje {

    /**
     * Obtiene el precio del blindaje Reforzado.
     *
     * @return El precio del blindaje Reforzado.
     */
    @Override
    public double precio() {
        return 750.30;
    }

    /**
     * Obtiene el valor de ataque del blindaje Reforzado.
     *
     * @return El valor de ataque del blindaje Reforzado.
     */
    @Override
    public int ataque() {
        return 12;
    }

    /**
     * Obtiene el valor de defensa del blindaje Reforzado.
     *
     * @return El valor de defensa del blindaje Reforzado.
     */
    @Override
    public int defensa() {
        return 500;
    }

    /**
     * Obtiene la velocidad del blindaje Reforzado.
     *
     * @return La velocidad del blindaje Reforzado.
     */
    @Override
    public int velocidad() {
        return 70;
    }

    /**
     * Obtiene el peso del blindaje Reforzado.
     *
     * @return El peso del blindaje Reforzado.
     */
    @Override
    public int peso() {
        return 4000;
    }

    /**
     * Obtiene el nombre del blindaje Reforzado.
     *
     * @return El nombre del blindaje Reforzado.
     */
    @Override
    public String nombre() {
        return "Blindaje Reforzado";
    }

    /**
     * Obtiene la descripción del blindaje Reforzado.
     *
     * @return La descripción del blindaje Reforzado.
     */
    @Override
    public String descripcion() {
        return "Algo pesado, proporciona gran defensa por un costo accesible.";
    }
}
