
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
    public String toString(){
        return "\n DADOS DO VEÍCULO \n"
                +"\nplaca: " + getPlaca()
                +"\nmarca: " + getMarca()
                +"\nmodelo " + getModelo()
                +"\nano: " + getAno()
                +"\n"+getNumPortas() + " Portas"
                +"\nvalor: " + getValor()
                +"\nIPVA: " + calcularIpva(getValor());
        
    }

}
