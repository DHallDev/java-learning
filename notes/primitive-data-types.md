## Primitive Data Types
Primitive data types are the most basic forms of data in Java. They store simple values directly in memory and are not objects. Every variable you create using a primitive type holds a single, simple value.

## Rules & Mechanics:
- Has a fixed size and range
- Use the correct word as the identifier
- Assigned data value must match the type
- Values are stored directly, not as objects
- Can't call methods on primitive data types (except through wrapper classes)

## The 8 Primitive Types
| Type | Size | Range / Meaning | Example                    |
| --- | --- | --- |----------------------------|
| `byte` | 1 byte | -128 to 127 | `byte b = 10;`             |
| `short` | 2 bytes | -32,768 to 32,767 | `short s = 1000;`          |
| `int` | 4 bytes | ~ -2 billion to 2 billion | `int age = 25;`            |
| `long` | 8 bytes | very large integers | `long distance = 100000L;` |
| `float` | 4 bytes | decimal (less precise) | `float price = 10.99f;`    |
| `double` | 8 bytes | decimal (more precise) | `double pi = 3.14159;`     |
| `char` | 2 bytes | single Unicode character | `char letter = 'A';`       |
| `boolean` | 1 byte (conceptually) | true or false | `boolean isActive = true;` |

## Examples
**Integer types:**
- int score = 100;
- long population = 8000000L;

**Floating-point types:**
- float temperature = 98.6f;
- double radius = 3.14;

**Character:**
- char grade = 'A';

**Boolean:**
- boolean isAwake = true;

## Why is this important:
Primitive types allow your program to:
- store numbers
- store characters
- store true/false values
- perform calculations
- control logic
- build more complex structures later (arrays, objects, collections)

They are the foundation of Java’s type system.

## Default Values:
When used for fields or classes 
- byte, short, int, long $\rightarrow$ `0`
- float, double $\rightarrow$ `0.0`
- char $\rightarrow$ `'\u0000'`
- boolean $\rightarrow$ `false`

Local variables do not get default values

## Common mistakes:
- Incompatible data (e.g. `int x = 5.5`);
- Using double quotes (" ") instead of single quotes (' ') for `char` data types
- forgetting the `f` suffix for `float`
- Overflow: Using an expression that evaluates to a larger value than what is allowed in a data type 
- Underflow: Using an expression that evaluates to a smaller value than what is allowed 
in a data type

## Summary:
Primitive types store simple values directly in memory. They are the foundation for all other data
structures  in Java. This leads to:
- variables
- operators
- casting
- arrays
- methods
- objects 
- classes

## Side-Notes:
- `int` is the default data type for whole numbers
- `double` is the default data type for floating-point numbers
- Assigning a literal value that goes over/under the max/min value results in a error "lossy 
conversion" when using a different data type or "integer number too large" when using an int;
- The Java compiler evaluates constant expressions, but not variable expressions (more information on
in `casting.md`)
- Can use scientific notation instead when declaring a double or float variable
- Adding `char` values will get their byte values returned
- You can use a unicode for a `char`