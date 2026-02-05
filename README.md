# Java Assignment

# Task 1: 

## Write a program using Lambda expressions to sort a list of names.

<img width="723" height="200" alt="image" src="https://github.com/user-attachments/assets/ad60a421-0f3d-417b-a5d3-64d055a00d1f" />

for storing the names, ArrayList is used and for sorting, sort function of the ArrayList is used, where comparator has been used.


## Use Streams API to filter even numbers from a list and print them.

<img width="995" height="222" alt="image" src="https://github.com/user-attachments/assets/c92d1656-9ace-4221-a062-dc9caa5d3ad3" />

Here stream API is used, which takes inputs from many of the data types or collections and pass it as a stream of objects.

Elements of list are sent as streams with the help of stream()

filter is applied to stream, checking for the even number

the outputs from the filter are now used for printing


## Implement Optional to handle null values safely.

<img width="651" height="110" alt="image" src="https://github.com/user-attachments/assets/c02f96c9-af25-4a7d-8f17-6ad2b2c4abfe" />

Optional helps in determining whether the variable is containing null or not to avoid the nullPointerException and could be able to handle such cases as per our choice

## Write a program to demonstrate functional interface

The demonstration for the Functional Interface is there in the First part.

<img width="621" height="151" alt="image" src="https://github.com/user-attachments/assets/6c37e15a-e04f-4a16-92a7-28909bd452fd" />

After declaring the Functional Interface, it is utilised via Lambda Expression.

<img width="713" height="78" alt="image" src="https://github.com/user-attachments/assets/c0c2a826-be81-4235-9078-3eb28311679a" />

Functional Interface is a type of interface which contains only one abstract method.
The abstract method in this Functional Interface can be implemented using lambda expression.

## Learning

- Features introduced in Java 8
- Learned how to use Lambda Expression, it is nothing but a different way of implementing method
- Learned about the Functional Interface, there properties and its use.
- Learned how to implement Optional, to handle nullPointerException

# Task 2

## Create a simple Employee class

<img width="685" height="336" alt="image" src="https://github.com/user-attachments/assets/01b596ca-7a45-4375-bbfa-c36791186ddd" />

Employee class has been created along with the Constructor

## Override toString(), equals(), and hashCode().
<img width="1078" height="369" alt="image" src="https://github.com/user-attachments/assets/682f9ad0-5add-4223-a91b-fbfba462605d" />

toString(), equals() and hashCode() are overridden

## Demonstrate comparison of two employee objects.
<img width="845" height="94" alt="image" src="https://github.com/user-attachments/assets/3726a939-7c6f-419b-b441-602068aaa60d" />

Here two Employee objects were initialised and using overrided equals, comparison has been made.

## Learning

- Learned Constructor
- Learned about Object Class
- Learned about the inbuilt methods overriding
- Learned why do we need to override these functions, if we directly use them, then toString will print Employee@ADDRESS, and like wise equals will check for address match in the String format given before.


# Task 3:

## Write a program to demonstrate substring (), split (), replace(), equalsIgnoreCase(), trim()

- substring()
<img width="320" height="113" alt="image" src="https://github.com/user-attachments/assets/43976495-2c58-4140-99e4-21565df086c4" />

- split()
<img width="625" height="111" alt="image" src="https://github.com/user-attachments/assets/efe907d8-2f8c-4710-965c-ac2f0ee06aeb" />

- replace()
<img width="445" height="114" alt="image" src="https://github.com/user-attachments/assets/f3a10963-8e51-4c47-bcd1-01e6dc1d3a2e" />

- equalsIgnoreCase()
<img width="417" height="89" alt="image" src="https://github.com/user-attachments/assets/83adc3ef-057a-4eec-a049-d817a88239b8" />

- trim()
<img width="256" height="65" alt="image" src="https://github.com/user-attachments/assets/89916c08-980c-4c82-a764-2e84d421defd" />

## Bonus: Count the number of vowels in a given string using charAt()

<img width="622" height="55" alt="image" src="https://github.com/user-attachments/assets/79acee25-9e0d-44b6-925d-b8395a9527c1" />


## Learning 
- Explored various string functions
- Explored String Objects as well
- Explored String manipulations as well

# Task 4:

## Implement a program that creates two threads:
### One prints numbers 1–10.
### Another prints letters A–J.
### Use Thread class and Runnable interface separately.

<img width="514" height="823" alt="image" src="https://github.com/user-attachments/assets/65233412-7747-4bb5-a012-79fa54c02cbb" />

### Demonstrate synchronization by making threads print alternately.

<img width="832" height="445" alt="image" src="https://github.com/user-attachments/assets/b575b2af-82ac-41f4-8c1c-dcb4bb1e88c2" />

- Implemented two threads, one using thread class and one using Runnable Interface
- Synchronized the shared resources
- Resource was nothing but the printing utility shared by both threads simultaneously
- The objective of printing elements alternatively is acheived
  
<img width="673" height="70" alt="image" src="https://github.com/user-attachments/assets/19e76a70-2b65-4617-b267-1430cc237d80" />


## Learnings
- How to implement Multhithreading
- How to implement synchronisation for shared resources
- How to apply locks to the resources
- Types of threads like Main, child and Daemon



# Task 5:

## Use ArrayList to store student names and sort them
<img width="874" height="203" alt="image" src="https://github.com/user-attachments/assets/52cbe11e-e689-407c-9cad-3b8499db0d77" />

## Use HashMap to store student roll numbers and names, then retrieve them by key
<img width="1112" height="221" alt="image" src="https://github.com/user-attachments/assets/f541e69a-cd3c-4f86-bf95-b44b7bb641cb" />

## Use HashSet to remove duplicates from a list of integers
<img width="687" height="92" alt="image" src="https://github.com/user-attachments/assets/211a2b36-2806-40f6-b078-86b1a06a51d0" />

## Learnings
- Learned various types of Collection Data types
- Learned various methods for the operations over them
- Learned problem Solving, like by using in built utilities.

