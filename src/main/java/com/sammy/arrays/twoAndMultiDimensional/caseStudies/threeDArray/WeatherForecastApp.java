package com.sammy.arrays.twoAndMultiDimensional.caseStudies.threeDArray;

import java.util.Scanner;

public class WeatherForecastApp {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] weatherData = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        Scanner userInput = new Scanner(System.in);

        loadAndDisplayWeatherAverageFigures(NUMBER_OF_DAYS, NUMBER_OF_HOURS, weatherData, userInput);
    }

    private static void loadAndDisplayWeatherAverageFigures(int NUMBER_OF_DAYS, int NUMBER_OF_HOURS,
                                                            double[][][] weatherData, Scanner userInput) {
        //To receive input from a file
        for(int index = 0; index < NUMBER_OF_DAYS * NUMBER_OF_HOURS; index++){
            int day = userInput.nextInt();
            int hour = userInput.nextInt();
            double temperature = userInput.nextDouble();
            double humidity = userInput.nextDouble();

            weatherData[day - 1][hour - 1][0] = temperature;
            weatherData[day - 1][hour - 1][1] = humidity;
        }

        //Calculate the average daily temperature and humidity
        for(int index = 0; index < NUMBER_OF_DAYS; index++){
            double dailyTemperatureTotal = 0, dailyHumidityTotal = 0;
            for(int secondIndex = 0; secondIndex < NUMBER_OF_HOURS; secondIndex++){
                dailyTemperatureTotal += weatherData[index][secondIndex][0];
                dailyHumidityTotal += weatherData[index][secondIndex][1];
            }

            System.out.println("Day " + index + "'s average temperature is " +
                               dailyTemperatureTotal / NUMBER_OF_HOURS);
            System.out.println("Day " + index + "'s average humidity is " +
                               dailyHumidityTotal / NUMBER_OF_HOURS);
        }
    }
}
