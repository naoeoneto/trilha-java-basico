package apps;
public class MSNMessenger extends ServicoMensagemInstantanea{
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN Messenger");
	}
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo mensagem pelo MSN Messenger");
	}
	@Override
	public void salvarHistoricoMensagem() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'salvarHistoricoMensagem'");
	}
}