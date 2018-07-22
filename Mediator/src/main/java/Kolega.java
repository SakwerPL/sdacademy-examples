
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
class Kolega  {
	@Setter
	private Mediator mediator;
	@Getter
	final private String id;


	public void wyślij(String id, String wiadomość) {
		System.out.println("Przesyłanie wiadomości od "+this.id+" do "+id+": "+wiadomość);
		mediator.wyślij(id, wiadomość); // Rzeczywista komunikacja odbywa się za pośrednictwem mediatora!!!
	}

	public void odbierz(String wiadomość) {
		System.out.println("Wiadomość odebrana przez "+id+": "+wiadomość);
	}
}