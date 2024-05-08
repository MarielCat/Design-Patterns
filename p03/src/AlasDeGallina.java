public class AlasDeGallina extends ArmamentoDecorator {

    public AlasDeGallina(Batallon soldadoDecorado) {
        this.soldadoDecorado = soldadoDecorado;
    }

    @Override
    public double getDefensa() {
        return soldadoDecorado.getDefensa() - 1;
    }
    @Override
    public String getTipoDeSoldado(){
        return soldadoDecorado.getTipoDeSoldado();
    }

    @Override
    public String getDescription() {
        return soldadoDecorado.getDescription() + " + Alas de gallina";
    }

    @Override
    public double getAtaque() {
        return soldadoDecorado.getAtaque();
    }

    @Override
    public double getVelocidad() {
        return soldadoDecorado.getVelocidad() + 2;
    }

    @Override
    public void setFormacionCombate(String formacionCombate) {
        soldadoDecorado.setFormacionCombate(formacionCombate);
    }

    @Override
    public String getNameID() {
        return soldadoDecorado.getNameID();
    }

    @Override
    public String getFormacion() {
        return soldadoDecorado.getFormacion();
    }

    @Override
    public void print(Batallon soldado) {
        soldadoDecorado.print(soldado);
    }
    @Override
    public void printForCreateSoldier(Batallon soldado) {
        soldadoDecorado.printForCreateSoldier(soldado);

    }

}
