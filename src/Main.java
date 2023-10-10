public class Main {
    public static void main(String[] args) {
        // Create a TimespaCompany instance
        TimespaCompany timespaCompany = new TimespaCompany("Timespa Oils and Essences", "USA", "Retailer A, Retailer B, Retailer C");

        // Set commission rates for different regions
        timespaCompany.setCommissionRate("USA", 0.03);  // 3%
        timespaCompany.setCommissionRate("Europe", 0.02); // 2%
        timespaCompany.setCommissionRate("Asia & Middle East", 0.015); // 1.5%

        // Create a Product instance
        Product product = new Product("Shampoo A", 5.99, 19.99, 39.99);

        // Calculate product price for different sizes
        double priceFor100ml = product.getProductPrice("100ml"); // Replace with actual logic
        double priceFor400ml = product.getProductPrice("400ml"); // Replace with actual logic
        double priceFor1000ml = product.getProductPrice("100ml"); // Replace with actual logic

        // Create a SalesRecord instance for the year 2023
        SalesRecord salesRecord2023 = new SalesRecord(2023);

        // Add monthly sales data
        salesRecord2023.addSales("January", 120000);
        salesRecord2023.addSales("February", 110000);
        salesRecord2023.addSales("March", 130000);

        // Calculate total sales for the year
        double totalSales2023 = salesRecord2023.calculateTotalSales();

        // Calculate commission and profit for the year's total sales
        double commission2023 = timespaCompany.calculateCommission(totalSales2023);
        double profit2023 = timespaCompany.calculateProfit(totalSales2023);

        // Display the results
        System.out.println("Timespa Company Information:");
        System.out.println("Name: " + timespaCompany.getName());
        System.out.println("Manufacturing Facility: " + timespaCompany.getManufacturingFacility());
        System.out.println("Third-Party Retailers: " + timespaCompany.getThirdPartyRetailers());
        System.out.println("Commission Rates: " + timespaCompany.getCommissionRates());

        System.out.println("\nProduct Information:");
        System.out.println("Product Name: " + product.getProductName());
        System.out.println("Price for 100ml: $" + priceFor100ml);
        System.out.println("Price for 400ml: $" + priceFor400ml);
        System.out.println("Price for 1000ml: $" + priceFor1000ml);

        System.out.println("\nSales Record for 2023:");
        System.out.println("Year: " + salesRecord2023.getYear());
        System.out.println("Total Sales for 2023: $" + totalSales2023);
        System.out.println("Commission for 2023: $" + commission2023);
        System.out.println("Profit for 2023: $" + profit2023);
    }
}