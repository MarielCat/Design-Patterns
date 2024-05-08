/**
 * La clase `NaveConstruida` es una subclase de la clase abstracta `Nave` que representa una
 * nave espacial construida sin componentes específicos. En esta implementación, los métodos
 * abstractos para agregar componentes, como blindaje, armas, sistema de propulsión y cabina,
 * se han dejado vacíos. Esta clase podría servir como una base para futuras extensiones que
 * definan naves con componentes concretos.
 */
public class NaveConstruida extends Nave {

    /**
     * Agrega un blindaje a la nave. En esta implementación, el método se deja vacío,
     * lo que significa que la nave construida no tiene blindaje específico.
     */
    @Override
    public void agregaBlindaje() {}

    /**
     * Agrega armas a la nave. En esta implementación, el método se deja vacío,
     * lo que significa que la nave construida no tiene armas específicas.
     */
    @Override
    public void agregaArmas() {}

    /**
     * Agrega un sistema de propulsión a la nave. En esta implementación, el método se deja vacío,
     * lo que significa que la nave construida no tiene un sistema de propulsión específico.
     */
    @Override
    public void agregaSistemaPropulsion() {}

    /**
     * Agrega una cabina a la nave. En esta implementación, el método se deja vacío,
     * lo que significa que la nave construida no tiene una cabina específica.
     */
    @Override
    public void agregaCabina() {}
}
