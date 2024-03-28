package Model;

import java.util.ArrayList;
import java.util.List;

public class AgendaTelefonica {
  List<Contato> contatos;

  public AgendaTelefonica() {
    this.contatos = new ArrayList<Contato>();
  }

  public AgendaTelefonica(List<Contato> contatos) {
    this.contatos = contatos;
  }

  public List<Contato> getContatos() {
    return contatos;
  }

  public void setContatos(List<Contato> contatos) {
    this.contatos = contatos;
  }

  public void adicionarContato(Contato contato) {
    this.contatos.add(contato);
  }

  public void removerContato(String email) {
    contatos.removeIf(contato -> contato.getEmail().equals(email));
  }

  public Contato buscarContato(String email) {
    for (Contato contato : contatos) {
      if (contato.getEmail().equals(email)) {
        return contato;
      }
    }
    return null;
  }
}
