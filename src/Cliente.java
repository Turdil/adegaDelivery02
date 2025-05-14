import javax.swing.*;

public class Cliente {
    private String nome;
    private String cpf;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void testaCpf() {
        if (cpf.length() == 11) {
            JOptionPane.showMessageDialog(null, "CPF válido");
        } else {
            JOptionPane.showMessageDialog(null, "CPF inválido");
        }
    }

    public void minusculo() {
        JOptionPane.showMessageDialog(null, nome.toLowerCase());
    }

    public void comprarProduto(Produto produto) {
        if (produto instanceof ProdutoRestrito && idade < 18) {
            JOptionPane.showMessageDialog(null, "Produto '" + produto.getNome() + "' NÃO PODE ser vendido para menores de idade.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto '" + produto.getNome() + "' vendido com sucesso por R$" + produto.getPreco());
        }
    }
}
