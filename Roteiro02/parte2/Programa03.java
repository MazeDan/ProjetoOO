package parte2;
import javax.swing.JOptionPane;

public class Programa03 {
    public static void main(String[] args) {
        System.out.println("Informe seu nome: ");

        String nome = JOptionPane.showInputDialog("informe seu nome: ");
        System.out.println("Nome Informado: " + nome);

        String StrIdade = JOptionPane.showInputDialog("informe sua Idade: ");
        int idade = Integer.parseInt(StrIdade);
        System.out.println("Idade Informada: " + idade);

        JOptionPane.showMessageDialog(null, "Nome Informado: " + nome + "\nIdade Informada: " + idade);

    }
}
