# Timespa Oils and Essences System
## Introduction
Welcome to the Timespa Oils and Essences System repository. This project demonstrates the design and implementation of a system for a luxury bath and body products maker, Timespa Oils and Essences. The system includes classes and functionality for managing the company's products, sales records, and commission calculations.

## Table of Contents
- [Getting Started](#getting-started)
- [Usage](#usage)
- [UML Diagrams](#uml-diagrams)
- [Class Implementations](#class-implementations)
- [Contributing](#contributing)
- [License](#license)

## Getting Started
To get started with this project, follow these steps:
1. Clone the repository to your local machine:
   ```
   git clone https://github.com/wakura-mbuya/timespa.git
   ```

2. Navigate to the project folder:
   ```
   cd timespa
   ```

3. Compile the Java files:
   ```
   javac *.java
   ```

4. Run the application:
   ```
   java Main
   ```

## Usage
The Timespa Oils and Essences System allows you to manage the following aspects of the company:

- **TimespaCompany**: Represents the company and includes details such as name, manufacturing facility, third-party retailers, and commission rates. You can set commission rates, calculate commissions, and calculate profits for the company.

- **Product**: Represents product information, including the name and prices for different sizes. You can retrieve product prices based on size.

- **SalesRecord**: Represents sales data for a specific year, including monthly sales amounts. You can add sales data, calculate total sales, and retrieve sales amounts for specific months.

## UML Diagrams
![classDiagram drawio](https://github.com/wakura-mbuya/timespa/assets/79056802/6897a307-a003-4603-8c21-4bf5af31aac9)

- [UML Class Diagram](https://github.com/wakura-mbuya/timespa/blob/master/images/classDiagram.drawio.png): Provides an overview of the class structure and relationships within the system.

  ![objectDiagram drawio](https://github.com/wakura-mbuya/timespa/assets/79056802/d1851383-3ade-41f9-af26-51eb417aa9a1)

- [UML Object Diagram](https://github.com/wakura-mbuya/timespa/blob/master/images/objectDiagram.drawio.png): Illustrates specific instances of classes and their relationships.

## Class Implementations

- [TimespaCompany.java](src/TimespaCompany.java): Implementation of the `TimespaCompany` class.
- [Product.java](src/Product.java): Implementation of the `Product` class.
- [SalesRecord.java](src/SalesRecord.java): Implementation of the `SalesRecord` class.
- [Main.java](src/Main.java): Main entry point of the application for demonstration.

## Contributing

Contributions to this project are welcome. You can contribute by reporting issues, suggesting improvements, or submitting pull requests. Please refer to our [Contribution Guidelines](CONTRIBUTING.md) for more details.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
