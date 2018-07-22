package pl.sdacademy.printer;

public class Document {
	private boolean printed;

	Document(boolean printStatus){
		this.printed = printStatus;
	}

	public boolean isPrinted() {
		return printed;
	}

	public void setPrinted(boolean status) {
		printed=status;
	}
}
