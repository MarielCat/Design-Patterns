/**
 * La clase `LaserDestructor` es una implementación concreta de la clase `Armas` y representa
 * un tipo de arma llamada "Láser Destructor de Planetas". Esta arma tiene valores específicos
 * para precio, ataque, defensa, velocidad, peso, nombre y descripción.
 */
public class LaserDestructor extends Armas {

    /**
     * Obtiene el precio del Láser Destructor de Planetas.
     *
     * @return El precio del Láser Destructor de Planetas.
     */
    @Override
    public double precio() {
        return 9000;
    }

    /**
     * Obtiene el valor de ataque del Láser Destructor de Planetas.
     *
     * @return El valor de ataque del Láser Destructor de Planetas.
     */
    @Override
    public int ataque() {
        return 7000;
    }

    /**
     * Obtiene el valor de defensa del Láser Destructor de Planetas.
     *
     * @return El valor de defensa del Láser Destructor de Planetas.
     */
    @Override
    public int defensa() {
        return 9;
    }

    /**
     * Obtiene la velocidad del Láser Destructor de Planetas.
     *
     * @return La velocidad del Láser Destructor de Planetas.
     */
    @Override
    public int velocidad() {
        return 10;
    }

    /**
     * Obtiene el peso del Láser Destructor de Planetas.
     *
     * @return El peso del Láser Destructor de Planetas.
     */
    @Override
    public int peso() {
        return 50;
    }

    /**
     * Obtiene el nombre del Láser Destructor de Planetas.
     *
     * @return El nombre del Láser Destructor de Planetas.
     */
    @Override
    public String nombre() {
        return "Láser Destructor de Planetas";
    }

    /**
     * Obtiene la descripción del Láser Destructor de Planetas.
     *
     * @return La descripción del Láser Destructor de Planetas.
     */
    @Override
    public String descripcion() {
        return "No aumenta demasiada velocidad, pero no la necesitarás si, con esto, puedes destruir un planeta entero. ¡Jiji!";
    }
}
