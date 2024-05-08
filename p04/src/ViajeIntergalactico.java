/**
 * La clase `ViajeIntergalactico` es una subclase de la clase abstracta `SistemaPropulsion` que
 * representa un sistema de propulsión diseñado para viajes intergalácticos en una nave espacial.
 * Este sistema de propulsión es el más poderoso y ofrece una gran velocidad, junto con características
 * de ataque y defensa, pero también tiene un peso y un precio significativamente altos.
 */
public class ViajeIntergalactico extends SistemaPropulsion {

    /**
     * Obtiene el precio del sistema de propulsión para viaje intergaláctico.
     *
     * @return El precio del sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public double precio() {
        return 5699.99;
    }

    /**
     * Obtiene el valor de ataque del sistema de propulsión para viaje intergaláctico.
     *
     * @return El valor de ataque del sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public int ataque() {
        return 30;
    }

    /**
     * Obtiene el valor de defensa del sistema de propulsión para viaje intergaláctico.
     *
     * @return El valor de defensa del sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public int defensa() {
        return 30;
    }

    /**
     * Obtiene la velocidad proporcionada por el sistema de propulsión para viaje intergaláctico.
     *
     * @return La velocidad proporcionada por el sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public int velocidad() {
        return 2000;
    }

    /**
     * Obtiene el peso del sistema de propulsión para viaje intergaláctico.
     *
     * @return El peso del sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public int peso() {
        return 200;
    }

    /**
     * Obtiene el nombre del sistema de propulsión para viaje intergaláctico.
     *
     * @return El nombre del sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public String nombre(){
        return "Sistema de propulsión para viaje intergaláctico";
    }

    /**
     * Obtiene una descripción del sistema de propulsión para viaje intergaláctico.
     *
     * @return La descripción del sistema de propulsión para viaje intergaláctico.
     */
    @Override
    public String descripcion(){
        return "El más poderoso sistema, gran velocidad y obviamente gran precio jeje(Nada cariñoso)";
    }
}
