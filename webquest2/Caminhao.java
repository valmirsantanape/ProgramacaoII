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
    public double calcularIpva(double valor){
        if (getCapacidadeCarga() <= 5) {
            return valor * 0.02;
        }else{
            return valor * 0.03;
        }
        
    }
  
}
