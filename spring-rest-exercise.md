## Spring REST API

**Food Ordering App**

**Develop a Food Ordering App. Refer to the class diagram below to develop required classes.**

```text
MenuItem
	- menuItemId:long
	- itemName:String
	- status: Enum(available/not-available)
	- price:double
	- category: Enum(Veg/Nonveg)
```

Implement the following operations:

* Add a new item to the menu
* Delete an item from the menu
* Update the price of an item
* Search an Item by Name
* Display all the available items
* Filter items category wise
* Create exceptions ItemNotFoundException and InvalidCategoryException that should be thrown if you input invalid data

* **Maintain Java Coding Standard.**
* **Use layered architecture**
