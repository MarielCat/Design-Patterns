/**
 * La clase `TripulaciónPequeña` es una subclase de la clase abstracta `Cabina` que representa
 * una cabina con una tripulación de tamaño reducido para una nave espacial. Esta cabina
 * proporciona beneficios en términos de ataque, defensa, velocidad y peso, con un costo razonable.
 */
public class TripulacionPequeña extends Cabina {

    /**
     * Obtiene el precio de la cabina de tripulación pequeña.
     *
     * @return El precio de la cabina de tripulación pequeña.
     */
    @Override
    public double precio() {
        return 999.99;
    }

    /**
     * Obtiene el valor de ataque proporcionado por la cabina de tripulación pequeña.
     *
     * @return El valor de ataque proporcionado por la cabina de tripulación pequeña.
     */
    @Override
    public int ataque() {
        return 120;
    }

    /**
     * Obtiene el valor de defensa proporcionado por la cabina de tripulación pequeña.
     *
     * @return El valor de defensa proporcionado por la cabina de tripulación pequeña.
     */
    @Override
    public int defensa() {
        return 70;
    }

    /**
     * Obtiene la velocidad proporcionada por la cabina de tripulación pequeña.
     *
     * @return La velocidad proporcionada por la cabina de tripulación pequeña.
     */
    @Override
    public int velocidad() {
        return 50;
    }

    /**
     * Obtiene el peso de la cabina de tripulación pequeña.
     *
     * @return El peso de la cabina de tripulación pequeña.
     */
    @Override
    public int peso() {
        return 350;
    }

    /**
     * Obtiene el nombre de la cabina de tripulación pequeña.
     *
     * @return El nombre de la cabina de tripulación pequeña.
     */
    @Override 
    public String nombre(){
        return "Tripulación pequeña";
    }

    /**
     * Obtiene una descripción de la cabina de tripulación pequeña.
     *
     * @return La descripción de la cabina de tripulación pequeña.
     */
    @Override
    public String descripcion(){
        return "Una tripulación pequeña para aumentar el ataque y la defensa por un precio razonable.";
    }
}
