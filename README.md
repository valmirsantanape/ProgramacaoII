<h1>EQUIPE:</h1>

- Bruna Correia Ferreira
- José Valmir de Santana
- Paulo Vinnicius Pereira do Nascimento
- Rebeca Barbosa Nunes da Silva
- Victoria Yolanda Lourenço de Souza


----------------------------------------------------------------------------------------------------------------------------------------

**Repositório criado com objetivo de exercitar os conhecimentos em java e entregar atividade como forma de pontuação para a disciplina de Programação II do curso de Licenciatura em Ciências da Computação da UPE.**

----------------------------------------------------------------------------------------------------------------------------------------


- Crie uma classe Veiculo com os seguintes atributos privados: a. String placa b. String marca c. String modelo d. int ano e. double valor
Implemente métodos getters e setters para todos os atributos. 
Crie um método calcularIpva() que retorne 4% do valor do veículo. 

- Crie uma classe Carro que herde de Veiculo;
Adicione um atributo privado: int numeroPortas;
Implemente getter e setter para o novo atributo;
Sobrescreva o método calcularIpva() para retornar 3.5% do valor.

- Crie uma classe Moto que herde de Veiculo;
Adicione um atributo privado: int cilindradas;
Implemente getter e setter para o novo atributo;
Sobrescreva o método calcularIpva() para retornar 2.5% do valor.

- Crie uma classe Concessionaria com um método main;
Crie um array ou ArrayList para armazenar veículos;
Adicione pelo menos 3 carros e 2 motos ao sistema;

- Crie uma classe Caminhao que herde de Veiculo;
Adicione um atributo privado: double capacidadeCarga (em toneladas);
Sobrescreva o método calcularIpva():
Para capacidade ≤ 5 toneladas: 2% do valor
Para capacidade > 5 toneladas: 3% do valor
