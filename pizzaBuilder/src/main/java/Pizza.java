import lombok.Builder;
import lombok.ToString;

@Builder()
@ToString
public class Pizza {
	private String dough = "";
	private String sauce = "";
	private String topping = "";

}