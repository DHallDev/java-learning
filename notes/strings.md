## Strings
A string is a sequence of characters used to store text. Unlike primitive data types, Strings are  
**objects**. This needs to be remebered because they behave like the other data types. They are one  
of the most commonly used types in Java

## Rules & Mechanics
- They are **OBJECTS, NOT PRIMITIVES**
- Created using double quotes (`" "`), not single quotes
- Immutiable - meaning once they are created, their value cannot change
  - This means any modification done to the String actual creates a **new** String
- Can call methods on Strings (since they're objects)
- Can be concatenated using `+` or `+=`

## Why is this important
This object allows my program to:
- Store text
- display messages
- take user input
- build output
- label data
- work with characters in groups  

You can see strings using in my `HelloWorld.java`.

## Examples
### String Literal
String message = "Hello World";

### String Immutability
Strings can't be changed once created  
String name = "Darius";  
name = name + " Johnson";  
$\uparrow$: Did **not** modify name - I created a new String with the name `name` that holds the value
`"Darius Johnson"`. 

### Common String Operations
#### Concatenation
String  fullName = firstName + " " + lastName;

### Escape Sequences
These are used to include special characters inside Strings.
- `\"` $\rightarrow$ double quote
- `\\` $\rightarrow$ backslash
- `\n` $\rightarrow$ new line
- `\t` $\rightarrow$ tab
#### Example:
String text = "He said \"Hello\" to me.";

### Premium usage of Strings in my `HelloWorld.java`
My first program uses a String literal:  
System.out.println("Hello World");  

## Common Mistakes
- Using single quotes (`' '`) instead of double quotes (`" "`)
- Forgetting Strings are **objects**
- Assuming Strings can be changed directly
- Using `==` to compare Strings instead of `.equals()` method
- Confusing `char` with `String`

## Summary
Strings store text and behave differently from primitive data types because they are objects.  
They are:
- immutable
- created using double quotes
- capable of calling methods
- used everywhere in Java

## Side-Notes
- String concatenation creates new objects
- Many String methods return **new** Strings
- The `.equals()` methods compares the values