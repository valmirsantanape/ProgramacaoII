
public class Carro extends Veiculo{    
    
    private int numPortas;

    public Carro(){

    }

    public Carro(int numPortas) {
        this.numPortas = numPortas;
    }

    public Carro(String placa, String marca, String modelo, int ano, double valor, int numPortas) {
        super(placa, marca, modelo, ano, valor);
        this.numPortas = numPortas;
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    @Override
    public double calcularIpva(double valor){
        return valor * 0.035;
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Número de portas(carro): " + numPortas);
    }
   
}
