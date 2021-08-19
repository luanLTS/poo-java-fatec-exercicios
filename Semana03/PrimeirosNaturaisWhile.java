public class PrimeirosNaturaisWhile {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 100)
            System.out.printf("%d\t", i - 1);
        System.out.println();
    }
}