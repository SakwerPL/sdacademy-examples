import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;


public class PitstopTest {

	CarThresholds carThreshold;
	Car tadeuszCar;
	GasStation shell;
	CarMyjka myjka;
	Vulcanizer wulkanizator;
	Pitstop pitstop;
	Race race;
	@BeforeEach
	void setUp() {
		carThreshold = new CarThresholds(10,5,90);
		tadeuszCar = new Car(65,FuelType.PB,carThreshold);
		shell = new GasStation();
		myjka = new CarMyjka();
		wulkanizator = new Vulcanizer();
		race = new Race();
		pitstop = new Pitstop(shell,wulkanizator,myjka);
	}
	@DisplayName("Should let to ride 100 laps race and check fuel status & tire status & filth status ")
	@Test
	void test00() {

		//given
		int lapsNumber = 100;
		//when
		race.race(lapsNumber,tadeuszCar,pitstop);
		//then
		assertThat(race.check(tadeuszCar,pitstop)).isTrue();

	}
	@DisplayName("Should let to ride 100 laps race and if needed get pitstop")
	@Test
	void test01() {

		//given
		int lapsNumber = 100;
		//when
		race.race(lapsNumber,tadeuszCar,pitstop);
		//then


	}
}
