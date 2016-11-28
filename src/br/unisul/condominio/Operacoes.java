package br.unisul.condominio;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Operacoes {

    private static final Operacoes INSTANCE = new Operacoes();

    private Operacoes() {
    }

    public static Operacoes getInstance() {
        return INSTANCE;
    }

    public void registroAreaInfantil(AreaComum areaInfantil) {
        int opcao = -1;
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
                
                if(defeito.equals("1")){
                    defeito = "Sim";
                }else{
                    defeito = "Não";
                }

                TV tv = new TV(quantidade, marca, modelo, defeito);
                areaInfantil.setItens(tv);
            } else if (opcao == 2) {
                String tipo = JOptionPane.showInputDialog("Escreva o tipo:");
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

                Brinquedo brinquedo = new Brinquedo(quantidade, tipo, descricao, defeito);
                areaInfantil.setItens(brinquedo);
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    public void registroAreaTeen(AreaComum areaTeen) {
        int opcao = -1;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o item que deseja registrar: "
                    + "\n\n1 - Sofa"
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

                Sofa sofa = new Sofa(quantidade, descricao, defeito);
                areaTeen.setItens(sofa);
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

                Computador computador = new Computador(quantidade, marca, modelo, caracteristicas, defeito);
                areaTeen.setItens(computador);
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    public void registroAreaAdulta(AreaComum areaAdulta) {
        int opcao = -1;
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
                
                if(defeito.equals("1")){
                    defeito = "Sim";
                }else{
                    defeito = "Não";
                }

                Copo copo = new Copo(quantidade, tipo, defeito);
                areaAdulta.setItens(copo);
            } else if (opcao == 2) {
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                    + "\n\n1 - Sim"
                    + "\n2 - Não");
                
                if(defeito.equals("1")){
                    defeito = "Sim";
                }else{
                    defeito = "Não";
                }

                Espeto espeto = new Espeto(quantidade, defeito);
                areaAdulta.setItens(espeto);
            } else if (opcao == 3) {
                String tipo = JOptionPane.showInputDialog("Escreva o tipo:");
                int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Escreva a quantidade:"));
                String defeito = JOptionPane.showInputDialog("O item está com defeito? "
                    + "\n\n1 - Sim"
                    + "\n2 - Não");
                
                if(defeito.equals("1")){
                    defeito = "Sim";
                }else{
                    defeito = "Não";
                }

                Louca louca = new Louca(quantidade, tipo, defeito);
                areaAdulta.setItens(louca);
            } else if (opcao == 0) {
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }
    }

    public void listarItens(AreaComum area1, AreaComum area2, AreaComum area3) {
        String msg = "";

        String tipo = "";
//		while() {
        for (Item item : area1.getItens()) {
            msg += "Item: " + item.getClass().getSimpleName()
                    + "\n" + item
                    + "\n\n";
        }
//		}

        for (Item item : area2.getItens()) {
            msg += "Item: " + item.getClass().getSimpleName()
                    + "\n" + item
                    + "\n\n";
        }
        for (Item item : area3.getItens()) {
            msg += "Item: " + item.getClass().getSimpleName()
                    + "\n" + item
                    + "\n\n";
        }

        System.out.println(msg);
//		JOptionPane.showMessageDialog(null, msg);
    }

    public void listarItens(AreaComum areaComum) {

        String msg = areaComum.getNome()
                + "\n\n";

        for (Item item : areaComum.getItens()) {
            msg += "Item: " + item.getClass().getSimpleName()
                    + "\n" + item
                    + "\n\n";
        }

        JOptionPane.showMessageDialog(null, msg);
    }

    public void listarItens(AreaComum areaComum, int n) {
        n--;
        String itens[] = new String[]{"TV", "Brinquedo", "Sofa", "Computador", "Copo", "Espeto", "Louca"};

        String msg = areaComum.getNome()
                + "\n\n";

        for (Item item : areaComum.getItens()) {
            if (item.getClass().getSimpleName().equals(itens[n])) {
                msg += "Item: " + item.getClass().getSimpleName()
                        + "\n" + item
                        + "\n\n";
            }
        }

        JOptionPane.showMessageDialog(null, msg);
    }

}
