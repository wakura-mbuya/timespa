import java.util.HashMap;
import java.util.Map;

/**
 * Represents the Timespa Company, including its name, manufacturing facility,
 * third-party retailers, and commission rates for different regions.
 */
public class TimespaCompany {
    private String name;
    private String manufacturingFacility;
    private String thirdPartyRetailers;
    private Map<String, Double> commissionRates;

    /**
     * Constructs a TimespaCompany instance with the given details.
     *
     * @param name                  The name of the company.
     * @param manufacturingFacility The manufacturing facility location.
     * @param thirdPartyRetailers   The list of third-party retailers.
     */
    public TimespaCompany(String name, String manufacturingFacility, String thirdPartyRetailers) {
        this.name = name;
        this.manufacturingFacility = manufacturingFacility;
        this.thirdPartyRetailers = thirdPartyRetailers;
        this.commissionRates = new HashMap<>();
    }

    /**
     * Sets the commission rate for a specific region.
     *
     * @param region The region for which to set the commission rate.
     * @param rate   The commission rate as a decimal value (e.g., 0.03 for 3%).
     */
    public void setCommissionRate(String region, double rate) {
        commissionRates.put(region, rate);
    }

    /**
     * Calculates the commission for a given sales amount based on the region's rate.
     *
     * @param salesAmount The total sales amount.
     * @return The calculated commission amount.
     */
    public double calculateCommission(double salesAmount) {
        double commissionRate = 0.0; // Default rate if not found

        // Get the commission rate based on the region
        if (commissionRates.containsKey(manufacturingFacility)) {
            commissionRate = commissionRates.get(manufacturingFacility);
        }

        return salesAmount * commissionRate;
    }

    /**
     * Calculates the profit for a given sales amount.
     *
     * @param salesAmount The total sales amount.
     * @return The calculated profit amount.
     */
    public double calculateProfit(double salesAmount) {
        double commission = calculateCommission(salesAmount);
        return salesAmount - commission;
    }

    /**
     * Gets the name of the Timespa Company.
     *
     * @return The name of the company.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the manufacturing facility location.
     *
     * @return The manufacturing facility location.
     */
    public String getManufacturingFacility() {
        return manufacturingFacility;
    }

    /**
     * Gets the list of third-party retailers.
     *
     * @return The list of third-party retailers.
     */
    public String getThirdPartyRetailers() {
        return thirdPartyRetailers;
    }

    /**
     * Gets the commission rates for different regions.
     *
     * @return A map of region names to commission rates.
     */
    public Map<String, Double> getCommissionRates() {
        return commissionRates;
    }
}