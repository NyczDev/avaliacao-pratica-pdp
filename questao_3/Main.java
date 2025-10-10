import java.util.Observer;

public class Main {
    /**
     * Escolhi Observer porque ele resolve perfeitamente o problema de notificar múltiplos
     * interessados sobre um evento, sem criar um acoplamento forte entre quem publica
     * a informação e quem a consome.
     */

    public static void main(String[] args) {
        // Cria os Tópicos
        NoticiaTopico esportes = new NoticiaTopico("Esportes");
        NoticiaTopico tecnologia = new NoticiaTopico("Tecnologia");
        NoticiaTopico politica = new NoticiaTopico("Política");

        // Cria os Leitores (Observers)
        LeitorAssinante leitor1 = new LeitorAssinante("Igor");
        LeitorAssinante leitor2 = new LeitorAssinante("Nicolas");
        LeitorAssinante leitor3 = new LeitorAssinante("Bruno");

        System.out.println("--- Fase de Inscrições ---");

        // Inscreve os leitores nos tópicos de interesse
        esportes.inscrever(leitor1); // Igor se interessa por Esportes
        tecnologia.inscrever(leitor1); // e Tecnologia

        tecnologia.inscrever(leitor2); // Nicolas se interessa por Tecnologia

        politica.inscrever(leitor3); // Bruno se interessa por Política
        esportes.inscrever(leitor3); // e Esportes

        System.out.println("\n--- Publicando Notícias ---");

        // Publica notícias e ve as notificações automáticas
        // Espera-se que todos recebam a notificação de que saiu uma nova notícia, do tópico que são assinantes.
        tecnologia.publicarNoticia("Lançado novo processador com IA integrada.");
        esportes.publicarNoticia("Brasil vence a final da Copa do Mundo!");
        politica.publicarNoticia("Novas leis econômicas são aprovadas.");
        System.out.println("\n--- Fase de Cancelamento de Inscrição ---");
        esportes.desinscrever(leitor1);
        System.out.println("\n--- Publicando mais uma notícia de Esportes ---");
        esportes.publicarNoticia("Revelada a nova contratação do time principal.");
    }
}