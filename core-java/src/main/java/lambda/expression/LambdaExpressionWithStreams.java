package lambda.expression;

import lambda.expression.model.Planet;
import lambda.expression.model.SolarSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionWithStreams {
    // create an object of list using ArrayList
    static List<String> places = new ArrayList<>();

    // preparing our data
    public static List<String> getPlaces() {

        // add places and country to the list
        places.add("Nepal, Kathmandu");
        places.add("Nepal, Pokhara");
        places.add("India, Delhi");
        places.add("USA, New York");
        places.add("Africa, Nigeria");

        return places;
    }

    public static void main(String[] args) {

        List<String> myPlaces = getPlaces();
        System.out.println("Places from Nepal:");

        // Filter places from Nepal
        myPlaces.stream()
                .filter((p) -> p.startsWith("Nepal"))
                .map((p) -> p.toUpperCase())
                .sorted()
                .forEach((p) -> System.out.println(p));
        System.out.println("################### Section Break ####################### \n");



        /**
         * Example of creating `Stream` from an array
         */
        Integer[] scores = new Integer[]{80, 66, 73, 92, 43};
        Stream<Integer> scoresStream = Arrays.stream(scores);
        scoresStream.forEach(i -> System.out.println(i));
        System.out.println("################### Section Break ####################### \n");



        /**
         * Example of creating `Stream` by declaring itself
         */
        Stream<Integer> numbersStream = Stream.of(2, 5, 8);
        numbersStream.forEach(i -> System.out.println(i));
        System.out.println("################### Section Break ####################### \n");



        /**
         * Example of returning a collection after `Stream` operations
         */
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("coffee");
        shoppingList.add("bread");
        shoppingList.add("pineapple");
        shoppingList.add("milk");
        shoppingList.add("pasta");
        List<String> sortedShoppingList = shoppingList.stream()
                .sorted()
                .map(item -> item.toUpperCase())
                .filter(item -> item.startsWith("P"))
                .collect(Collectors.toList());

        System.out.println(sortedShoppingList);
        System.out.println("################### Section Break ####################### \n");



        /**
         * More examples with Stream operations - see implementations inside the `PlanetUtils` class
         */
        List<Planet> planets = SolarSystem.getPlanets();

        System.out.println("Planets Beginning With M");
        PlanetUtils.getPlanetsBeginningWithM(planets)
                .stream().forEach(planet -> System.out.println(planet.toString()));

        System.out.println("\n Planets With Rings");
        PlanetUtils.getPlanetsWithRings(planets)
                .stream().forEach(planet -> System.out.println(planet.toString()));

        System.out.println("\n Planets With More Than Three Moons");
        PlanetUtils.getPlanetsWithMoreThanThreeMoons(planets)
                .stream().forEach(planet -> System.out.println(planet.toString()));

        System.out.println("\n Planets With Density Greater Than Five");
        PlanetUtils.getPlanetsWithDensityGreaterThanFive(planets)
                .stream().forEach(planet -> System.out.println(planet.toString()));

    }
}
