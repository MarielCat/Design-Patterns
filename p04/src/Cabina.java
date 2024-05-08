/**
 * La clase abstracta `Cabina` implementa la interfaz `Componente` y define los métodos
 * abstractos relacionados con las características de una cabina, como precio, ataque, defensa,
 * velocidad, peso, nombre y descripción. También proporciona una implementación concreta del
 * método `descripcionCompleta()` que muestra información detallada sobre la cabina.
 */
public abstract class Cabina implements Componente {

    /**
     * Calcula el precio de la cabina.
     *
     * @return El precio de la cabina.
     */
    @Override
    public abstract double precio();

    /**
     * Obtiene el valor de ataque de la cabina.
     *
     * @return El valor de ataque de la cabina.
     */
    @Override
    public abstract int ataque();

    /**
     * Obtiene el valor de defensa de la cabina.
     *
     * @return El valor de defensa de la cabina.
     */
    @Override
    public abstract int defensa();

    /**
     * Obtiene la velocidad de la cabina.
     *
     * @return La velocidad de la cabina.
     */
    @Override
    public abstract int velocidad();

    /**
     * Obtiene el peso de la cabina.
     *
     * @return El peso de la cabina.
     */
    @Override
    public abstract int peso();

    /**
     * Obtiene el nombre de la cabina.
     *
     * @return El nombre de la cabina.
     */
    @Override
    public abstract String nombre();

    /**
     * Obtiene la descripción de la cabina.
     *
     * @return La descripción de la cabina.
     */
    @Override
    public abstract String descripcion();

    /**
     * Muestra una descripción completa de la cabina, incluyendo su nombre, descripción, precio,
     * ataque, velocidad y defensa.
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
