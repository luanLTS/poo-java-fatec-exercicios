package Semana04;
import javax.swing.*;

public class MaioridadeTernario {
    public static void main (String[] args) {
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a sua idade: "));
        String ehMaior = idade >= 18 ? "Você é maior de idade!" : "Você é menor de idade.";

        JOptionPane.showMessageDialog(null, ehMaior);
    }
}