public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
    public Caminhao(){

    }
    public Caminhao(String placa, String marca, String modelo, int ano, double valor, double capacidadeCarga){
        super(placa, marca, modelo, ano, valor);
        this.capacidadeCarga = capacidadeCarga;
    }
    @Override
    public double calcularIpva(){
        if (getCapacidadeCarga() <= 5) {
            return getValor * 0.02;
        }else{
            return getValor * 0.03;
        }
        
    }

    @Override
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Capacidade da carga(caminhão): " + capacidadeCarga + " toneladas");
        System.out.println("IPVA (caminhão): R$ " + calcularIpva());
    }
  
}
