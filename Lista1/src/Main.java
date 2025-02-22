public class Main {
    public static void main(String[] args) {
        // criação dos objetos da classe Carro
        // instanciando a classe Carro
        Carro obj1 = new Carro();
        obj1.ano = 2022;
        obj1.velocidade = 0;
        obj1.marca = "Chevrolet";
        obj1.modelo = "Onix";
        obj1.exibirDetalhes();

        Carro obj2 = new Carro(2023, 0, "Fiat", "Argo");
        obj2.exibirDetalhes();

        Carro obj3 = new Carro();
        obj3.exibirDetalhes();
    }
}