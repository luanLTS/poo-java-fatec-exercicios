public class Animais {
    private String nome;
    private int qtdPatas;

    Animais() {}

    Animais(String nome) {
        setNome(nome);
    }

    Animais(int qtdPatas, String nome) {
        setNome(nome);
        setQtdPatas(qtdPatas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQtdPatas() {
        return qtdPatas;
    }

    public void setQtdPatas(int qtdPatas) {
        this.qtdPatas = qtdPatas;
    }
}
