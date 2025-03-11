package exe2;

public class Cliente {
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;

    public Cliente(){
        this.nome = "Sem nome";
        this.saldo = 0;
    }

    public Cliente(int numeroConta, int numeroAgencia, String nome, float saldo) {
        this.numeroConta = numeroConta;
        this.numeroAgencia = numeroAgencia;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String exibirDetalhes() {
        return "Agência: " + this.numeroAgencia +
                "\nConta: " + this.numeroConta +
                "\nNome: " + this.nome +
                "\nSaldo: " + this.saldo;
    }

    public void depositar(float saldo){
        this.saldo += saldo;
        System.out.println("Depósito realizado com sucesso!");
    }

    public void sacar(float saldo){
        if (this.saldo >= saldo){
            this.saldo -= saldo;
            System.out.println("Sacado realizado com sucesso!");
        }
        else {
            System.out.println("Saldo insuficiente!");
        }
    }

}
