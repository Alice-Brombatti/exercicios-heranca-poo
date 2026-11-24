public class Notebook extends Produto {
    private int memoriaRAM;

    public Notebook(String nome, double preco, int memoriaRAM) {
        super(nome, preco);
        this.memoriaRAM = memoriaRAM;
    }

    public int getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(int memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    @Override
    public void mostrarProduto() {
        super.mostrarProduto();
        System.out.println("Memória RAM: " + memoriaRAM + " GB");
    }
}
