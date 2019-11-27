src -> original
    contains the code by Dr. Tien
    I added a class TestOriginalCode
    to better understand the code

src -> refactored
    contains the code that I refactored

1 - Made frequent reward points into a strategy

2 - Implemented a transaction class which holds a list of rentals

3 - Implemented a strategy design pattern

4 - Implemented a factory to instantiate the strategy

5 - Implemented the decorator pattern to compose rewards strategy in order to compute reward points

6 - Added age to customer and implemented new reward point strategy in decorator

7 - Checked the number of reward points if greater than 10 printed Congratulations you have a free rental

8 - Create an Item interface - movies, video games, music CDs, xbox, ps4, and books all implement this interface
```java
BigDecimal getPrice();
Type getType();
Item  getItem();
String getTitle();
```
9 -Create a Price class using the builder pattern. All prices are computed in this Price class. When adding a new item, this class will need to be updated to reflect it's price

10 - Implemented a store that has a method for checking out and for printing statements.