/**
 * La clase `ViajeIntercontinental` es una subclase de la clase abstracta `SistemaPropulsion` que
 * representa un sistema de propulsión diseñado para viajes intercontinentales en una nave espacial.
 * Este sistema de propulsión proporciona beneficios en términos de velocidad, con algunas características
 * de ataque y defensa, y tiene un peso y un precio específicos.
 */
public class ViajeIntercontinental extends SistemaPropulsion {

    /**
     * Obtiene el precio del sistema de propulsión para viaje intercontinental.
     *
     * @return El precio del sistema de propulsión para viaje intercontinental.
     */
    @Override
    public double precio() {
        return 2199.99;
    }

    /**
     * Obtiene el valor de ataque del sistema de propulsión para viaje intercontinental.
     *
     * @return El valor de ataque del sistema de propulsión para viaje intercontinental.
     */
    @Override
    public int ataque() {
        return 15;
    }

    /**
     * Obtiene el valor de defensa del sistema de propulsión para viaje intercontinental.
     *
     * @return El valor de defensa del sistema de propulsión para viaje intercontinental.
     */
    @Override
    public int defensa() {
        return 15;
    }

    /**
     * Obtiene la velocidad proporcionada por el sistema de propulsión para viaje intercontinental.
     *
     * @return La velocidad proporcionada por el sistema de propulsión para viaje intercontinental.
     */
    @Override
    public int velocidad() {
        return 860;
    }

    /**
     * Obtiene el peso del sistema de propulsión para viaje intercontinental.
     *
     * @return El peso del sistema de propulsión para viaje intercontinental.
     */
    @Override
    public int peso() {
        return 3000;
    }

    /**
     * Obtiene el nombre del sistema de propulsión para viaje intercontinental.
     *
     * @return El nombre del sistema de propulsión para viaje intercontinental.
     */
    @Override
    public String nombre(){
        return "Sistema de propulsión para viaje intercontinental";
    }

    /**
     * Obtiene una descripción del sistema de propulsión para viaje intercontinental.
     *
     * @return La descripción del sistema de propulsión para viaje intercontinental.
     */
    @Override
    public String descripcion(){
        return "Lo necesario para viajar entre continentes.";
    }
}
