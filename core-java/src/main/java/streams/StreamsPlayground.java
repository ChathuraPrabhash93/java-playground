package streams;

import java.util.List;
import java.util.stream.Collectors;

public class StreamsPlayground {

    public static void main(String argvs[]) {
        filterExample();
        anyMatchExample();
        filterWithAnyMatchExample();
        mapExample();
    }

    /**
     * Example for two filtering requirements and collect the filtered output
     */
    private static void filterExample() {
        Product p1 = new Product("Books", 101.00);
        Product p2 = new Product("Pens", 15.00);
        Product p3 = new Product("Books", 230.00);

        List<Product> products = List.of(p1, p2, p3);

        List<Product> result = products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Books"))
                .filter(p -> p.getPrice() > 100)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    /**
     * Example for find anything matching for the given criteria
     */
    private static void anyMatchExample() {
        Product p1 = new Product("Books", 101.00);
        Product p2 = new Product("Pens", 15.00);
        Product p3 = new Product("Books", 230.00);

        List<Product> products = List.of(p1, p2, p3);

        boolean result = products
                .stream()
                .anyMatch(p -> p.getCategory().equalsIgnoreCase("Books"));

        System.out.println(result);
    }

    /**
     * Combination of stream filter and any match
     */
    private static void filterWithAnyMatchExample() {
        Product p1 = new Product("Books", 101.00);
        Product p2 = new Product("Pencils", 5.00);
        Product p3 = new Product("Books", 230.00);
        List<Product> products1 = List.of(p1, p2, p3);

        Order o1 = new Order(products1);

        Product p4 = new Product("Colors", 11.00);
        Product p5 = new Product("Pens", 15.00);
        Product p6 = new Product("Books", 70.00);
        List<Product> products2 = List.of(p4, p5, p6);

        Order o2 = new Order(products2);

        Product p7 = new Product("Colors", 11.00);
        Product p8 = new Product("Pens", 15.00);
        Product p9 = new Product("Pencils", 7.00);
        List<Product> products3 = List.of(p7, p8, p9);

        Order o3 = new Order(products3);

        List<Order> orders = List.of(o1, o2, o3);

        List<Order> result = orders
                .stream()
                .filter(o -> o.getProducts()
                        .stream()
                        .anyMatch(p -> p.getCategory().equalsIgnoreCase("Books"))
                )
                .collect(Collectors.toList());

        System.out.println(result);
    }

    /**
     * Example for transformation
     */
    private static void mapExample() {
        Product p1 = new Product("Toys", 101.00);
        Product p2 = new Product("Books", 15.00);
        Product p3 = new Product("Toys", 230.00);

        List<Product> products = List.of(p1, p2, p3);

        List<Product> result = products
                .stream()
                .filter(p -> p.getCategory().equalsIgnoreCase("Toys"))
                .map(p -> {
                    p.setDiscount(p.getPrice() * 0.1);
                    return p;
                })
                .collect(Collectors.toList());

        System.out.println(result);
    }

}
