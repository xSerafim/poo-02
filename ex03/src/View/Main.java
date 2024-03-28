package View;

import javax.swing.JOptionPane;

import Model.AgendaTelefonica;
import Model.Contato;

public class Main {
  public static void main(String[] args) {
    int option = 0;

    AgendaTelefonica agenda = new AgendaTelefonica();

    do {
      option = JOptionPane.showOptionDialog(
          null,
          "Escolha uma opção",
          "Agenda Telefônica",
          JOptionPane.DEFAULT_OPTION,
          JOptionPane.QUESTION_MESSAGE,
          null,
          new String[] { "Adicionar contato", "Remover contato", "Buscar contato", "Sair" },
          null);

      switch (option) {
        case 0:
          adicionarContato(agenda);
          break;
        case 1:
          Contato buscarContato = agenda.buscarContato(JOptionPane.showInputDialog("Digite o email do contato: "));
          if (buscarContato != null) {
            agenda.removerContato(buscarContato.getEmail());
            JOptionPane.showMessageDialog(null, "Contato removido com sucesso");
          } else {
            JOptionPane.showMessageDialog(null, "Contato não encontrado");
          }
          break;
        case 2:
          Contato contato = agenda.buscarContato(JOptionPane.showInputDialog("Digite o email do contato: "));
          if (contato != null) {
            JOptionPane.showMessageDialog(null, "Nome: " + contato.getNome() + "\nTelefone: " + contato.getTelefone()
                + "\nEmail: " + contato.getEmail());
          } else {
            JOptionPane.showMessageDialog(null, "Contato não encontrado");
          }
          break;
      }
    } while (option != 3);
  }

  public static void adicionarContato(AgendaTelefonica agenda) {
    String nome = JOptionPane.showInputDialog("Digite o nome do contato");
    String telefone = JOptionPane.showInputDialog("Digite o telefone do contato");
    String email = JOptionPane.showInputDialog("Digite o email do contato");

    Contato contato = new Contato(nome, telefone, email);
    agenda.adicionarContato(contato);
  }
}
