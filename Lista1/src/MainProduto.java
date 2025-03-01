import exe3.Produto;

public class MainProduto {
    public static void main(String[] args) {
        Produto obj1 = new Produto();
        obj1.comprar(10);
        obj1.vender(3);
        obj1.subir(872.50f);
        obj1.descer(34.50f);
        obj1.mostra();

        Produto obj2 = new Produto(10, "Bola de baquete", 2, 510);
        obj2.comprar(10);
        obj2.vender(15);
        obj2.subir(30);
        obj2.descer(550);
        obj2.mostra();
    }
}
