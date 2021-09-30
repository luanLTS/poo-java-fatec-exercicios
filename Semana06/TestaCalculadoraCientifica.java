public class TestaCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calcC = new CalculadoraCientifica();

        double valor = 144.00;

        System.out.println("Calculo das raízes\n");

        double result = calcC.raiz(81);
        System.out.printf("Resultado raiz com parametro int = %.3f\n", result);

        result = calcC.raiz(valor);
        System.out.printf("Resultado raiz com parametro double = %.3f\n", result);

        result = calcC.raiz("9");
        System.out.printf("Resultado raiz com parametro String = %.3f\n", result);

        System.out.println("\nCalculo das raízes\n");

        result = calcC.potencia(10, 4);
        System.out.printf("Resultado potencia com parametros byte = %.3f\n", result);

        result = calcC.potencia("2", "10");
        System.out.printf("Resultado potencia com parametros String = %.3f\n", result);

        result = calcC.potencia(2, 2.5);
        System.out.printf("Resultado potencia com parametros Int e Double = %.3f\n", result);
    }
}