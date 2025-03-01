package exe2;

public class Cliente {
    public int nroAgencia, nroConta;
    public String nome;
    public float saldo;

    // método constutor sem parâmetro
    public Cliente(){
        this.nome = "sem nome";
    }

    public Cliente(int nroAgencia, int nroConta, String nome, float saldo) {
        this.nroAgencia = nroAgencia;
        this.nroConta = nroConta;
        this.nome = nome;
        this.saldo = saldo;
    }
    // fazer depósito
    public void depositar(float valor){
        this.saldo += valor;
        System.out.println(" Depósito de " + valor + " realizado com sucesso");
    }
    // fazer saque
    public void sacar (float valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println(" Saque de " + valor + " realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Nro Agência: " + this.nroAgencia + "\nNro Conta: " + this.nroConta + "\nNome: " + this.nome + "\nSaldo: " + this.saldo);
    }
}
