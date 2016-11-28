package br.unisul.condominio;

import javax.swing.JOptionPane;

public class AreaAdulta extends AreaComum {

    public AreaAdulta(String nome, int lotacao, int periodoUso) {
        super(nome, lotacao, periodoUso);
    }

    public void registrarItens() {
        int opcao = -1;
        Item item;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o item que deseja registrar: "
                    + "\n\n1 - Copo"
                    + "\n2 - Espeto"
                    + "\n3 - Louças"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                String tipo = JOptionPane.showInputDialog("Escreva o tipo:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                        + "\n\n1 - Sim"
                        + "\n2 - Não");

                if (defeito.equals("1")) {
                    defeito = "Sim";
                } else {
                    defeito = "Não";
                }

                item = new Copo(quantidade, tipo, defeito);
                getItens().add(item);
            } else if (opcao == 2) {
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                        + "\n\n1 - Sim"
                        + "\n2 - Não");

                if (defeito.equals("1")) {
                    defeito = "Sim";
                } else {
                    defeito = "Não";
                }

                item = new Espeto(quantidade, defeito);
                getItens().add(item);
            } else if (opcao == 3) {
                String tipo = JOptionPane.showInputDialog("Escreva o tipo:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                        + "\n\n1 - Sim"
                        + "\n2 - Não");

                if (defeito.equals("1")) {
                    defeito = "Sim";
                } else {
                    defeito = "Não";
                }

                item = new Louca(quantidade, tipo, defeito);
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
                    + "\n\n1 - Copo"
                    + "\n2 - Espeto"
                    + "\n3 - Louças"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                msg = "";
                for (Item item : getItens()) {
                    if (item instanceof Copo) {
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
                    if (item instanceof Espeto) {
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
            } else if (opcao == 3) {
                msg = "";
                for (Item item : getItens()) {
                    if (item instanceof Louca) {
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
            if (item instanceof Copo) {
                if (item.getDefeito().equals("Sim")) {
                    msg += "Item: " + item.getClass().getSimpleName()
                            + "\n" + item
                            + "\n\n";
                }
            }

            if (item instanceof Espeto) {
                if (item.getDefeito().equals("Sim")) {
                    msg += "Item: " + item.getClass().getSimpleName()
                            + "\n" + item
                            + "\n\n";
                }
            }

            if (item instanceof Louca) {
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
