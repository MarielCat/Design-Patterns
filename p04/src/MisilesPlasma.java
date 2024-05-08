/**
 * La clase `MisilesPlasma` es una implementación concreta de la clase `Armas` y representa
 * un tipo de arma llamada "Misiles de Plasma". Esta arma tiene valores específicos
 * para precio, ataque, defensa, velocidad, peso, nombre y descripción.
 */
public class MisilesPlasma extends Armas {

    /**
     * Obtiene el precio de los Misiles de Plasma.
     *
     * @return El precio de los Misiles de Plasma.
     */
    @Override
    public double precio() {
        return 1558.99;
    }

    /**
     * Obtiene el valor de ataque de los Misiles de Plasma.
     *
     * @return El valor de ataque de los Misiles de Plasma.
     */
    @Override
    public int ataque() {
        return 2000;
    }

    /**
     * Obtiene el valor de defensa de los Misiles de Plasma.
     *
     * @return El valor de defensa de los Misiles de Plasma.
     */
    @Override
    public int defensa() {
        return 9;
    }

    /**
     * Obtiene la velocidad de los Misiles de Plasma.
     *
     * @return La velocidad de los Misiles de Plasma.
     */
    @Override
    public int velocidad() {
        return 15;
    }

    /**
     * Obtiene el peso de los Misiles de Plasma.
     *
     * @return El peso de los Misiles de Plasma.
     */
    @Override
    public int peso() {
        return 30;
    }

    /**
     * Obtiene el nombre de los Misiles de Plasma.
     *
     * @return El nombre de los Misiles de Plasma.
     */
    @Override
    public String nombre() {
        return "Misiles de Plasma";
    }

    /**
     * Obtiene la descripción de los Misiles de Plasma.
     *
     * @return La descripción de los Misiles de Plasma.
     */
    @Override
    public String descripcion() {
        return "Pesados pero poderosos, buena relación calidad-precio.";
    }
}
