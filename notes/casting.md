# Casting

Casting is the process of converting one numeric data type into another.

---

## Rules & Mechanics:

- Casting converts a value from one type to another
- Some conversions happen **automatically** &rarr; widening
  - Order: `byte` &rarr; `short` &rarr; `int` &rarr; `long` &rarr; `float` &rarr; `double`
- Some conversions require **manual** casting &rarr; narrowing
  - Narrowing can cause you to **lose data**
- Casting only works between **compatible types**
- Casting doesn't modify the original variable - it creates a new value!

---

## Why is this important:

Allows my program to:
- Mix different numeric data types
- Perform calculations safely
- Avoid complier errors
- Control precision
- Convert values intentionally

This process is most commonly used when working with math expressions

---

## Structures of Casting:

### 1. Widening Casting (Automatic)

Converts a smaller type into a larger type.

#### Example:

    int myInt = 10;  
    double myDouble = myInt;    // automatic widening

### 2. Narrowing Casting (Manual)

Converts a larger type into a smaller type. Requires the use of `()`:

    double myDouble = 9.8;  
    int myInt = (int) myDouble;    // manual casting  

Result: `myInt = 9` (the decimal is truncated)

### 3. Casting in Expressions

The complier treats **constant expressions** differently from **variable expressions**. Basically Java can evaluate math if you use literal values, but gets
confused when you replace them with variables instead:

#### Constant Expression (OK)
    byte x = 10 / 2;    // OK (complier knows the result is 5)

#### Variable Expressions (ERROR)

    byte a = 10;  
    byte b = a / 2;    // ERROR (must cast)  

#### Fix:  
    byte b = (byte) (a / 2);

### 4. Casting with Characters

`char` can be cast to and from numeric data types.

    char letter = 'A';  
    int code = letter;    // 65
    char next = (char) (letter + 1);    // 'B'

---

## Common Mistakes:

- Forgetting to cast during narrowing
- Assuming casting **rounds** values (it **truncates**)
- Casting incompatible types
- Overflow when narrowing large values
- Using casting to "fix" logic errors
- Confusing `char` casting with String conversion

---

## Summary:

Casting converts values between compatible types.  
- **widening** &rarr; safe, automatic
- **narrowing** &rarr; risky, manual  

Essential for:
- Arithmetic
- Precision control
- Mixing types
- Avoiding compiler errors

## Side-Notes:

- Narrowing can cause overflow or underflow
- Casting does not modify the original variable
- Integer division always truncates
- `float` and `double` lose precision when narrowed