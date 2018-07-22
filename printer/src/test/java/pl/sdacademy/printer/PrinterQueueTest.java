package pl.sdacademy.printer;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrinterQueueTest {

	@DisplayName("Should print text")
	@Test
	void test0() {
		//given
		Printer printer = new Printer(1);
		//when
		Document document = new Document(false);
		printer.print(document);
		//then
		org.assertj.core.api.Assertions.assertThat(document.isPrinted()).isTrue();
	}

	@DisplayName("Should print if minimum number of documents is reached")
	@Test
	void test1() {
		//given
		int documentsThreshold = 4;
		Printer printer = new Printer(documentsThreshold);
		//when
		Document doc0= new Document(false);
		Document doc1= new Document(false);
		Document doc2= new Document(false);

		printer.print(doc0);
		printer.print(doc1);
		printer.print(doc2);
		//then
		org.assertj.core.api.Assertions.assertThat(doc0.isPrinted()).isFalse();
		org.assertj.core.api.Assertions.assertThat(doc1.isPrinted()).isFalse();
		org.assertj.core.api.Assertions.assertThat(doc2.isPrinted()).isFalse();

	}
	@DisplayName("Should print if minimum number of documents is reached")
	@Test
	void test2() {
		//given
		int documentsThreshold = 3;
		Printer printer = new Printer(documentsThreshold);
		//when
		Document doc0= new Document(false);
		Document doc1= new Document(false);
		Document doc2= new Document(false);

		printer.print(doc0);
		printer.print(doc1);
		printer.print(doc2);
		//then
		org.assertj.core.api.Assertions.assertThat(doc0.isPrinted()).isTrue();
		org.assertj.core.api.Assertions.assertThat(doc1.isPrinted()).isTrue();
		org.assertj.core.api.Assertions.assertThat(doc2.isPrinted()).isTrue();

	}
	@DisplayName("Should print if minimum number of documents is reached but no more")
	@Test
	void test3() {
		//given
		int documentsThreshold = 2;
		Printer printer = new Printer(documentsThreshold);
		//when
		Document doc0= new Document(false);
		Document doc1= new Document(false);
		Document doc2= new Document(false);

		printer.print(doc0);
		printer.print(doc1);
		printer.print(doc2);
		//then
		org.assertj.core.api.Assertions.assertThat(doc0.isPrinted()).isTrue();
		org.assertj.core.api.Assertions.assertThat(doc1.isPrinted()).isTrue();
		org.assertj.core.api.Assertions.assertThat(doc2.isPrinted()).isFalse();

	}
}
