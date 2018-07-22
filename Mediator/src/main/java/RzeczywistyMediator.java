import java.util.HashMap;
import java.util.Map;

class RzeczywistyMediator implements Mediator {
	private Map<String, Kolega> koledzy = new HashMap<String, Kolega>();

	public void zarejestrujKolegę(Kolega k) {
		k.zarejestrujMediatora(this);
		koledzy.put(k.getId(), k);
	}

	public void wyślij(String id, String wiadomość) {
		koledzy.get(id).odbierz(wiadomość);
	}
}