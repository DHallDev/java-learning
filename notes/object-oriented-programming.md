# Object-Oriented Programming
Also known as **OOP**, this is a way to model real-world objects as software objects which contain both data and code. It starts with classes, which become the blueprints for objects.

---

## Rules & Mechanics
Just like real-world objects, programming objects have **2** major components:
1. **State**
   * Characteristics that describe the object.
   * Stores the information in fields (also known as variables or attributes).

2. **Behavior**
   * Actions that can be performed by the object or on the object.
   * These behaviors are done using methods.

In order to create an object you need to create a **class**, which is a type of blueprint. A **class** describes the data in fields and the behavior of that object in methods, making them known as **class members**.

1. **Fields**:
   * If a field is `static`, then it's tied to the **class** itself, **NOT** the object.
   * If a field is not `static`, it's called an **instance field** and each object can have different information stored in that field.
   * Any method that operates on instance fields needs to be non-static.
   * Assigned default values by Java if you don't assign it yourself:
     * `boolean` &rarr; `false`
     * `byte`, `short`, `int`, `long`, `char` &rarr; 0
     * `double`, `float` &rarr; 0.0

Classes are organized into logical groupings called packages. If I don't declare a package, the class belongs to the default package. A **class** is a top-level class if it is
defined in the source code file and not in a code block of another **class**, **type**, or **method**. They only have two valid access modifiers:

| Access Keywords | Description |
| :---: | :---: |
|`public` | any other **class** in any package can access this. |
| none | When the modifier is ommitted, this is called **package access**. This means the **class* in accessible only to classes in the same package. |

**Access Modifiers** don't just affect the class but also their members:

| Access Keyword   | Description |
| :---: | :---: |
| `public` | any other **class** in any package can access this. |
| `protected` | allows **classes** in the smame package, and any subclasses in other packages to have access |
| none | When the modifier is ommitted, this is called **package access**. This means the **class* in accessible only to classes in the same package. |
| `private` | no other **class** can access this member |

Now If you make the members `private` you don't want the public to have easy access to them. However, there may come a time when you need to update these fields.
That's what getters and setters are for
* Getters: a method on a **class** that retrieves the value of the `private` field and returns it
* Setters: a methods on a **class** that sets the value of a `private` field.
  * Use the keyword `this` to access the `private` fields on the class so that the program know what your trying to change.


---

## Why is this important
* **Reusability**: Once you build a class blueprint, you can stamp out as many independent objects as you need without rewriting code.
* **Organization**: It groups related variables and methods together into clean, self-contained units that mirror how we think about the real world.
* **Data Protection (Encapsulation)**: By making fields `private` and using setters, can bundle behavior and attributes on a single object, and hide those things from public access (e.g., setting a car's doors to `-4` or its make to `null`).

---

## Structure Of Creating An Object

### 1. Defining the Blueprint (`Car.java`)
```java
public class Car {
    // Instance fields (State)
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    // Getter
    public String getMake() {
        return make;
    }

    // Setter with validation
    public void setMake (String make) {
        if (make == null) {
            make = "Unknown";
        }
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake) {
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> this.make = "Unsupported ";
        }
    }

    // Instance method (Behavior)
    public void describeCar() {
        System.out.println(doors + "-Door " + 
                color + " " + 
                make + " " + 
                model + " " + 
                (convertible ? "Convertible" : ""));
    }
}
```

### 2. Instantiating the Object (`Main.java`)
```java
public class Main {
    public static void main(String[] args) {
        // Creating a new instance of Car in memory
        Car car = new Car(); 
        
        // Using a setter to update state
        car.setMake("Porsche"); 
        
        // Calling a behavior method
        car.describeCar(); 
    }
}
```

---

## Common Mistakes:
* **Forgetting the `new` keyword**: Declaring `Car car;` only creates a variable reference that creates a **complier time error** .
However, if you assign it the value of `null` you get a `NullPointerException`, meaning you created an object, but the
reference doesn't point to anything.
* **Making fields** `public`: Exposing fields directly allows any external class to overwrite them with invalid data, bypassing your 
validation logic.
* **Shadowing variables without `this`**: Writing `make = make;` inside a setter assigns the parameter to itself rather than the 
class field. Always use `this.make = make;` when parameter and field names match.
* **Calling instance members from `static` methods**: Trying to access non-static fields or methods directly inside `public 
static void main` without first creating an object instance causes a compiler error.

---

## Summary:
* A **class** is the blueprint; an **object** is the actual instance built in memory using the `new` keyword.
* Objects combine **state** (fields) and **behavior** (methods).
* Keep instance fields `private` (encapsulation) and expose them safely through `public` **getters** and **setters**.

---

## Side Notes:
* **Default Values**: Unlike local variables inside methods, Java automatically assigns default values to uninitialized class fields (`0` for numbers, `false` for booleans, and `null` for objects like `String`).
* **The `this` keyword**: A special reference in Java that refers to the current object instance executing the code.
* **Naming Conventions**: Class names start with a capital letter (`Car`), while fields and methods start with a lowercase letter (`getMake`, `setMake`).
