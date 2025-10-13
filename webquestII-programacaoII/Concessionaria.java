import java.util.Locale;
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
       
        Carro[] carro = new Carro[3];
        System.out.println("*CADASTRO DE CARRO*\n");
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
                    System.out.printf(carro[i].toString()) ;
                    
                   
            
        }
    
        Moto[] moto = new Moto[2];
        System.out.println("CADASTRO DE MOTOS");
        
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
    
        
        }

        
    }

    
    
        
        
       
        
        
        
        /* 
        moto1.setMarca(marca);
        moto1.setModelo(modelo);
        moto1.setPlaca(placa);
        moto1.setAno(ano);
        moto1.setValor(valor);
        moto1.setCilindrada(cilindradas);

    System.out.println("CARRO: ");
    System.out.println(carro1.getMarca());
    System.out.println(carro1.getModelo());
    System.out.println(carro1.getPlaca());
    System.out.println(carro1.getAno());
    System.out.println(df.format(carro1.getValor()));
    System.out.println(carro1.getNumPortas());
    
    
    System.out.println();
    System.out.println("MOTO: ");
    System.out.println(moto1.getMarca());
    System.out.println(moto1.getModelo());
    System.out.println(moto1.getPlaca());
    System.out.println(moto1.getAno());
    System.out.println(df.format(moto1.getValor()));
    System.out.println(moto1.getCilindrada());
     */


