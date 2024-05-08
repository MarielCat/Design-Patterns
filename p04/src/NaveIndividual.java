/**
 * La clase `NaveIndividual` es una subclase de la clase abstracta `Nave` que representa
 * un tipo específico de nave espacial predeterminada llamada "Nave Individual". Esta nave 
 * tiene componentes concretos agregados en sus métodos de agregación de componentes, como blindaje, armas,
 * sistema de propulsión y cabina.
 */
public class NaveIndividual extends Nave {

    /**
     * Agrega un blindaje simple a la Nave Individual.
     */
    @Override
    public void agregaBlindaje() {
        componentes.add(new BSimple());
    }

    /**
     * Agrega un láser simple a la Nave Individual.
     */
    @Override
    public void agregaArmas() {
        componentes.add(new LaserSimple());
    }

    /**
     * Agrega un sistema de propulsión de viaje intercontinental a la Nave Individual.
     */
    @Override
    public void agregaSistemaPropulsion() {
        componentes.add(new ViajeIntercontinental());
    }

    /**
     * Agrega una cabina con un piloto a la Nave Individual.
     */
    @Override
    public void agregaCabina() {
        componentes.add(new UnPiloto());
    }
}
