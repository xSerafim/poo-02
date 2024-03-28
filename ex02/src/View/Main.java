package View;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import Model.Musica;
import Model.Playlist;

public class Main {
  public static void main(String[] args) {
    Playlist playlist = new Playlist();

    String nomeDonoPlaylist = JOptionPane.showInputDialog("Digite o nome do dono da playlist: ");
    playlist.setNomeDono(nomeDonoPlaylist);

    List<Musica> musicas = new ArrayList<>();
    playlist.setMusicas(musicas);

    int option = 0;
    do {
      option = JOptionPane.showOptionDialog(null, "Escolha uma opção", "Menu", 0, JOptionPane.QUESTION_MESSAGE, null,
          new String[] { "Adicionar música", "Tocar playlist", "Tocar playlist modo aleatório", "Sair" }, 0);

      switch (option) {
        case 0:
          adicionarMusica(playlist);
          break;
        case 1:
          String musicasString = "";
          if (playlist.getMusicas() == null || playlist.getMusicas().size() == 0) {
            JOptionPane.showMessageDialog(null, "Playlist vazia...");
            break;
          }
          int i = 1;
          for (Musica musica : playlist.getMusicas()) {
            musicasString += i + ". " + musica.getNome() + "\n";
            i++;
          }
          JOptionPane.showMessageDialog(null, "Tocando playlist..." + "\n" + musicasString);
          break;
        case 2:
          if (playlist.getMusicas() == null || playlist.getMusicasRandomicamente().size() == 0) {
            JOptionPane.showMessageDialog(null, "Playlist vazia...");
            break;
          }
          int j = 1;
          String musicasStringRandom = "";
          for (Musica musica : playlist.getMusicasRandomicamente()) {
            musicasStringRandom += j + ". " + musica.getNome() + "\n";
            j++;
          }
          JOptionPane.showMessageDialog(null, "Tocando playlist..." + "\n" + musicasStringRandom);
          break;
        case 3:
          JOptionPane.showMessageDialog(null, "Saindo...");
          break;
      }
    } while (option != 3);

  }

  public static void adicionarMusica(Playlist playlist) {
    String nomeMusica = JOptionPane.showInputDialog("Digite o nome da música: ");
    String autorMusica = JOptionPane.showInputDialog("Digite o autor da música: ");
    String gravadoraMusica = JOptionPane.showInputDialog("Digite a gravadora da música: ");

    Musica musica = new Musica(nomeMusica, autorMusica, gravadoraMusica);
    playlist.addMusica(musica);
  }
}
