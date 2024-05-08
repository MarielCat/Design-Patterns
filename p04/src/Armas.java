/**
 * La clase abstracta `Armas` implementa la interfaz `Componente` y proporciona una base
 * para las clases concretas de armas. Define los métodos abstractos relacionados con las
 * características de un componente, como precio, ataque, defensa, velocidad, peso, nombre
 * y descripción. También proporciona una implementación concreta del método
 * `descripcionCompleta()` que muestra información detallada sobre el arma.
 */
public abstract class Armas implements Componente {

    /**
     * Calcula el precio del arma.
     *
     * @return El precio del arma.
     */
    @Override
    public abstract double precio();

    /**
     * Obtiene el valor de ataque del arma.
     *
     * @return El valor de ataque del arma.
     */
    @Override
    public abstract int ataque();

    /**
     * Obtiene el valor de defensa del arma.
     *
     * @return El valor de defensa del arma.
     */
    @Override
    public abstract int defensa();

    /**
     * Obtiene la velocidad del arma.
     *
     * @return La velocidad del arma.
     */
    @Override
    public abstract int velocidad();

    /**
     * Obtiene el peso del arma.
     *
     * @return El peso del arma.
     */
    @Override
    public abstract int peso();

    /**
     * Obtiene el nombre del arma.
     *
     * @return El nombre del arma.
     */
    @Override
    public abstract String nombre();

    /**
     * Obtiene la descripción del arma.
     *
     * @return La descripción del arma.
     */
    @Override
    public abstract String descripcion();

    /**
     * Muestra una descripción completa del arma, incluyendo su nombre, descripción, precio,
     * ataque, velocidad, y defensa.
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
