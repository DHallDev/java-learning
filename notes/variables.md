# Variables

A variable is a type of container we create to store information to be accessed later. Every variable
in Java has **three things**:
- a **type** &rarr; the kind of data it holds
- a **name** &rarr; how you refer/call it
- a **value** &rarr; the actual data stored

---

## Rules & Mechanics

- Can't have incompatible data inside
- Must be declared before use
- Type must be specified using a **Java keyword**
- Access to variable depends on **scope**
- Can't use keywords as a name
- A variables type can't be changed after declaring it

---

## Why is this important

Variables allow my program to:
- Remember information
- Perform calculations
- Store users input
- Control logic
- Build more complex structures

---

## Structure Of A Variable

### Declaration vs. Initialization:

#### Declaration 

This is you telling Java that a variable exist and Java will reserve memory for it:

    int age;

#### Initialization 

This is when you give the variable a value:

    age = 25;

#### Declaration & Initialization

When you know exactly what value you want to put inside the variable when declaring it, why waste time.

    int age = 25;

### Naming Rules:
- Must start with a **letter**, `_`, or `$`
- Can't start with a number
- Can't have spaces
- They are case-sensitive (meaning that `age` and `Age` are different variables)
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