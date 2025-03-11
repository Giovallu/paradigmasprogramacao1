package exe3;

public class Produto
{
    public int id, qtde;
    public String descricao;
    public float preco;

    public Produto()
    {
        this.descricao = "sem descricao";
    }

    public Produto(int id, String descricao, int qtde, float preco){
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

    public void comprar(int x){
        this.qtde = x;
        System.out.println("Produto comprado com sucesso!");
    }

    public void subir(float x){
        this.preco = x;
        System.out.println("Produto teve o preço elevado.");
    }

    public void vender(float x){
        if (this.qtde >= x){
            this.qtde -= x;
            System.out.println("Vendido");
        }
        else {
            System.out.println("Estoque insuficiente");
        }
    }

    public void descer(float x){
        if (this.preco >= x){
            this.preco -= x;
            System.out.println("Descido");
        }
        else {
            System.out.println("Preço não pode ser negativo");
        }
    }

}
