package exceptions;

import java.util.ArrayList;
import java.util.List;

public class TemperatureAverage {

	public static void main(String[] args) {

		try {
			List<Integer> recordedTemperaturesInDegreesCelsius = new ArrayList<Integer>();

			/*
			 * recordedTemperaturesInDegreesCelsius.add(4);
			 * recordedTemperaturesInDegreesCelsius.add(7);
			 */
			recordedTemperaturesInDegreesCelsius.add(9);
			recordedTemperaturesInDegreesCelsius.add(7);

			for (String stringRepresentationOfTemperature : args) {
				int temperature = Integer.parseInt(stringRepresentationOfTemperature);
				recordedTemperaturesInDegreesCelsius.add(temperature);
			}

			Integer averageTemperature = SimpleMaths.calculateAverage(recordedTemperaturesInDegreesCelsius);
			System.out.println("The average temperature is " + averageTemperature);
		} catch (NumberFormatException e) {
			System.out.println("All arguments should be provided as numbers");
			System.exit(-1);
		} catch (ArithmeticException e) {
			System.out.println("At least one temperature should be provided");
			System.exit(-1);
		}

	}

}
