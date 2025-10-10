/**
 * Define o método atualizar que será chamado pelos Subjects
 * quando uma nova notícia for publicada.
 */
public interface Leitor {
     // Método chamado para notificar o leitor sobre uma nova notícia.
    void atualizar(String nomeTopico, String tituloNoticia);
}