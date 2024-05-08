/**
 * La clase `BSimple` es una implementación concreta de la clase `Blindaje` y representa
 * un tipo de blindaje llamado "Blindaje Simple". Este blindaje tiene valores específicos
 * para precio, ataque, defensa, velocidad, peso, nombre y descripción.
 */
public class BSimple extends Blindaje {

    /**
     * Obtiene el precio del blindaje Simple.
     *
     * @return El precio del blindaje Simple.
     */
    @Override
    public double precio() {
        return 585.70;
    }

    /**
     * Obtiene el valor de ataque del blindaje Simple.
     *
     * @return El valor de ataque del blindaje Simple.
     */
    @Override
    public int ataque() {
        return 10;
    }

    /**
     * Obtiene el valor de defensa del blindaje Simple.
     *
     * @return El valor de defensa del blindaje Simple.
     */
    @Override
    public int defensa() {
        return 100;
    }

    /**
     * Obtiene la velocidad del blindaje Simple.
     *
     * @return La velocidad del blindaje Simple.
     */
    @Override
    public int velocidad() {
        return 100;
    }

    /**
     * Obtiene el peso del blindaje Simple.
     *
     * @return El peso del blindaje Simple.
     */
    @Override
    public int peso() {
        return 3200;
    }

    /**
     * Obtiene el nombre del blindaje Simple.
     *
     * @return El nombre del blindaje Simple.
     */
    @Override
    public String nombre() {
        return "Blindaje Simple";
    }

    /**
     * Obtiene la descripción del blindaje Simple.
     *
     * @return La descripción del blindaje Simple.
     */
    @Override
    public String descripcion() {
        return "Blindaje liviano para mayor velocidad, no especializado en ataque o defensa.";
    }
}
