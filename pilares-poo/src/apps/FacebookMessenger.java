package apps;
public class FacebookMessenger extends ServicoMensagemInstantanea {
	public void enviarMensagem() {
        validarConectadoInternet();
		System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
	}
	public void receberMensagem() {
        validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo Facebook Messenger");
	}

    public void salvarHistoricoMensagem(){
        System.out.println("Histórico salvo");
    }
    
}