public class Moto extends Veiculo{
    private int cilindrada;

    public Moto(){

    }
    public Moto(String placa, String marca,String modelo, int ano, double valor, int cilindrada) {
        super(placa, marca, modelo, ano, valor);
        this.cilindrada = cilindrada;
    }

    public int getCilindrada(){
        return cilindrada;
    }
    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularIpva(double valor) {
        return valor * 0.025;
    }
    @Override
    public String toString(){
        return "*VEICULO CADASTRADO* \n"
        +"\nplaca: " + getPlaca()
        +"\nmarca: " + getMarca()
        +"\nmodelo: " + getModelo()
        +"\nano: " +  getAno()
        +"\nvalor: " + getValor()
        +"\n" + getCilindrada() + "\nCilindradas: " 
        +"\nIPVA Anual: " + calcularIpva(getValor());
    }
}
