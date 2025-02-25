package exe0;
import javax.swing.*;

public class Carro {
    //classe é composta de variáveis e métodos

    //variáveis
    //do tipo primitivo

    public int ano;

    public float velocidade;

    //do tipo classe

    public String marca, modelo;

    // métodos construtores

    public Carro() {
        this.marca = "Marca Inválida";
        this.modelo = "Modelo Inválida";
    }

    public Carro(int ano, float velocidade, String marca, String modelo) {
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    //métodos
     public void exibirDetalhes(){
         /*this representa o objeto que chama o método */
         JOptionPane.showMessageDialog(null,"Marca: " + this.marca +
                 " \nModelo: " + this.modelo +
                 " \nAno: " + this.ano +
                 " \nVelocidade: " + this.velocidade
                 + "\n________________________________");
     }

     // vai acelerar o carro de x unidades
    public void acelerar(float x){
        this.velocidade = this.velocidade + x;
    }

    public void frear(float x) {
        if (this.velocidade-x <= 0) {
            System.out.println("Impossível frear");
        }else {
            this.velocidade -= x;
        }
    }

}
