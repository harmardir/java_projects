## Arrays

Arrays are data structure that stores a collection of data

1. Creating an Array:
- Initialize list method
```
String [] names = {"name1", "name2", name3"};
```
- The new method
```
String [] names = new String [5];
```
5 is the number of elements.

```
int [] numbers = {1, 2, 3, 4, 5};
```
2. Accessing an Array:
```
System.out.println(numbers[n]);
```
n is the index

3. Array modification: find the index of which the element is and assign a new value to it.
```
numbers[1] = 100;
```
4. Iterating an Array
```
String [] friends = {"name1" , "name2", "name3"};
for (int i =0 ; i < friends.length() ; i++){
    System.out.println(friends[i]);
}
```
5. Enhanced For-Loop
```
String [] friends = {"name1" , "name2", "name3"};
for(String i : friends){
    System.out.println(i);
}
```
can't use the Enhanced For-Loop to acces or modify , its all or nothing.

## Array List

Arrays are static which means can't add or remove elements, Array Lists are dynamic.
To use Array Lists we must import it:
```
import.java.util.ArrayList;
```
1. Creating an Array List
```
ArrayList <Integer> numbers = new ArrayList<Integer>();
```
- The data types in Array List are: `Integer` `Double` `Boolean` `String`
- By default if we print the last code it will give us `[]`

2. Adding Array List Elements
```
numbers.add(50);
```
this will add `50` as an element ti the end of the ArrayList

3. Adding an element to specific index
```
numbers.add(0, 12) ;
```
this will add `12` as an element to the index `0`

4. Removing ArrayList Elements




