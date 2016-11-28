package br.unisul.condominio;

import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;

import javax.swing.JOptionPane;

public class Condominio {

    static List<AreaComum> areas = new ArrayList<AreaComum>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int i, opt;
        String msg;
        int opcao = -1;
        while (opcao != 0) {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma ação:"
                    + "\n\n1 - Registrar área comum"
                    + "\n2 - Gerenciar áreas comuns"
                    + "\n3 - Registrar itens"
                    + "\n4 - Listar itens"
                    + "\n5 - Procurar por itens defeituosos"
                    + "\n0 - SAIR"));

            switch (opcao) {
                case 1:
                    registrarAreas();
                    break;

                case 2:
                    msg = "Selecione a área que deseja gerenciar:"
                            + "\n";

                    i = 0;
                    for (AreaComum area : areas) {
                        i++;
                        msg += "\n" + i + " - " + area.getNome();
                    }
                    msg += "\n0 - SAIR";

                    if (areas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Você deve cadastrar uma área comum.");
                        msg = "";
                    } else {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(msg));

                        if (opt > 0 && opt <= i) {
                            areas.get(opt - 1).gerenciar();
                        } else if (opt == 0) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                    }

                    break;

                case 3:
                    msg = "Selecione para qual área que deverá ser realizado o registro:"
                            + "\n";

                    i = 0;
                    for (AreaComum area : areas) {
                        i++;
                        msg += "\n" + i + " - " + area.getNome();
                    }

                    msg += "\n0 - SAIR";

                    if (areas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Você deve cadastrar uma área comum e posteriormente cadastrar os itens.");
                        msg = "";
                    } else {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(msg));

                        if (opt > 0 && opt <= i) {
                            areas.get(opt - 1).registrarItens();
                        } else if (opt == 0) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                    }
                    break;
                case 4:
                    msg = "Selecione a área da qual os itens devem ser listados:"
                            + "\n";

                    i = 0;
                    for (AreaComum area : areas) {
                        i++;
                        msg += "\n" + i + " - " + area.getNome();
                    }
                    msg += "\n0 - SAIR";

                    if (areas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Você deve cadastrar uma área comum e posteriormente cadastrar os itens.");
                        msg = "";
                    } else {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(msg));

                        if (opt > 0 && opt <= i) {
                            areas.get(opt - 1).listarItens();
                        } else if (opt == 0) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                    }

                    break;

                case 5:
                    msg = "Selecione a área da qual os itens com defeito devem ser listados:"
                            + "\n";

                    i = 0;
                    for (AreaComum area : areas) {
                        i++;
                        msg += "\n" + i + " - " + area.getNome();
                    }
                    msg += "\n0 - SAIR";

                    if (areas.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Você deve cadastrar uma área comum e posteriormente cadastrar os itens.");
                        msg = "";
                    } else {
                        opt = Integer.parseInt(JOptionPane.showInputDialog(msg));

                        if (opt > 0 && opt <= i) {
                            areas.get(opt - 1).listarItensDefeito();
                        } else if (opt == 0) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Opção inválida.");
                        }
                    }

                    break;

                case 0:
                    break;

                default:
                    break;
            }
        }
    }

    public static void registrarAreas() {
        String nome = "";
        int lotacao = 0, periodoUso = 0;
        
        int opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione o tipo de área para registrar:"
                + "\n\n1 - Área Infantil"
                + "\n2 - Área Teen"
                + "\n3 - Área Adulta"
                + "\n0 - SAIR"));

        if (opcao > 0 && opcao <= 3) {
            nome = JOptionPane.showInputDialog("Escreva o nome:");
            lotacao = Integer.parseInt(JOptionPane.showInputDialog("Escreva a lotação:"));
            periodoUso = Integer.parseInt(JOptionPane.showInputDialog("Escreva o período de Uso:"));
        }

        if (opcao == 1) {
            areas.add(new AreaInfantil(nome, lotacao, periodoUso));
        } else if (opcao == 2) {
            areas.add(new AreaTeen(nome, lotacao, periodoUso));
        } else if (opcao == 3) {
            areas.add(new AreaAdulta(nome, lotacao, periodoUso));
        } else if (opcao == 0) {
        } else {
            JOptionPane.showMessageDialog(null, "Opção inválida.");
        }
    }

}
