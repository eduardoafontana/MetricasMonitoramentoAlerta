import java.util.Observable;
import java.util.Observer;

public class Alerta implements Observer {

	private String mensagem;
	
	public String getMensagem(){
		return mensagem;
	}
	
	@Override
	public void update(Observable obj, Object arg) {
		mensagem = "OK";
	}

}
