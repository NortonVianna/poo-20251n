package exe3;

public class Produto {
    public int id, quantidade;
    public String descricao;
    public double preco;

    public Produto(){
        this.descricao = "sem descricao";
    }

    public Produto(int id, String descricao, int quantidade, double preco) {
        this.id = id;
        this.quantidade = quantidade;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void comprar(int x){
        this.quantidade -= x;
        System.out.println(" Compra realizado com sucesso");
    }

    public void subir(float x){
        this.preco += x;
        System.out.println(" Subir de " + x + " realizado com sucesso");
    }

    public void vender(int x){
        if(this.quantidade >= x){
            this.quantidade -= x;
            System.out.println(" Venda realizada com sucesso");
        } else{
            System.out.println(" Impossível realizar a venda");
        }
    }

    public void descer(float x){
        if(this.preco >= x){
            this.preco -= x;
            System.out.println(" Diminuição de " + x + " realizado com sucesso");
        } else {
            System.out.println("Impossível diminuiição de preco");
        }
    }

    public void mostra(){
        System.out.println("ID: " + this.id + " Descrição: " + this.descricao + " Preco: " + this.preco + " Quantidade: " + this.quantidade);
    }
}
