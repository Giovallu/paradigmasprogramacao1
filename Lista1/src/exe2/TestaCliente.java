package exe2;

public class TestaCliente {
    public static void main(String[] args) {
        Cliente obj1 = new Cliente();
        System.out.println(obj1.exibirDetalhes());
        Cliente obj2 = new Cliente(123,456,"Pedro", 0);
        System.out.println(obj2.exibirDetalhes());
        obj2.depositar(2000);
        obj2.sacar(1200);
        System.out.println(obj2.exibirDetalhes());

        obj1.sacar(300);
    }
}
