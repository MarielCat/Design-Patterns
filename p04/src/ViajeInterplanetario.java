/**
 * La clase `ViajeInterplanetario` es una subclase de la clase abstracta `SistemaPropulsion` que
 * representa un sistema de propulsión diseñado para viajes interplanetarios en una nave espacial.
 * Este sistema de propulsión ofrece un equilibrio entre precio y rendimiento, con una velocidad
 * respetable, características de ataque y defensa, y un peso y precio razonables.
 */
public class ViajeInterplanetario extends SistemaPropulsion {

    /**
     * Obtiene el precio del sistema de propulsión para viaje interplanetario.
     *
     * @return El precio del sistema de propulsión para viaje interplanetario.
     */
    @Override
    public double precio() {
        return 3899.99;
    }

    /**
     * Obtiene el valor de ataque del sistema de propulsión para viaje interplanetario.
     *
     * @return El valor de ataque del sistema de propulsión para viaje interplanetario.
     */
    @Override
    public int ataque() {
        return 20;
    }

    /**
     * Obtiene el valor de defensa del sistema de propulsión para viaje interplanetario.
     *
     * @return El valor de defensa del sistema de propulsión para viaje interplanetario.
     */
    @Override
    public int defensa() {
        return 20;
    }

    /**
     * Obtiene la velocidad proporcionada por el sistema de propulsión para viaje interplanetario.
     *
     * @return La velocidad proporcionada por el sistema de propulsión para viaje interplanetario.
     */
    @Override
    public int velocidad() {
        return 1100;
    }

    /**
     * Obtiene el peso del sistema de propulsión para viaje interplanetario.
     *
     * @return El peso del sistema de propulsión para viaje interplanetario.
     */
    @Override
    public int peso() {
        return 100;
    }

    /**
     * Obtiene el nombre del sistema de propulsión para viaje interplanetario.
     *
     * @return El nombre del sistema de propulsión para viaje interplanetario.
     */
    @Override
    public String nombre(){
        return "Sistema de propulsión para viaje interplanetario";
    }

    /**
     * Obtiene una descripción del sistema de propulsión para viaje interplanetario.
     *
     * @return La descripción del sistema de propulsión para viaje interplanetario.
     */
    @Override
    public String descripcion(){
        return "Bueno, bonito y barato.";
    }
}
