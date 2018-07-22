package pl.sdacademy.printer;

import java.util.Stack;

public  class Printer {

	private final int documentsThreshold;
	private Stack<Document> printQueue;

	public Printer(int documentsThreshold) {
		this.documentsThreshold = documentsThreshold;
		this.printQueue = new Stack<>();
	}


	public void print(Document document) {

		printQueue.push(document);
		if (printQueue.size() >= documentsThreshold) {
			while (!printQueue.isEmpty()) {
				printQueue.pop().setPrinted(true);
			}
		}
	}
}