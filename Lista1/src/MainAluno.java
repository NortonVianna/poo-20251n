import exe1.Aluno;

public class MainAluno {
    public static void main (String[] args) {
        //instancias uma classe  -> objeto
        Aluno obj1 = new Aluno(); // chama construtor
        obj1.dadosAluno();
        System.out.println(obj1.notaFinal());
        Aluno obj2 = new Aluno(123, 18, 7.6f, 8.9f, "Pedro");
        obj2.dadosAluno();
        System.out.println(obj2.notaFinal());
    }
}

