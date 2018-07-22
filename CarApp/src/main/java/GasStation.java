import lombok.Getter;
import lombok.Setter;

import java.util.Map;
class GasStation {

	@Setter
	@Getter
	Map<FuelType, Double> prices4Liter;

	double fillTofull(Car car) {

		double payment = (car.getMaxFuelLevel()-car.getCurrentFuelLevel())*getPrices4Liter().get(car.getFuelType());
		car.setCurrentFuelLevel(100);
		return payment;
	}


	double fill(Car car, int fillValue) {

		double payment = fillValue*getPrices4Liter().get(car.getFuelType());

		if ((car.getCurrentFuelLevel()+fillValue)>car.getMaxFuelLevel())
			{
			car.setCurrentFuelLevel(car.getMaxFuelLevel());
			}
		else	{
			car.setCurrentFuelLevel(car.getCurrentFuelLevel()+fillValue);
			}
		return payment;
	}

	void fillTofull4Free(Car car) {

		car.setCurrentFuelLevel(100);
	}

}
