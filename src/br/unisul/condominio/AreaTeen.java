package br.unisul.condominio;

import javax.swing.JOptionPane;

public class AreaTeen extends AreaComum {

    public AreaTeen(String nome, int lotacao, int periodoUso) {
        super(nome, lotacao, periodoUso);
    }

    public void registrarItens() {
        int opcao = -1;
        Item item;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o item que deseja registrar: "
                    + "\n\n1 - Sofá"
                    + "\n2 - Computador"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                String descricao = JOptionPane.showInputDialog("Escreva a descricao:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                    + "\n\n1 - Sim"
                    + "\n2 - Não");
                
                if(defeito.equals("1")){
                    defeito = "Sim";
                }else{
                    defeito = "Não";
                }

                item = new Sofa(quantidade, descricao, defeito);
                getItens().add(item);
            } else if (opcao == 2) {
                String marca = JOptionPane.showInputDialog("Escreva a marca:");
                String modelo = JOptionPane.showInputDialog("Escreva o modelo:");
                String caracteristicas = JOptionPane.showInputDialog("Escreva as características:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                    + "\n\n1 - Sim"
                    + "\n2 - Não");
                
                if(defeito.equals("1")){
                    defeito = "Sim";
                }else{
                    defeito = "Não";
                }

                item = new Computador(quantidade, marca, modelo, caracteristicas, defeito);
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
                    + "\n\n1 - Sofás"
                    + "\n2 - Computadores"
                    + "\n0 - SAIR"));

            if (opcao == 1) {
                msg = "";
                for (Item item : getItens()) {
                    if (item instanceof Sofa) {
                        msg += "Item: " + item.getClass().getSimpleName()
                                + "\n" + item
                                + "\n\n";
                    }
                }

                JOptionPane.showMessageDialog(null, msg);
            } else if (opcao == 2) {
                msg = "";
                for (Item item : getItens()) {
                    if (item instanceof Computador) {
                        msg += "Item: " + item.getClass().getSimpleName()
                                + "\n" + item
                                + "\n\n";
                    }
                }

                JOptionPane.showMessageDialog(null, msg);
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }

    }

    @Override
    public void listarItensDefeito() {
        String msg = "";
        for (Item item : getItens()) {
            if (item instanceof Sofa) {
                if (item.getDefeito().equals("Sim")) {
                    msg += "Item: " + item.getClass().getSimpleName()
                            + "\n" + item
                            + "\n\n";
                }
            }
            if (item instanceof Computador) {
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
