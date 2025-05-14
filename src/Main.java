//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Main.java

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        cliente.setCpf(JOptionPane.showInputDialog("Digite o CPF"));
        cliente.setNome(JOptionPane.showInputDialog("Digite seu nome"));
        cliente.setIdade(Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade")));

        cliente.testaCpf();
        cliente.minusculo();

        // Criar produtos
        Produto bebida = new Bebida("Cerveja", 15.0);
        Produto cigarro = new Cigarro("Marlboro", 12.0);
        Produto suco = new Produto("Suco de Laranja", 8.0);

        // Testar compras
        cliente.comprarProduto(bebida);
        cliente.comprarProduto(cigarro);
        cliente.comprarProduto(suco);
    }
}
