package br.unisul.condominio;

import javax.swing.JOptionPane;

public class AreaInfantil extends AreaComum {

    public AreaInfantil(String nome, int lotacao, int periodoUso) {
        super(nome, lotacao, periodoUso);
    }

    public void registrarItens() {
        int opcao = -1;
        Item item;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o item que deseja registrar: "
                    + "\n\n1 - TV"
                    + "\n2 - Brinquedo"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                String marca = JOptionPane.showInputDialog("Escreva a marca:");
                String modelo = JOptionPane.showInputDialog("Escreva o modelo:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade de TVs:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                        + "\n\n1 - Sim"
                        + "\n2 - Não");

                if (defeito.equals("1")) {
                    defeito = "Sim";
                } else {
                    defeito = "Não";
                }

                item = new TV(quantidade, marca, modelo, defeito);
                getItens().add(item);
            } else if (opcao == 2) {
                String tipo = JOptionPane.showInputDialog("Escreva o tipo:");
                String descricao = JOptionPane.showInputDialog("Escreva a descrição:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                        + "\n\n1 - Sim"
                        + "\n2 - Não");

                if (defeito.equals("1")) {
                    defeito = "Sim";
                } else {
                    defeito = "Não";
                }

                item = new Brinquedo(quantidade, tipo, descricao, defeito);
                getItens().add(item);
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    public void listarItens() {
        int opcao = -1;
        String msg = "";
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o item que deseja listar: "
                    + "\n\n1 - TV"
                    + "\n2 - Brinquedo"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                msg = "";
                for (Item item : getItens()) {
                    if (item instanceof TV) {
                        msg += "Item: " + item.getClass().getSimpleName()
                                + "\n" + item
                                + "\n\n";
                    }
                }
                if (msg != "") {
                    JOptionPane.showMessageDialog(null, msg);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não possui itens cadastrados.");
                }

            } else if (opcao == 2) {
                msg = "";
                for (Item item : getItens()) {
                    if (item instanceof Brinquedo) {
                        msg += "Item: " + item.getClass().getSimpleName()
                                + "\n" + item
                                + "\n\n";
                    }
                }

                if (msg != "") {
                    JOptionPane.showMessageDialog(null, msg);
                } else {
                    JOptionPane.showMessageDialog(null, "Você não possui itens cadastrados.");
                }
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }

    }

    public void listarItensDefeito() {
        String msg = "";
        for (Item item : getItens()) {
            if (item instanceof TV) {
                if (item.getDefeito().equals("Sim")) {
                    msg += "Item: " + item.getClass().getSimpleName()
                            + "\n" + item
                            + "\n\n";
                }
            }
            if (item instanceof Brinquedo) {
                if (item.getDefeito().equals("Sim")) {
                    msg += "Item: " + item.getClass().getSimpleName()
                            + "\n" + item
                            + "\n\n";
                }
            }
        }

        if (msg == "") {
            JOptionPane.showMessageDialog(null, "Você não possui itens com defeito.");
        } else {
            JOptionPane.showMessageDialog(null, msg);

        }

    }
}
