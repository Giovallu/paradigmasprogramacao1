import exe0.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MainCarro {
    public static void main(String[] args) {
        // criando objetos da class
        // instanciar a classe = criando objetos

        Carro obj1 = new Carro(); // chama o construtor
        obj1.ano = 2022;
        obj1.velocidade = 0;
        obj1.marca = "Volkswagen";
        obj1.modelo = "Polo";
        obj1.exibirDetalhes();
        obj1.acelerar(100);
        obj1.exibirDetalhes();
        obj1.frear(10);
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(); // chama o construtor
        obj2.ano = 2024;
        obj2.velocidade = 0;
        obj2.marca = "Ford";
        obj2.modelo = "FastBack";
        obj2.exibirDetalhes();

        Carro obj3 = new Carro(); // chama o construtor
        obj3.exibirDetalhes();

        /*O segundo método construtor serve para facilitar a criação de objetos*/
        Carro obj4 = new Carro(2025, 0, "Chevrolet", "Cruze");
        obj4.exibirDetalhes();
        obj4.frear(10);
        obj4.exibirDetalhes();

    }
}