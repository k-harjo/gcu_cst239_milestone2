VIDEO LINK:
https://youtu.be/mElnorZ13Hg


Welcome to the Bloodbath and Beyond StoreFront Application, where you can explore a simplified shopping experience involving product purchasing, cart management, and inventory tracking.

# StoreFront Application

The StoreFront Application is a Java console-based application that simulates a basic storefront environment. Users can interact with the application to purchase products, manage their shopping cart, and view product inventory. The application showcases core programming concepts such as object-oriented design, encapsulation, and interaction between different classes.


## Features

-Browse available products and purchase them.
-Manage your shopping cart by adding and removing products.
-View the current inventory of products.
-Experience a simple yet interactive text-based storefront.


## Getting Started

To run the StoreFront Application on your local machine, follow these steps:

Clone this repository to your local machine using git clone.
Open the project in your preferred Java IDE (e.g., Eclipse, IntelliJ IDEA).
Compile and run the StoreFrontApplication class.

The application will initialize the store with sample products, demonstrates product purchase and cancellation, and displays the final inventory and shopping cart contents.


## Class Structure

- `SalableProduct`: Represents a product that can be sold. Contains attributes such as name, description, price, and quantity. Provides getters and setters for these attributes.
- `InventoryManager`: Manages the inventory of salable products. Supports adding products to the inventory and retrieving the list of products.
- `ShoppingCart`: Represents a shopping cart that can hold salable products. Supports adding and removing products from the cart, and retrieving the cart items.
- `StoreFront`: Represents the store front application. Initializes the store with products, allows purchasing and cancellation of products, and provides methods for managing the store's functionality.
- `StoreFrontApplication`: Contains the `main` method to run the application. Demonstrates various interactions with the store front, including product purchase and cancellation.


## Usage 

Upon running the application, you'll be greeted with a menu of actions you can take:

1. Purchase a product: Select a product from the available list and specify the quantity.
2. Cancel a purchase: Remove a product from your cart.
3. View final inventory: Check the remaining inventory for each product.
4. View cart contents: Display the products in your cart along with quantities and total price.
5. Exit: Close the application.

Follow the prompts and interact with the application as you would in a real storefront. The application will guide you through the process.


## Future Enhancements

While the current version of the StoreFront Application provides basic functionality, there are several ways it could be enhanced:

-Implementation of a receipt feature to generate detailed purchase receipts.
-Integration of a more user-friendly user interface using graphical components.
-Adding user authentication and profiles for personalized shopping experiences.
-Integration with a database for persistent data storage.
-Feel free to contribute your ideas and improvements to make the application even better!


## Note

This program is a simple demonstration of store management functionalities. It does not include advanced error handling, user interfaces, or persistent data storage.

Feel free to explore and modify the code to suit your needs and to further enhance the functionalities of the store front application.

---