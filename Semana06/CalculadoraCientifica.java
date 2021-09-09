public class CalculadoraCientifica {
    public double raiz (int x) {
        return Math.sqrt(x);
    }

    public double raiz (double x) {
        return Math.sqrt(x);
    }

    public double raiz (String x) {
        return Math.sqrt(Double.parseDouble(x));
    }

    public double potencia (byte a, byte b) {
        return Math.pow(a, b); //Mtah.pow faz a potencia do primeiro parametro elevado ao segundos
    }

    public double potencia (String s1, String s2) {
        return Math.pow(Double.parseDouble(s1), Double.parseDouble(s2));
    }

    public double potencia (int a, double b) {
        return Math.pow(a, b);
    }
}