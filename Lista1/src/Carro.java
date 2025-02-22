public class Carro {
    // variáveis
    // cujo tipo de dados são primitivos
    public int ano;
    public float velocidade;
    // cujo tipo de dados são Classes
    public String marca, modelo;
    // método construtor
    public Carro(){
        this.marca = "marca não definida";
        this.modelo = "modelo não definido";
    }
    public Carro(int ano, float velocidade, String marca, String modelo){
        this.ano = ano;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }
    // métodos

    public void exibirDetalhes(){
        // this representa o objeto que chama o método
        System.out.println("Marca: " + this.marca +
                "\n Modelo: " + this.modelo +
                "\n Ano: " + this.ano +
                "\n Velocidade: " + this.velocidade);
    }
}
