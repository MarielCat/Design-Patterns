/**
 * La clase `NaveMilitar` es una subclase de la clase abstracta `Nave` que representa
 * un tipo específico de nave espacial llamada "Nave Militar". Esta nave tiene componentes
 * concretos agregados en sus métodos de agregación de componentes, como blindaje reforzado,
 * misiles de plasma, sistema de propulsión de viaje interplanetario y una cabina con tripulación pequeña.
 */
public class NaveMilitar extends Nave {

    /**
     * Agrega un blindaje reforzado a la Nave Militar.
     */
    @Override
    public void agregaBlindaje() {
        componentes.add(new BReforzado());
    }

    /**
     * Agrega misiles de plasma a la Nave Militar.
     */
    @Override
    public void agregaArmas() {
        componentes.add(new MisilesPlasma());
    }

    /**
     * Agrega un sistema de propulsión de viaje interplanetario a la Nave Militar.
     */
    @Override
    public void agregaSistemaPropulsion() {
        componentes.add(new ViajeInterplanetario());
    }

    /**
     * Agrega una cabina con tripulación pequeña a la Nave Militar.
     */
    @Override
    public void agregaCabina() {
        componentes.add(new TripulacionPequeña());
    }
}
