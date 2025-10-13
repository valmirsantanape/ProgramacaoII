
import java.util.Scanner;

public class Concessionaria {
    
    public static void main(String[] args) {

        ArrayList<Veiculo> veiculos = new ArrayList<>();

        adicionarCarros(veiculos);
        adicionarMotos(veiculos);

        System.out.println("===== LISTA DE VEÍCULOS =====\n");
        for (Veiculo v : veiculos) {
            v.exibirInformacoes();
            System.out.println("----------------------------");
        }

    }

    private static void adicionarCarros(ArrayList<Veiculo> veiculos) {
        veiculos.add(new Carro("ABC-1234", "Toyota", "Corolla", 2022, 120000, 4));
        veiculos.add(new Carro("XYZ-5678", "Honda", "Civic", 2021, 110000, 4));
        veiculos.add(new Carro("DEF-9999", "Volkswagen", "Gol", 2019, 50000, 2));
    }

    private static void adicionarMotos(ArrayList<Veiculo> veiculos) {
        veiculos.add(new Moto("MOT-1122", "Yamaha", "MT-07", 2020, 38000, 689));
        veiculos.add(new Moto("MOT-3344", "Honda", "CG 160", 2023, 15000, 162));
    }
        
}
