// Desafio 3: O Sistema de Notificações (Nível: Reforço de Interface + Lista)
// Objetivo: Praticar a criação de um "contrato" e usá-lo dentro de uma ArrayList.

// Crie uma interface chamada Notificavel:
// Assine o método: void enviarNotificacao(String mensagem);
// Crie duas classes completamente diferentes que implementam a interface:
// NotificacaoEmail: no método enviarNotificacao, imprime: "Enviando e-mail com a mensagem: [mensagem]".
// NotificacaoSMS: no método enviarNotificacao, imprime: "Enviando SMS com a mensagem: [mensagem]".
// Na classe Main:
// Crie uma ArrayList<Notificavel> listaNotificacoes = new ArrayList<>();.
// Adicione um objeto NotificacaoEmail e um NotificacaoSMS dentro dessa mesma lista.
// Use um loop for (Notificavel n : listaNotificacoes) para chamar o método .enviarNotificacao("Sua encomenda chegou!") para todos.
import java.util.ArrayList;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Notificavel> listaNotificacoes = new ArrayList<>();
        listaNotificacoes.add(new NotificacaoSMS());
        listaNotificacoes.add(new NotificacaoEMAIL());

        for(Notificavel Notificacao : listaNotificacoes){
            Notificacao.enviarNotificacao("Sua encomenda chegou!");
        }
    }
}
