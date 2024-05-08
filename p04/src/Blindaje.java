/**
 * La clase abstracta `Blindaje` implementa la interfaz `Componente` y define los métodos
 * abstractos relacionados con las características de un blindaje, como precio, ataque, defensa,
 * velocidad, peso, nombre y descripción. También proporciona una implementación concreta del
 * método `descripcionCompleta()` que muestra información detallada sobre el blindaje.
 */
public abstract class Blindaje implements Componente {

    /**
     * Calcula el precio del blindaje.
     *
     * @return El precio del blindaje.
     */
    @Override
    public abstract double precio();

    /**
     * Obtiene el valor de ataque del blindaje.
     *
     * @return El valor de ataque del blindaje.
     */
    @Override
    public abstract int ataque();

    /**
     * Obtiene el valor de defensa del blindaje.
     *
     * @return El valor de defensa del blindaje.
     */
    @Override
    public abstract int defensa();

    /**
     * Obtiene la velocidad del blindaje.
     *
     * @return La velocidad del blindaje.
     */
    @Override
    public abstract int velocidad();

    /**
     * Obtiene el peso del blindaje.
     *
     * @return El peso del blindaje.
     */
    @Override
    public abstract int peso();

    /**
     * Obtiene el nombre del blindaje.
     *
     * @return El nombre del blindaje.
     */
    @Override
    public abstract String nombre();

    /**
     * Obtiene la descripción del blindaje.
     *
     * @return La descripción del blindaje.
     */
    @Override
    public abstract String descripcion();

    /**
     * Muestra una descripción completa del blindaje, incluyendo su nombre, descripción, precio,
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
