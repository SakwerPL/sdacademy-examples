class PrzykładoweUżycieMediatora {
	public static void main(String[] args) {
		Kolega rene = new Kolega("rene");
		Kolega toni = new Kolega("toni");
		Kolega kim = new Kolega("kim");

		Mediator m = new RzeczywistyMediator();
		m.zarejestrujKolegę(rene);
		m.zarejestrujKolegę(toni);
		m.zarejestrujKolegę(kim);

		kim.wyślij("toni", "Hello world.");
		rene.wyślij("kim", "Witaj!");
	}
}