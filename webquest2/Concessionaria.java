
import java.util.ArrayList;

public class Concessionaria {
    
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        registrarVeiculo(veiculos, new Carro("ABC-1234", "Toyota", "Corolla", 2022, 120000, 4));
        registrarVeiculo(veiculos, new Carro("XYZ-5678", "Honda", "Civic", 2021, 110000, 4));
        registrarVeiculo(veiculos, new Carro("DEF-9999", "Volkswagen", "Gol", 2019, 50000, 2));
        registrarVeiculo(veiculos, new Moto("MOT-1122", "Yamaha", "MT-07", 2020, 38000, 689));
        registrarVeiculo(veiculos, new Moto("MOT-3344", "Honda", "CG 160", 2023, 15000, 162));
        registrarVeiculo(veiculos, new Caminhao("CAM-5566", "Volvo", "FH 540", 2022, 750000, 25));

        System.out.println("===== LISTA DE VEÍCULOS CADASTRADOS =====\n");
        for (Veiculo v : veiculos) {
            v.exibirInformacoes();
            System.out.println("----------------------------");
        }
    }

   private static void registrarVeiculo(ArrayList<Veiculo> veiculos, Veiculo v) {
        veiculos.add(v);
    }
}
