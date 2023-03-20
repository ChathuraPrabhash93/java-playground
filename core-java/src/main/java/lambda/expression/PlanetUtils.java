package lambda.expression;

import lambda.expression.model.Planet;

import java.util.List;
import java.util.stream.Collectors;

public class PlanetUtils {
    public static List<Planet> getPlanetsBeginningWithM(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getName().startsWith("M"))
                .collect(Collectors.toList());
    }

    public static List<Planet> getPlanetsWithRings(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getHasRings())
                .collect(Collectors.toList());
    }

    public static List<Planet> getPlanetsWithMoreThanThreeMoons(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getNumberOfMoons() > 3)
                .collect(Collectors.toList());
    }

    public static List<Planet> getPlanetsWithDensityGreaterThanFive(List<Planet> planets) {
        return planets.stream()
                .filter(planet -> planet.getDensity() > 5)
                .collect(Collectors.toList());
    }
}
