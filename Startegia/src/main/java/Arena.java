import lombok.AllArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@ToString
class Arena{

	private List<Knight> knights;
	private KnightValidator validator;

	public Arena(KnightValidator validator){

		this.validator = validator;

		knights =  new ArrayList<Knight>();

	}

	public void addKnight(Knight knight){

		if(validator.validate(knight))
			knights.add(knight);

	}

}