## Casting
Casting is the process of converting one numeric data type into another

## Rules & Mechanics
- Casting converts a value from one type to another
- Some conversions happen **automatically**, this is called (widening)
- Some conversions require **manual** casting, this is called (narrowing)
- Narrowing can cause you to **lose data**
- Casting only works between **compatible** types
- Casting doesn't change the original variable - it creates a new value!

## Why is this imporatant
Allows my program to:
- mix different numeric data types
- perform calculations safely
- avoid complier errors
- control precision
- convert values intentionally

This process is most commonly used when working with math expressions

## Examples
### 1. Widening Casting (Automatic)
Converts a smaller type into a larger type.  
Safe - no data loss.  
Order:  
`byte` $\rightarrow$ `short` $\rightarrow$ `int` $\rightarrow$ `long` $\rightarrow$ `float` $\rightarrow$ `double`  
#### Example:
int myInt = 10;  
double myDouble = myInt;    // automatic

### 2. Narrowing Casting (Manual)
Converts a larger type into a smaller type.  
Risky - could be some data loss or even lead to overflow.  
Requires `()`:  
double myDouble = 9.8;  
int myInt =(int) myDouble;  // manual  
Result: `myInt = 9` (decimal is truncated)

### 3. Casting in Expressions
The complier treats **constant expressions** differently from **variable expressions**
#### Constant Expression (OK)
byte x = 10 / 2;    // OK (compiler knows the result is 5)

#### Variable Expressions (ERROR)
byte a = 10;  
byte b = a / 2;     // ERROR (must cast)  
Fix:  
byte b = (byte) (a / 2);

### 4. Casting with Characters
`char` can be cast to and from numeric types.  
char letter = 'A';  
int code = letter;      // 65
char next = (char) (letter + 1);    // 'B'

## Common Mistakes
- Forgetting to cast during narrowing
- Assuming casting rounds values (it truncates)
- Casting incompatible types
- Overflow when narrowing large values
- Using casting to "fix" logic errors
- Confusing `char` casting with String conversion

## Summary
Casting converts values between compatible types.  
- **widening** (automatic, safe)
- **narrowing** (manual, risky)  

Essential for:
- arithmetic
- percision control
- mixing types
- avoiding compiler errors

## Side-Notes
- Narrowing can cause overflow or underflow
- Casting does not modify the original variable
- Integer division always truncates
- `float` and `double` lose precision when narrowed
- `char` casting reveals Unicode values