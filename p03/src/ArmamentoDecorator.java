public abstract class ArmamentoDecorator extends Batallon {

    Batallon soldadoDecorado;

	/**
	 * Método que devuelve el soldado envuelto.
	 * @return Batallon 
	 */
	public Batallon getSoldado(){
		return soldadoDecorado.getSoldado();
	}

    abstract public String getDescription();

    abstract public double getAtaque();

    abstract public double getVelocidad();

    abstract public double getDefensa();

    abstract public String getFormacion();

    abstract public void print(Batallon soldado);
    
    abstract public void printForCreateSoldier(Batallon soldado);

    abstract public void setFormacionCombate(String formacionCombate);

    abstract public String getNameID();

    abstract public String getTipoDeSoldado();
}
