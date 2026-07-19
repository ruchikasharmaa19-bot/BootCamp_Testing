Feature: Holland & Barrett E-Commerce Website

Background:
Given the user launches the Holland & Barrett website
And the website is accessible
And the homepage is displayed successfully


Scenario: Customer Registration with valid details

Given the user is on the Registration page
When the user enters a valid First Name
And the user enters a valid Last Name
And the user enters a valid Email Address
And the user enters a valid Password
And the user confirms the Password
And the user accepts the Terms and Conditions
And the user clicks the Create Account button
Then the customer account should be created successfully
And the user should be redirected to My Account page


Scenario: Customer Login with valid credentials

Given the user is on the Login page
When the user enters a registered Email Address
And the user enters the correct Password
And the user clicks the Sign In button
Then the user should be logged in successfully
And the My Account page should be displayed


Scenario: Search for a health product

Given the user is on the Home page
When the user enters "Vitamin C" in the search box
And the user clicks the Search icon
Then the matching products should be displayed
And the search results should contain Vitamin C products


Scenario: Filter search results

Given the search results page is displayed
When the user selects Brand filter
And the user selects Price filter
And the user selects Category filter
Then the filtered products should be displayed
And only matching products should appear


Scenario: View product details

Given the product search results are displayed
When the user selects a product
Then the product details page should open
And the product image should be displayed
And the product description should be displayed
And the price should be displayed
And the stock availability should be displayed
And the Add to Basket button should be available


Scenario: Add product to Basket

Given the user is on the Product Details page
When the user clicks Add to Basket
Then the selected product should be added successfully
And the Basket count should increase
And a success confirmation message should be displayed


Scenario: Update Basket quantity

Given the Basket contains one product
When the user changes the quantity
And the user clicks Update Basket
Then the Basket quantity should be updated successfully
And the total amount should be recalculated


Scenario: Remove product from Basket

Given the Basket contains products
When the user clicks Remove
Then the selected product should be removed successfully
And the Basket should display the updated items


Scenario: Add product to Wishlist

Given the user is logged into the application
And the user is viewing a product
When the user clicks Add to Wishlist
Then the product should be added successfully
And the product should appear in the Wishlist


Scenario: View Wishlist

Given the user has saved products in Wishlist
When the user opens Wishlist
Then all saved products should be displayed
And each product should display its image, name and price


Scenario: Checkout successfully

Given the Basket contains products
When the user clicks Checkout
And the user enters Shipping Address
And the user selects Delivery Method
Then the Order Summary page should be displayed
And the user should be able to proceed to Payment

Scenario: Complete payment using Debit or Credit Card

Given the user is on the Payment page
When the user enters valid Card Number
And the user enters Card Holder Name
And the user enters Expiry Date
And the user enters CVV
And the user clicks Pay Now
Then the payment should be processed successfully
And the order should be confirmed


Scenario: View Order Confirmation

Given the payment is completed successfully
Then the Order Confirmation page should be displayed
And the Order Number should be generated
And the order details should be displayed
And a confirmation email should be sent to the customer


Scenario: View Order History

Given the user is logged in
When the user opens My Orders
Then all previous orders should be displayed
And each order should display the Order ID
And each order should display the Order Date
And each order should display the Order Status


Scenario: Update Profile Information

Given the user is logged into My Account
When the user updates personal information
And the user clicks Save Changes
Then the profile should be updated successfully
And the updated information should be displayed


Scenario: Logout successfully

Given the user is logged into the application
When the user clicks Logout
Then the user should be logged out successfully
And the Login page should be displayed


Scenario: Subscribe to Newsletter

Given the user is on the Home page
When the user enters a valid Email Address
And the user clicks Subscribe
Then the newsletter subscription should be successful
And a confirmation message should be displayed