/**
 * Represents a product with its name and prices for different sizes.
 */
public class Product {
    private String productName;
    private double price100ml;
    private double price400ml;
    private double price1000ml;

    /**
     * Constructs a Product instance with the given details.
     *
     * @param productName The name of the product.
     * @param price100ml  The price for 100ml size.
     * @param price400ml  The price for 400ml size.
     * @param price1000ml The price for 1000ml size.
     */
    public Product(String productName, double price100ml, double price400ml, double price1000ml) {
        this.productName = productName;
        this.price100ml = price100ml;
        this.price400ml = price400ml;
        this.price1000ml = price1000ml;
    }

    /**
     * Gets the name of the product.
     *
     * @return The name of the product.
     */
    public String getProductName() {
        return productName;
    }

    /**
     * Gets the price for 100ml size.
     *
     * @return The price for 100ml size.
     */
    public double getPrice100ml() {
        return price100ml;
    }

    /**
     * Gets the price for 400ml size.
     *
     * @return The price for 400ml size.
     */
    public double getPrice400ml() {
        return price400ml;
    }

    /**
     * Gets the price for 1000ml size.
     *
     * @return The price for 1000ml size.
     */
    public double getPrice1000ml() {
        return price1000ml;
    }

    /**
     * Gets the product price based on the size.
     *
     * @param size The size of the product (e.g., "100ml", "400ml", "1000ml").
     * @return The price for the specified size.
     */
    public double getProductPrice(String size) {
        return switch (size) {
            case "100ml" -> price100ml;
            case "400ml" -> price400ml;
            case "1000ml" -> price1000ml;
            default -> 0.0; // Return 0 for invalid size
        };
    }
}