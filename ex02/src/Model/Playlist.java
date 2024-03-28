package Model;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
  String nomeDono;
  List<Musica> musicas;

  public Playlist() {
  }

  public Playlist(String nomeDono, List<Musica> musicas) {
    this.nomeDono = nomeDono;
    this.musicas = musicas;
  }

  public String getNomeDono() {
    return nomeDono;
  }

  public void setNomeDono(String nomeDono) {
    this.nomeDono = nomeDono;
  }

  public List<Musica> getMusicas() {
    return musicas;
  }

  public void setMusicas(List<Musica> musicas) {
    this.musicas = musicas;
  }

  public void addMusica(Musica musica) {
    this.musicas.add(musica);
  }

  public void removeMusica(Musica musica) {
    this.musicas.remove(musica);
  }

  public List<Musica> getMusicasRandomicamente() {
    List<Musica> musicas = new ArrayList<>(this.musicas);
    List<Musica> musicasOrdenadasRandomicamente = new ArrayList<>();

    while (musicas.size() > 0) {
      int index = (int) (Math.random() * musicas.size());
      musicasOrdenadasRandomicamente.add(musicas.get(index));
      musicas.remove(index);
    }

    return musicasOrdenadasRandomicamente;
  }
}
