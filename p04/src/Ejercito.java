/**
 * La clase `Ejercito` es una implementación concreta de la clase `Cabina` y representa un tipo
 * de cabina llamado "Ejército". Esta cabina tiene valores específicos para precio, ataque,
 * defensa, velocidad, peso, nombre y descripción.
 */
public class Ejercito extends Cabina {

    /**
     * Obtiene el precio de la cabina Ejército.
     *
     * @return El precio de la cabina Ejército.
     */
    @Override
    public double precio() {
        return 6499.99;
    }

    /**
     * Obtiene el valor de ataque de la cabina Ejército.
     *
     * @return El valor de ataque de la cabina Ejército.
     */
    @Override
    public int ataque() {
        return 400;
    }

    /**
     * Obtiene el valor de defensa de la cabina Ejército.
     *
     * @return El valor de defensa de la cabina Ejército.
     */
    @Override
    public int defensa() {
        return 90;
    }

    /**
     * Obtiene la velocidad de la cabina Ejército.
     *
     * @return La velocidad de la cabina Ejército.
     */
    @Override
    public int velocidad() {
        return 30;
    }

    /**
     * Obtiene el peso de la cabina Ejército.
     *
     * @return El peso de la cabina Ejército.
     */
    @Override
    public int peso() {
        return 2100;
    }

    /**
     * Obtiene el nombre de la cabina Ejército.
     *
     * @return El nombre de la cabina Ejército.
     */
    @Override
    public String nombre() {
        return "Ejército";
    }

    /**
     * Obtiene la descripción de la cabina Ejército.
     *
     * @return La descripción de la cabina Ejército.
     */
    @Override
    public String descripcion() {
        return "Un gran ejército aumenta drásticamente el ataque, pero cuidado porque será pesado de llevar.";
    }
}
