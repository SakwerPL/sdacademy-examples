import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
 class Pitstop {

	@NonNull
	GasStation gasStation;
	@NonNull
	Vulcanizer wulkanizator;
	@NonNull
	CarMyjka myjka;

	boolean fuelCheck(Car car){
		return car.getCurrentFuelLevel()<car.getFuelThreshold();
	}

	 boolean wheelCheck(Car car) {

		return car.getTireWearStatus()>car.getTiresThreshold();
	}

	boolean cleanCheck(Car car) {

		return car.getCleanValue()>car.getCleanThreshold();
	}

	public void pitstop(Car car) {
		if (fuelCheck(car)){
			gasStation.fillTofull4Free(car);
		}

		if (wheelCheck(car)){
			wulkanizator.changeTires4Free(car);
		}
		if (cleanCheck(car)){
			myjka.cleanTheCar4Free(car);
		}
	}
}
