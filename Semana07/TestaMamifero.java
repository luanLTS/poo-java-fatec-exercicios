public class TestaMamifero {
    public static void main(String[] args) {
        Cachorro c = new Cachorro("Bidu");
        Gato g = new Gato("Felix");

        System.out.printf("Nome do cachorro: %s\n", c.getNome());
        System.out.printf("Numero de patas: %s\n", c.getQtdPatas());

        System.out.printf("Nome do gato: %s\n", g.getNome());
        System.out.printf("Numero de patas: %s\n", g.getQtdPatas());
    }
}