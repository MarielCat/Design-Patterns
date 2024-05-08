/**
 * La clase `UnPiloto` es una subclase de la clase abstracta `Cabina` que representa una cabina
 * diseñada para un solo piloto en una nave espacial. Esta cabina proporciona beneficios en términos
 * de ataque, defensa, velocidad y peso, con un costo relativamente bajo.
 */
public class UnPiloto extends Cabina {

    /**
     * Obtiene el precio de la cabina diseñada para un solo piloto.
     *
     * @return El precio de la cabina diseñada para un solo piloto.
     */
    @Override
    public double precio() {
        return 200;
    }

    /**
     * Obtiene el valor de ataque proporcionado por la cabina diseñada para un solo piloto.
     *
     * @return El valor de ataque proporcionado por la cabina diseñada para un solo piloto.
     */
    @Override
    public int ataque() {
        return 20;
    }

    /**
     * Obtiene el valor de defensa proporcionado por la cabina diseñada para un solo piloto.
     *
     * @return El valor de defensa proporcionado por la cabina diseñada para un solo piloto.
     */
    @Override
    public int defensa() {
        return 30;
    }

    /**
     * Obtiene la velocidad proporcionada por la cabina diseñada para un solo piloto.
     *
     * @return La velocidad proporcionada por la cabina diseñada para un solo piloto.
     */
    @Override
    public int velocidad() {
        return 20;
    }

    /**
     * Obtiene el peso de la cabina diseñada para un solo piloto.
     *
     * @return El peso de la cabina diseñada para un solo piloto.
     */
    @Override
    public int peso() {
        return 70;
    }

    /**
     * Obtiene el nombre de la cabina diseñada para un solo piloto.
     *
     * @return El nombre de la cabina diseñada para un solo piloto.
     */
    @Override
    public String nombre(){
        return "1 piloto";
    }

    /**
     * Obtiene una descripción de la cabina diseñada para un solo piloto.
     *
     * @return La descripción de la cabina diseñada para un solo piloto.
     */
    @Override
    public String descripcion(){
        return "Un solo piloto contribuye a un peso liviano y un bajo costo.";
    }
}
