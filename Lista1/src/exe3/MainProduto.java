package exe3;


public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto();
        System.out.println(obj1.exibirDetalhes());
        obj1.comprar(3);
        obj1.vender(1);
        obj1.subir(470);
        System.out.println(obj1.exibirDetalhes());

        Produto obj2 = new Produto();
        obj2.exibirDetalhes();
        obj2.vender(12);
        obj2.descer(540);
        obj2.exibirDetalhes();
    }
}
