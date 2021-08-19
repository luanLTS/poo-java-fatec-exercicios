import javax.swing.*;


public class Salario {
    public static void main (String [] args) {
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu salario: "));
        if(salario >= 1100.00)
            JOptionPane.showMessageDialog(null, "Você recebe um ou mais de um salário mínimo!");
        else
            JOptionPane.showMessageDialog(null, "Infelizmente você recebe menos de um salário mínimo");
    }
}