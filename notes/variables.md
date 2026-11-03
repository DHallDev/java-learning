# Variables

A variable is a way to store information on my computer RAM (random access memory). They are then accessed later by using the name I give them. Every variable in Java
consists of **three things**:
- **type** &rarr; the kind of data it holds
- **name** &rarr; how you refer/call it
- **value** &rarr; the actual data stored

A local variable is a variable available for use by the code block in which it was declared and any code blocks that are contained by 
a declaring block. The term for this is **scope**. "In scope" basically means the variable can be used by an executing block
or any nested blocks, and "Out of scope" means the variable is no longer available for use.

For Best Practices:

- Declare and initialize variables in the same place, if possible
- Declare variables in the narrowest scope possible
  - Meaning if my variable is only used in a nested snippet of code, that's where I declare it

---

## Rules & Mechanics

- **value** must match the **type** specified
      
      // Can't do this
      int age = 5.5;

      // Ok
      int age = 5;

- **type** must be specified using a **keyword**
- Must be declared before use
- Can't use a **keyword** as a name

      // Can't do this
      int int = 5;

      // Ok
      int age = 5;

- Access to variable depends on **scope**
- A variables **type** can't be changed after declared
- A variables contents can be changed
- Once declared, you cant redeclare a variable:

      // Can't do this
      int age = 5;
      int age = 7;

      // Ok
      int age = 5;
      age = 5;

- **value** can be in the form of an expression
---

## Why is this important

Variables allow my program to:
- Remember information
- Perform calculations
- Store input
- Control logic

---

## Structure Of A Variable

### 1. Declaration

This is you telling Java that a variable exist and Java will reserve memory for it:

    int age;

### 2. Initialization

This is when you give the variable a value:

    age = 25;

### 3. Declaration & Initialization

When you know exactly what value you want to put inside the variable when declaring it, why waste time.

    int age = 25;

### Naming Rules:

- Must start with a **letter**, `_`, or `$`
- Can't start with a number
- Can't have spaces
- They are case-sensitive (meaning that `age` and `Age` are different names)
- Should be descriptive
- Use camelCase (`totalHealth`, `maxDamage`);

---

## Common Mistakes:

- Forgetting to initialize a variable
- Using the wrong type
- Naming variables poorly
- Mixing `=` (assignment) with `==` (comparison)
- Forgetting the "L" or "f" suffix for longs and floats: 
  - `L` for long values (`100L`)
  - `f` for float values (`3.14f`)
  - for more information see: `notes/primitive-data-types.md`

---

## Summary:

Variables are the building blocks of Java programs. They store data, allow calculations, and make code
dynamic. Understanding variables sets the foundation for:
- operators
- control flow
- methods
- objects
- classes
- data structures

## Side Notes:

- If using a **switch** statement, if you declare a variable in case, any cases including the default case below can use that 
variable.