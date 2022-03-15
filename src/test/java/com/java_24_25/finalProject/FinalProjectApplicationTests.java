package com.java_24_25.finalProject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FinalProjectApplicationTests {
	private Calculator calculator = new Calculator();

	@Test
	public void shouldCalculateTheCoverTypePriceCorrectly() throws Exception {
		// Given that
		String coverType = "journal";
		// When
		double result = calculator.calculateThePriceForTheCover(coverType);
		//Then
		Assertions.assertEquals(result, 20.0d, 0);
	}

	@Test
	public void shouldCalculateLeatherTypePriceCorrectly() throws Exception {
		// Given that
		String coverType = "journal";
		String leatherType = "vegetable";
		String size = "A4";
		// When
		double leatherTypePrice = calculator.calculateLeatherTypePrice(leatherType, coverType, size);
		//Then
		Assertions.assertTrue(leatherTypePrice == 14.0);
	}

	@Test
	public void shouldCalculatePaperTypePriceCorrectly() throws Exception {
		// Given that
		String paperType = "watercolor";
		String size = "A5";
		String numberOfPages = "250";
		// When
		double paperTypePrice = calculator.calculatePaperTypePrice(paperType, size, numberOfPages);
		//Then
		Assertions.assertTrue(paperTypePrice == 5.0 *5 );
	}

	@Test
	public void shouldCalculateNumberOfPagesPriceCorrectly() throws Exception {
		double paperTypePrice = 5.0;
		String numberOfPages = "250";
		double newPaperTypePrice = calculator.calculateNumberOfPagesPrice(paperTypePrice, numberOfPages);
		Assertions.assertTrue(newPaperTypePrice == 25.0);
	}

	@Test
	public void shouldCalculatePaperColorPriceCorrectly() throws  Exception {
		String paperBaseColour = "beige";
		String paperType = "sketch";
		String size = "A4";
		String numberOfPages = "200";

		double paperColorPrice = calculator.calculatePaperColorPrice(paperBaseColour, paperType, size, numberOfPages);
		Assertions.assertTrue(paperColorPrice == (3.3 * 4));
	}

	@Test
	public void shouldCalculateLeatherColorPriceCorrectly() throws Exception {
		String leatherType = "vegetable";
		String colourOfLeather = "white leather";
		String size = "B5";

		double leatherColourPrice = calculator.calculateLeatherColorPrice(leatherType, colourOfLeather, size);
		Assertions.assertTrue(leatherColourPrice == 6.0);
	}

	@Test
	public void shouldCalculateTotalBookPriceCorrectly() throws Exception {
		double coverPrice = 30.0;
		double leatherTypePrice = 12.5;
		double numberOfPagesPrice = 12.0;
		double paperColorPrice = 8.8;
		double leatherColourPrice = 4.0;

		double totalBookPrice = calculator.calculateTotalBookPrice(coverPrice, leatherTypePrice, numberOfPagesPrice, paperColorPrice, leatherColourPrice);
		Assertions.assertTrue(totalBookPrice == 67.30);
	}
}

