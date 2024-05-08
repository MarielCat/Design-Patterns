/**
 * La clase abstracta `SistemaPropulsion` es una representación genérica de un componente
 * relacionado con el sistema de propulsión de una nave espacial. Esta clase implementa la
 * interfaz `Componente` y define métodos abstractos para características como precio, ataque,
 * defensa, velocidad, peso, nombre y descripción del sistema de propulsión.
 */
public abstract class SistemaPropulsion implements Componente {

    /**
     * Obtiene el precio del sistema de propulsión.
     *
     * @return El precio del sistema de propulsión.
     */
    @Override
    public abstract double precio();

    /**
     * Obtiene el valor de ataque del sistema de propulsión. En un sistema de propulsión,
     * este valor podría no ser relevante, por lo que se deja abstracto.
     *
     * @return El valor de ataque del sistema de propulsión.
     */
    @Override
    public abstract int ataque();
    
    /**
     * Obtiene el valor de defensa del sistema de propulsión. En un sistema de propulsión,
     * este valor podría no ser relevante, por lo que se deja abstracto.
     *
     * @return El valor de defensa del sistema de propulsión.
     */
    @Override
    public abstract int defensa();

    /**
     * Obtiene la velocidad proporcionada por el sistema de propulsión.
     *
     * @return La velocidad proporcionada por el sistema de propulsión.
     */
    @Override
    public abstract int velocidad();

    /**
     * Obtiene el peso del sistema de propulsión.
     *
     * @return El peso del sistema de propulsión.
     */
    @Override
    public abstract int peso();

    /**
     * Obtiene el nombre del sistema de propulsión.
     *
     * @return El nombre del sistema de propulsión.
     */
    @Override
    public abstract String nombre();

    /**
     * Obtiene una descripción del sistema de propulsión.
     *
     * @return La descripción del sistema de propulsión.
     */
    @Override
    public abstract String descripcion();

    /**
     * Muestra una descripción completa del sistema de propulsión, incluyendo todas sus características.
     */
    @Override
    public void descripcionCompleta() {
        System.out.print("**" + nombre() + "**.");
        System.out.println("\nDescripción: " + descripcion() + "." +
                "\nPrecio: $" + precio() + "." +
                "\nAtaque: " + ataque() + " puntos." +
                "\nVelocidad: " + velocidad() + " km/h." +
                "\nDefensa: " + defensa() + " puntos."+
                "\nPeso: "+peso()+" kg.");
    }
}
