import org.javamoney.moneta.Money;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MoneyClass {


static List<Money> kwota = new ArrayList<>();
static List<Money> kwotaVat = new ArrayList<>();
	public static void fillTable() {
	for(int i=1;i>0;i++) {
		Money kwotaWartosc =  Money.of(i,"USD");
		Money kwotaWartoscVat =  Money.of(kwotaWartosc.getNumberStripped().multiply(BigDecimal.valueOf
			(0.23)).setScale(2,RoundingMode.HALF_UP),"USD");
		kwota.add(kwotaWartosc);
		kwotaVat.add(kwotaWartoscVat);
		}
		kwota.stream().forEach(System.out::println);
		kwotaVat.stream().forEach(System.out::println);
	}
}
