/**
 * Concrete Observer.
 * Representa um leitor que se inscreve em tópicos.
 * A implementação do método atualizar define como ele reage às notificações.
 */
public class LeitorAssinante implements Leitor {
    private String nome;

    public LeitorAssinante(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String nomeTopico, String tituloNoticia) {
        // Ação que o leitor toma ao ser notificado.
        System.out.printf("--- Notificação para %s ---\n", this.nome);
        System.out.printf("Nova notícia no tópico '%s': %s\n", nomeTopico, tituloNoticia);
        System.out.println("--------------------------");
    }

    public String getNome() {
        return nome;
    }
}