package exe3;

public class Produto
{
    public int id;
    public String descricao;
    public int qtde;
    public float preco;

    public  Produto(String descricao)
    {
        this.descricao = "sem descricao";
    }

    public Produto( int id, String descricao, int qtde, float preco){
        this.id = id;
        this.descricao = descricao;
        this.qtde = qtde;
        this.preco = preco;
    }

    public String exibirDetalhes(){
        return "Produto{" +
                "id=" + id +
                ", qtde= " + qtde +
                ", descrição=" + descricao + '\'' +
                ", preco=" + preco +
                '}';
    }

    public void comprar(int qtde){
        this.qtde = qtde;
        System.out.println("Produto comprado com sucesso!");
    }

    public void subir(float preco){
        this.preco = preco;
    System.out.println("Produto teve o preço elevado.");
    }

    public void vender(float preco){
    }

}
