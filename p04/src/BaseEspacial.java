/**
 * La clase `BaseEspacial` es una implementación concreta de la clase `Nave` y representa
 * una nave espacial de tipo base. Esta nave espacial tiene métodos para agregar componentes
 * específicos como blindaje, armas, sistema de propulsión y cabina.
 */
public class BaseEspacial extends Nave {

    /**
     * Agrega un blindaje de tipo "BFortaleza" a la base espacial.
     */
    @Override
    public void agregaBlindaje() {
        componentes.add(new BFortaleza());
    }

    /**
     * Agrega un arma de tipo "LaserDestructor" a la base espacial.
     */
    @Override
    public void agregaArmas() {
        componentes.add(new LaserDestructor());
    }

    /**
     * Agrega un sistema de propulsión de tipo "ViajeIntergalactico" a la base espacial.
     */
    @Override
    public void agregaSistemaPropulsion() {
        componentes.add(new ViajeIntergalactico());
    }

    /**
     * Agrega una cabina de tipo "Ejercito" a la base espacial.
     */
    @Override
    public void agregaCabina() {
        componentes.add(new Ejercito());
    }
}
