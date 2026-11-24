public class Desenvolvedor extends Funcionario {
    private String linguagemPrincipal;

    public Desenvolvedor(String nome, double salario, String linguagemPrincipal) {
        super(nome, salario);
        this.linguagemPrincipal = linguagemPrincipal;
    }

    public String getLinguagemPrincipal() {
        return linguagemPrincipal;
    }

    public void setLinguagemPrincipal(String linguagemPrincipal) {
        this.linguagemPrincipal = linguagemPrincipal;
    }

    @Override
    public void mostrarFuncionario() {
        super.mostrarFuncionario();
        System.out.println("Linguagem principal: " + linguagemPrincipal);
    }
}
