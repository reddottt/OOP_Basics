package Intarfaces;

public interface TemperatureConverter {
    double convertTemperature(double temperature);
}

class CelsiusConverter implements TemperatureConverter{
    @Override
    public double convertTemperature(double temperature) {
        return temperature;
    }
}

class KelvinConverter implements TemperatureConverter {
    @Override
    public double convertTemperature(double temperature) {
        return temperature + 273.15;
    }
}

class FahrenheitConverter implements TemperatureConverter {
    @Override
    public double convertTemperature(double temperature) {
        return 9 / 5 * temperature + 32;
    }
}