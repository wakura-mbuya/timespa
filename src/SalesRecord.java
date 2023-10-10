import java.util.HashMap;
import java.util.Map;

/**
 * Represents sales data for a specific year, including sales amounts for each month.
 */
public class SalesRecord {
    private int year;
    private Map<String, Double> months;

    /**
     * Constructs a SalesRecord instance for the given year.
     *
     * @param year The year for which to record sales data.
     */
    public SalesRecord(int year) {
        this.year = year;
        this.months = new HashMap<>();
    }

    /**
     * Adds sales data for a specific month.
     *
     * @param month       The name of the month.
     * @param salesAmount The sales amount for the month.
     */
    public void addSales(String month, double salesAmount) {
        months.put(month, salesAmount);
    }

    /**
     * Gets the year for which sales data is recorded.
     *
     * @return The year for which sales data is recorded.
     */
    public int getYear() {
        return year;
    }

    /**
     * Gets the sales amount for a specific month.
     *
     * @param month The name of the month.
     * @return The sales amount for the specified month.
     */
    public double getSalesForMonth(String month) {
        // Return 0 for months with no recorded sales
        return months.getOrDefault(month, 0.0);
    }

    /**
     * Calculates the total sales for the year based on monthly sales amounts.
     *
     * @return The total sales amount for the year.
     */
    public double calculateTotalSales() {
        double totalSales = 0.0;
        for (double salesAmount : months.values()) {
            totalSales += salesAmount;
        }
        return totalSales;
    }
}