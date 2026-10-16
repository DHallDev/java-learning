# Primitive Data Types
Primitive data types are the most basic forms of data in Java. They store simple values directly in memory. Every variable I 
create using a primitive type holds a single, simple value.

---

## Rules & Mechanics:
- Has a fixed size and range
- Need to use the correct **keyword** as the identifier
- Assigned data **value** must match the **type**
- Can't call methods on primitive data types (except through wrapper classes)

---

## Structure Of Primitive Data Types

### The 8 Primitive Types
| Type       | Size                            | Range / Meaning           | Example                     |
|------------|---------------------------------|---------------------------|-----------------------------|
| `byte`     | 1 byte                (8 bits)  | -128 to 127               | `byte b = 10;`              |
| `short`    | 2 bytes               (16 bits) | -32,768 to 32,767         | `short s = 1000;`           |
| `int`      | 4 bytes               (32 bits) | ~ -2 billion to 2 billion | `int age = 25;`             |
| `long`     | 8 bytes               (64 bits) | very large integers       | `long distance = 100000L;`  |
| `float`    | 4 bytes               (32 bits) | decimal (less precise)    | `float price = 10.99f;`     |
| `double`   | 8 bytes               (64 bits) | decimal (more precise)    | `double pi = 3.14159;`      |
| `char`     | 2 bytes               (16 bits) | single Unicode character  | `char letter = 'A';`        |
| `boolean`  | 1 byte (conceptually) (8 bits)  | true or false             | `boolean isActive = true;`  |

### Default Values:
When used for fields or classes
- `byte`, `short`, `int`, `long` &rarr; `0`
- `float`, `double` &rarr; `0.0`
- `char` &rarr; `'\u0000'`
- `boolean` &rarr; `false`

Local variables do not get default values

### 1. Whole Number Data Types:

    byte = 5; 
    short = 17;
    int score = 100;
    long population = 80_000_00L;

### 2. Real Number (Decimal) Data Types:

    float temperature = 98.6f;
    double radius = 3.14;

### 3. Single Character:

    char grade = 'A';

### 4. Boolean (True/False):

    boolean isAwake = true;

---

## Why Is This Important:
Primitive data types allow my program to:
- Store many kinds of information
- Perform calculations
- Control logic

They are the foundation of Java’s type system.

---

## Common mistakes:
- Incompatible data (e.g. `int x = 5.5`);
- Using double quotes (`" "`) instead of single quotes (`' '`) for `char` data types
- Forgetting the `f` suffix for a `float` or the `L` suffix for a `long`
- Trying to initialize a variable larger/smaller than the data type can hold
- Causing Integer Wraparounds:
  - Overflow: Using an expression that evaluates to a value larger than the maximum value, causing it to wrap around to the minimum value

        System.out.print("Busted Max value = " + (Integer.MAX_VALUE + 1)); // Busted Max value = -2147483648
        System.out.print("Busted Max value = " + (2147483647 + 1));        // Same as above

  - Underflow: Using an expression that evaluates to a value smaller than the smaller value, causing it to wrap around to the maximum value

        System.out.print("Busted Min value = " + (Integer.MIN_VALUE - 1)); // Busted Min value = 2147483647
        System.out.print("Busted Min value = " + (-2147483648 - 1));       // Same as above
---

## Summary:
Primitive types store simple values directly in memory. They are the foundation for all other data
structures  in Java. This leads to:
- variables
- operators
- casting
- methods

## Side-Notes:
- `int` is the default data type for whole numbers
- `double` is the default data type for floating-point numbers
- The Java compiler evaluates **constant expressions**, but not **variable expressions**
- Can use scientific notation instead when declaring a `double` or `float` variable
- If a number is too large to read you can use `_` where comma's would be.
- Adding `char` values will get their byte values returned