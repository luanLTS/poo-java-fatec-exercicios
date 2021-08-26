package Semana04;
public class PrimeirosNaturaisDoWhile {
    public static void main(String[] args) {
        int i = 0;
        do {
            System.out.printf("%d\t", i);
        }while(++i < 100);
        System.out.println();
    }
}