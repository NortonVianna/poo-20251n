package exe0;
public class Carro {


    // modificador de acesso private - variáveis são encapsuladas
    private String marca;
    private String modelo;
    private int ano;
    private float velocidade;

    public Carro() { //co
        this.marca = "sem marca";
        this.modelo = "sem modelo";
    }

    public Carro(String marca, String modelo, int ano, float velocidade) { // usar os setter quando for definir as variáveis no construtor
        this.setMarca(marca);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setVelocidade(velocidade);
    }

    // getters - deve ser público
    public String getMarca() {
        return this.marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public int getAno() {
        return this.ano;
    }

    public float getVelocidade() {
        return this.velocidade;
    }

    // setters - deve ser público
    public void setVelocidade(float velocidade) {
        if (velocidade >= 0){
            this.velocidade = velocidade;
        } else{
            System.out.println("Velocidade não pode ser negativa");
        }
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        if (ano >= 0) {
            this.ano = ano;
        } else{
            System.out.println("O ano não pode ser negativo");
        }
    }

    public String exibeDados() {
        return "Marca: " + this.marca +
                " Modelo: " + this.modelo +
                " Ano: " + this.ano +
                " Velocidade: " + this.velocidade;

    }

    // acelerar
    public void acelerar(float x) {
        this.setVelocidade(this.velocidade + x);
        this.verificaLimite();
    }

    // frear

    public void frear(float x) {
        this.setVelocidade(this.velocidade - x);
    }

    // verifica se o carro ultrapassou 200km/h - se passar, quero que freie
    // o método só pode ser utilizado na própria classe (por ser private)
    private void verificaLimite(){
        if(this.velocidade > 200){
            this.velocidade = 200;
            System.out.println("Velocidade não pode ultrapassar 200");
        }
    }
}
