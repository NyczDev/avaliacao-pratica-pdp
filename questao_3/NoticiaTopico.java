import java.util.ArrayList;
import java.util.List;

/**
 * Concrete Subject.
 * Representa um tópico específico de notícias. Ele mantém a última notícia
 * e gerencia sua própria lista de assinantes.
 */
public class NoticiaTopico implements Topico {
    private List<Leitor> leitores = new ArrayList<>();
    private String nomeTopico;
    private String ultimaNoticia;

    public NoticiaTopico(String nomeTopico) {
        this.nomeTopico = nomeTopico;
    }

    @Override
    public void inscrever(Leitor leitor) {
        // Adiciona um leitor à lista se ele ainda não estiver inscrito.
        if (!leitores.contains(leitor)) {
            leitores.add(leitor);
            System.out.printf("'%s' se inscreveu no tópico '%s'.\n", ((LeitorAssinante) leitor).getNome(), this.nomeTopico);
        }
    }

    @Override
    public void desinscrever(Leitor leitor) {
        // Remove o leitor da lista.
        if (leitores.remove(leitor)) {
             System.out.printf("'%s' cancelou a inscrição do tópico '%s'.\n", ((LeitorAssinante) leitor).getNome(), this.nomeTopico);
        }
    }

    @Override
    public void notificarLeitores() {
        // Percorre a lista de leitores e chama o método "atualizar" de cada um.
        for (Leitor leitor : leitores) {
            leitor.atualizar(this.nomeTopico, this.ultimaNoticia);
        }
    }

    /**
     * O método principal que muda o estado do Subject e dispara as notificações.
     * @param tituloNoticia O título da notícia a ser publicada.
     */
    public void publicarNoticia(String tituloNoticia) {
        System.out.printf("\n>>> Nova publicação em '%s': \"%s\" <<<\n", this.nomeTopico, tituloNoticia);
        this.ultimaNoticia = tituloNoticia;
        // Após atualizar seu estado, ele notifica todos os seus dependentes.
        notificarLeitores();
    }
}