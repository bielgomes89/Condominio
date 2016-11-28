package br.unisul.condominio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class AreaComum {

    private String nome;
    private int lotacao;
    private int periodoUso;

    private List<Item> itens = new ArrayList<Item>();

    public void listarItens() {
        for (Item item : itens) {
            System.out.println(item.toString());
        }
    }

    public void listarItensDefeito() {
        for (Item item : itens) {
            System.out.println(item.toString());
        }
    }

    public AreaComum() {
    }

    public AreaComum(String nome, int lotacao, int periodoUso) {
        this.nome = nome;
        this.lotacao = lotacao;
        this.periodoUso = periodoUso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getPeriodoUso() {
        return periodoUso;
    }

    public void setPeriodoUso(int periodoUso) {
        this.periodoUso = periodoUso;
    }

    public List<Item> getItens() {
        return itens;
    }

    public void setItens(Item item) {
        itens.add(item);
    }

    public void registrarItens() {

    }

    public void gerenciar() {
        int opcao = -1;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o campo que deseja alterar: "
                    + "\n\n1 - Lotação"
                    + "\n2 - Período de uso"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                this.lotacao = Integer.parseInt(JOptionPane.showInputDialog("Escreva a lotação:"));
            } else if (opcao == 2) {
                this.periodoUso = Integer.parseInt(JOptionPane.showInputDialog("Escreva o período de uso:"));
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }
}
