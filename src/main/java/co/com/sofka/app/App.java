package co.com.sofka.app;

import co.com.sofka.app.calculator.BasicCalculator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    private static final Logger logger = LoggerFactory.getLogger( App.class );

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in ) );

        System.out.print( "Enter number 1: " );
        String textNumber1 = bufferedReader.readLine();

        System.out.print( "Enter number 2: " );
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf( textNumber1 );
        Long number2 = Long.valueOf( textNumber2 );

        BasicCalculator calculator = new BasicCalculator();
        Long result = calculator.sum( number1, number2 );

        System.out.println( number1 + " + " + number2 + " = " + result );

        BasicCalculator calculator2 = new BasicCalculator();
        Long result2 = calculator2.substraction( number1, number2 );

        System.out.println( number1 + " - " + number2 + " = " + result2 );

        BasicCalculator calculator3 = new BasicCalculator();
        Long result3 = calculator2.mulplication( number1, number2 );

        System.out.println( number1 + " * " + number2 + " = " + result3 );

        BasicCalculator calculator4 = new BasicCalculator();
        Long result4 = calculator4.division( number1, number2 );

        System.out.println( number1 + " / " + number2 + " = " + result4 );

    }
}
