package co.com.sofka.app.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BasicCalculatorTest {
    private BasicCalculator cal;

    @BeforeEach
    public void setup(){
        cal = new BasicCalculator();
    }


    @DisplayName("Testing several sums")
    @ParameterizedTest(name="{0}+{1}={2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, cal.sum(first,second),
                ()->first+" "+second+" should equal "+ expectedResult);
    }

    @DisplayName("Testing several substract")
    @ParameterizedTest(name="{0}-{1}={2}")
    @CsvSource({
            "10, 5, 5",
            "20, 10, 10",
            "52, 50, 2",
            "100, 100, 0"
    })
    public void severalSubstract(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, cal.substraction(first,second),
                ()->first+" "+second+" should equal "+ expectedResult);
    }

    @DisplayName("Testing several multiplying")
    @ParameterizedTest(name="{0}*{1}={2}")
    @CsvSource({
            "10, 5, 50",
            "20, 10, 200",
            "9, 2, 18",
            "6, 5, 30"
    })
    public void severalMultpliying(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, cal.mulplication(first,second),
                ()->first+" "+second+" should equal "+ expectedResult);
    }

    @DisplayName("Testing several divides")
    @ParameterizedTest(name="{0}/{1}={2}")
    @CsvSource({
            "8, 2, 4",
            "10, 5, 2",
            "9, 3, 3",
            "27, 9, 3"
    })
    public void severalDivide(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, cal.division(first,second),
                ()->first+" "+second+" should equal "+ expectedResult);
    }
}
