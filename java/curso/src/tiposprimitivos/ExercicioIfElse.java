package tiposprimitivos;

import javax.swing.JOptionPane;

public class ExercicioIfElse {
    public static void main(String[] args) {
        /*
         * Monte uma classe que vai receber o número de um mês e verifique se é válido
         * e mostre escrito na tela o nome do mês, por exemplo: Usuário digitou 5
         * o programa mostra: Maio. Caso o usuário digite um mês inválido,
         * mostre a mensagem: “Mês inválido”
         */

        int mes = 0;

        String numeroDoMês = JOptionPane.showInputDialog("Digite o número do mês: ");
        mes = Integer.parseInt(numeroDoMês);
        if (mes == 1) {
            JOptionPane.showMessageDialog(null, "Janeiro foi selecionado. ");
        }
        if (mes == 2) {
            JOptionPane.showMessageDialog(null, "Fevereiro foi selecionado. ");
        }
        if (mes == 3) {
            JOptionPane.showMessageDialog(null, "Março foi selecionado. ");
        }
        if (mes == 4) {
            JOptionPane.showMessageDialog(null, "Abril foi selecionado. ");
        }
        if (mes == 5) {
            JOptionPane.showMessageDialog(null, "Maio foi selecionado. ");
        }
        if (mes == 6) {
            JOptionPane.showMessageDialog(null, "Junho foi selecionado. ");
        }
        if (mes == 7) {
            JOptionPane.showMessageDialog(null, "julho foi selecionado. ");
        }
        if (mes == 8) {
            JOptionPane.showMessageDialog(null, "Agosto foi selecionado. ");
        }
        if (mes == 9) {
            JOptionPane.showMessageDialog(null, "Setembro foi selecionado. ");
        }
        if (mes == 10) {
            JOptionPane.showMessageDialog(null, "Outubro foi selecionado. ");
        }
        if (mes == 11) {
            JOptionPane.showMessageDialog(null, "Novembro foi selecionado. ");
        }
        if (mes == 12) {
            JOptionPane.showMessageDialog(null, "Dezembro foi selecionado. ");
        }
        else {
            JOptionPane.showMessageDialog(null, "mês invalido ");
        }
    }

}
