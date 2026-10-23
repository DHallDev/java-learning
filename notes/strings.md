# Strings
A String is a class that contains a sequence of characters. Unlike primitive data types, Strings are **objects**. This needs to be remembered because they behave like the other data types. They are one  
of the most commonly used types in Java

---

## Rules & Mechanics
- They are **OBJECTS, NOT PRIMITIVES**
- Must declare with capitalize "S" in String to use 
- Limited by the amount of memory space (heap) on your computer, Which is the value stored in `Integer.MAX_VALUE`
- Created using double quotes (`" "`), not single quotes
- Immutable - meaning once they are created, their value cannot change

      Strings can't be changed once created  
      String name = "Johnson";  
      name = name + " Johnson";  
This did **not** modify name - I created a new `String` with the called `name` that holds the value `"Johnson Johnson"`. The old String is discarded by Java as a result.

- Can call methods on Strings (since they are objects)
- Can be concatenated using `+` or `+=`

---

## Why is this important
This object allows my program to:
- Store text
- display messages
- take user input
- build output
- label data
- work with characters in groups  

You can see strings using in my `HelloWorld.java`.

---

## Examples

### 1. String Literal
    String message = "Hello World";

### 2. Escape Sequences
These are used to include special characters inside Strings.
- `\"` &rarr; double quote

      String text = "He said \"Hello\" to me.";
- `\\` &rarr; backslash

      String backslash = "\\Kinda like leaving a comment
- `\n` &rarr; new line

      String newLine = "This is the first line.\nAnd this woulld be the second.
- `\t` &rarr; tab

      String tab = "\tFor when you want to ident 4 spaces in a String.";

### 3. Concatenation

    String firstName = "Johnson";
    String lastName = "Johnson";
    String fullName = firstName + " " + lastName;
    System.out.print("Full Name is " + fullName);
Full Name is Johnson Johnson

### Usage of Strings in my `HelloWorld.java`
My first program uses a String literal:

    System.out.println("Hello World");  

---

## Common Mistakes
- Using single quotes (`' '`) instead of double quotes (`" "`)
- Forgetting Strings are **objects**
- Assuming Strings can be changed directly
- Using `==` to compare Strings instead of `.equals()` method
- Confusing `char` with `String`

---

## Summary
Strings store text and behave differently from primitive data types because they are objects.  
They are:
- immutable
- created using double quotes
- capable of calling methods
- used everywhere in Java

## Side-Notes
- A String `+` anything else, gives us a String as a result. concatenating anything after the String as text to the initial String. 