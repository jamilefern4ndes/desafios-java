
public class NotificacaoEMAIL implements Notificavel{

    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("Enviando notificação via EMAIL: " + mensagem);
    }
    
}
