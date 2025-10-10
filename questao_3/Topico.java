import java.util.ArrayList;
import java.util.List;

/**
 * Interface Subject.
 * Define a interface para os objetos que serão observados.
 */
public interface Topico {

    // Registra um novo leitor para receber notificações.
    void inscrever(Leitor leitor);

    // Remove um leitor da lista de notificações.
    void desinscrever(Leitor leitor);

    // Notifica todos os leitores inscritos sobre uma mudança.
    void notificarLeitores();
}