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
    public double calcularIpva() {
        return getValor * 0.025;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes(); 
        System.out.println("Cilindradas(moto): " + cilindrada);
        System.out.println("IPVA (moto): R$ " + calcularIpva());
    }
}
