public class IronCheems extends ArmamentoDecorator {

    public IronCheems(Batallon soldadoDecorado){
        this.soldadoDecorado=soldadoDecorado;
    }
    @Override
    public double getDefensa(){
        return soldadoDecorado.getDefensa()+2;
    }
    @Override
    public String getDescription(){
        return soldadoDecorado.getDescription()+"+ Iron Cheems";
    }
    @Override
    public String getTipoDeSoldado(){
        return soldadoDecorado.getTipoDeSoldado();
    }
    @Override
    public String getFormacion() {
        return soldadoDecorado.getFormacion();
    }
    @Override
    public double getAtaque(){
        return soldadoDecorado.getAtaque()+2;
    }
    @Override
    public double getVelocidad(){
        return soldadoDecorado.getVelocidad()+2;
    }
    @Override
    public void print(Batallon soldado){
        soldadoDecorado.print(soldado);
    }
    @Override
    public String getNameID(){
        return soldadoDecorado.getNameID();
    }
    @Override
    public void printForCreateSoldier(Batallon soldado) {
        soldadoDecorado.printForCreateSoldier(soldado);

    }
    @Override
    public void setFormacionCombate(String formacionCombate) {
        soldadoDecorado.setFormacionCombate(formacionCombate);
    }
}
