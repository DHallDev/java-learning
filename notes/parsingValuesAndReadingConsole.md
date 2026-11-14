# Parsing Values And Reading Console Input
When we read data from a file or from user input, it's common for that data to be stored as a String initially. We need someway to convert this to a numeric data type.

---

## Rules & Mechanics
* Input read from the console always comes in as a `String`
* Java uses **Wrapper Classes** to parse strings into numeric primitives:
  * `Integer.parseInt(String)` &rarr; converts to `int`
  * `Double.parseDouble(String)` &rarr; converts to `double`
  * `Long.parseLong(String)` &rarr; converts to `long`
  * `Boolean.parseBoolean(String)` &rarr; converts to `boolean`
* `System.console().readLine()` prints a prompt and waits for the user to hit **Enter**
* `System.console()` **only works in a real command-line terminal**
* Most IDEs (like IntelliJ) disable the interactive console in their run window, causing `System.console()` to return `null`
* `Scanner` (must put `import java.util.Scanner` at the top of the class) is used as a fallback when running inside an IDE

|Technique|Description|
|:------:|:-------------:|
|System.in|Can read input from the console or terminal. Not easy for beginners|
|System.console|Reads a single line and can prompt the user for information. Doesn't work with IDE's due to the environments disabling it|
|Command LIne Arguments|Calls the Java program and specifies data in the call. Commonly used but not useful for making interactive applications|
|Scanner|Built as a common way to read input, either from `System.in` or a file.|

---

## Why Is This Important

* Allows programs to accept dynamic user input instead of hardcoding values
* Enables math operations on user input (since you cannot subtract or multiply a `String`)
* Prevents string concatenation bugs when using the `+` operator

> Parsing basically keeps Java from treating `"2026" + 1` as `"20261"` instead of `2027`

---

## Examples

### 1a. Parsing Strings Into Numbers
Before doing any math on string variables, you have to parse them using a wrapper class.

    int currentYear = 2026;
    String usersDateOfBirth = "1996";

    int dateOfBirth = Integer.parseInt(usersDateOfBirth);
    System.out.println("Age = " + (currentYear - dateOfBirth));

    String usersAgeWithPartialYear = "22.5";
    double ageWithPartialYear = Double.parseDouble(usersAgeWithPartialYear);
    System.out.println("The user says he's " + ageWithPartialYear);

### 1b. Reading Console Input (`System.console()`)
This is how you prompt a user and read their input directly from an external terminal:

    public static String getInputFromConsole(int currentYear) {
      String name = System.console().readLine("Hi, What's your Name? ");
      System.out.println("Hi " + name + ", Thanks for taking the course!");

      String dateOfBirth = System.console().readLine("What year were you born? ");
      int age = currentYear - Integer.parseInt(dateOfBirth);

      return "So you are " + age + " years old";
    }

### 2. Reading input using `Scanner`
In order to first use Scanner you must first instantiate it (create a new scanner object)

    Scanner sc = new Scanner(System.in)
    String name = sc.nextLine();

If you want to read a file, it would look like this:

    Scanner sc = new Scanner(new File("nameOfFileOnFileSystem"));

---

## Common Mistakes
* Trying to do math directly on a `String` without parsing it first
* Using `+` with a `String` and a number, accidentally concatenating them instead of adding
* Running `System.console()` inside an IDE's default run window and getting a `NullPointerException`
* Passing non-numeric text (like `"twenty"` or `"abc"`) into `Integer.parseInt()`, which throws a `NumberFormatException`
* Trying to parse a decimal string like `"22.5"` using `Integer.parseInt()` instead of `Double.parseDouble()`

---

## Summary
Parsing values lets Java turn raw text input into real numbers that can be calculated and compared. `System.console()` offers a 
simple built-in way to read that input from a terminal, and `Scanner` is a more beginner tool that lets me use it in a traditional IDE.
