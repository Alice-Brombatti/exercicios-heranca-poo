public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Alice", 17, "Técnico em Informática");

        aluno.setIdade(18);

        System.out.println("=== DADOS DO ALUNO ===");
        aluno.apresentar();
    }
}
