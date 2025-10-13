
import java.util.Scanner;

public class Concessionaria {
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
    
        
        
        String marca;
        String modelo;
        String placa;
        int ano;
        double valor;
        int numPortas;
        int cilindradas;
        double capacidadeCarga;
       
        Carro[] carro = new Carro[3];
        System.out.println("*\nCADASTRO DE CARRO*\n");
        
        for (int i = 1; i < carro.length + 1; i++) {
                    System.out.printf("Castastre o %dº Carro\n", i);
                    
                    System.out.print("Informe a marca do veículo: ");
                    marca = sc.next();
                    
                    System.out.print("Informe o modelo do veículo: ");
                    modelo = sc.next();
                    
                    System.out.print("Informe a placa do veículo (AAA0000): ");
                    placa = sc.next();
                    
                    System.out.print("Informe o ano do veículo: ");
                    ano = sc.nextInt();
                    
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                    
                    System.out.print("Número de portas do veículo:  \n");
                    numPortas = sc.nextInt();
                    
                    carro[i] = new Carro( placa, marca, modelo, ano, valor, numPortas);
                    System.out.println();
        }
        System.out.printf(carro.toString()) ;
    

        Moto[] moto = new Moto[2];
        System.out.println("\nCADASTRO DE MOTOS");
        
        for (int i = 1; i < moto.length + 1; i++) {
            
                    System.out.printf("Castastre a %dº Moto\n", i);
                    System.out.print("Informe a marca do veículo: ");
                    marca = sc.next();
                    
                    System.out.print("Informe o modelo do veículo: ");
                    modelo = sc.next();
                    
                    System.out.print("Informe a placa do veículo (AAA0000): ");
                    placa = sc.next();
                    
                    System.out.print("Informe o ano do veículo: ");
                    ano = sc.nextInt();
                    
                    System.out.print("Valor: ");
                    valor = sc.nextDouble();
                    
                    System.out.print("Informe as cilindradas da moto: ");
                    cilindradas = sc.nextInt();
                    
                    moto[i] = new Moto( placa, marca, modelo, ano, valor, cilindradas);
                    System.out.println();
                    
        }
        System.out.println(moto.toString());

        
        Caminhao[] caminhao = new Caminhao[1];
        System.out.println("*\nCADASTRO DE CAMINHÃO*\n");
       
        for(int  i = 1; i <= caminhao.length + 1; i++){
            System.out.print("Placa: ");
            placa = sc.next();
            System.out.print("Marca: ");
            marca = sc.next();
            System.out.print("Modelo: ");
            modelo = sc.next();
            System.out.print("Ano: ");
            ano = sc.nextInt();
            System.out.print("Valor: ");
            valor = sc.nextDouble();
            System.out.print("Capacidade de carga: ");
            capacidadeCarga = sc.nextDouble();

            caminhao[i]  = new Caminhao(placa, marca, modelo, ano, valor, capacidadeCarga);
        }
        System.out.println(caminhao.toString());
        sc.close();
        
    }

        
}
