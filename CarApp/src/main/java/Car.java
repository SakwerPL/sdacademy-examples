import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
class Car {

	@Setter
	@Getter
	int currentFuelLevel;

	@Getter
	final int maxFuelLevel;

	@Getter
	@Setter
	final FuelType fuelType;

	@Setter
	@Getter
	int cleanValue;

	@Setter
	@Getter
	int TireWearStatus;

	@NonNull
	CarThresholds carThresholds;

	int getFuelThreshold(){return carThresholds.getFuelThreshold();}
	int getTiresThreshold(){return carThresholds.getTiresThreshold();}
	int getCleanThreshold(){return carThresholds.getCleanThreshold();}
}

