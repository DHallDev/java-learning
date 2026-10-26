# Methods Lesson

This folder contains the example code used in Tim Buchalka’s *Java Programming Masterclass* lesson on **methods**.  
The goal of this lesson is to understand how to declare methods, pass parameters, return values, and invoke methods from other parts of the program.
This lesson also shows how the requirements to make an overloaded method and how it can be used in code.

---

## 📘 Concepts Demonstrated

### 1. Method Declaration

- Declaring a method with a return type (`void`, `int`, etc.)
- Adding parameters to the method header
- Understanding the method signature (name + parameters)

### 2. Method Invocation

- Calling methods from `main`
- Passing arguments that match the parameter list
- Using return values inside expressions or assignments

### 3. Overloaded Method

- Declaring a method with the same name but different `method signature`
- Invoking a method inside another to cut down on duplication

### 4. Return Types

- Returning computed values
- Using `void` when no value is returned
- Understanding how `return` transfers control back to the caller

### 5. Basic Conditional Logic

- Simple `if-then` statements inside a method
- Using parameters as local variables

---

## Files Included

### 1.MainChallenge.java

Contains:
- Updated code originally done from Tim's If-Conditionals lessons
- A method that calculates a score using parameters
- A return-type method that sends a value back to the caller
- Metho invocation examples inside `main`
- Basic conditional logic used inside the methods

#### Main.java

Contains:
- Two methods with the same name that calculates a score using parameters
- Metho invocation examples, inside both `main` and the `calculateScore` with no parameters
- A method with no parameters to showcase that it's the value inside the parameters, not their names
that is important to method overloading.

These files serves to show how effect methods are at reducing code duplication and organizing logic.

--- 

## Related Notes

- **Methods:** `notes/methods.md`