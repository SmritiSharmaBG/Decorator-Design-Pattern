# Decorator Design Pattern

## StarBucks Coffee Shop

### Problem Statement :
StarBucks coffee offers customers to customise their orders as follows :
1. Order a base beverage : Americano, Cappuccino, Espresso or Latte
2. Add any number of condiments over it : Caramel, Chocolate-Syrup or Vanilla Extract.

The code has following functionalities for each order:
1. Print a welcome message
2. Print the order details. (base beverage and the list of condiments or add-ons)
3. Print the price of that order. (Each element has different price)
4. The design should be such that in future the shop can easily add new beverages and new condiments without any modification to the existing code (Open-Close principle)

### Implementation :

**Beverage :**
Beverage is an abstract class which has abstract function `cost()` so that different beverages can implement their own cost.

**Condiment :**
Condiment is an abstract class which extends Beverage class. It has abstract function `cost()` so that different condiments can implement their own cost. Condiment makes use of ***"is-a"*** relationship by inheriting Beverage class. It also has ***"has-a"*** relationship by having Beverage as an class variable which gets initialised using dependency injection.

**The `cost()` method :**
When we need to find the cost of a final object (say double caramel Latte), then the `cost()` function will execute recursively adding the cost of all the elements by `beverage.cost() + x`. 

**The `getOrder()` method :**
The `getMessage()` works as following :
```
Welcome to StarBucks coffee. The order is : 
Latte
Your add-ons are :Caramel
Your add-ons are :Vanilla Extract
Your add-ons are :Caramel
Make a payment of : 220
```
- `getMessage()` is called in base-beverage class where it prints the welcome

### Important Points to note :
1. Beverage is an abstract class because we need some methods that need to have implementation which can not be achieved using interface.
2. If an abstract class extends other abstract class, it can have or not have the abstract method the parent had.
3. If the parent class has a constructor, then the child class should have a matching constructor.
4. 
