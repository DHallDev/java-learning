# Catching And Handling Exceptions (TO BE FURTHER BUILT UPON AT A LATER DATE)
An Exception is an error that happens in code and many of them can be predicted and names. To catch an exception you must create a code block around the code that
would create the error better known as the `try/catch` code block

### Try/Catch Format

    try {
        // statements that might get errors
    } catch (Exception e) {
        // code to 'handle' the exception
    }

Please note: 
* `Exception` would be the name of the `Exception` you are trying to catch (e.g. `NullPointerException`)
* `e` is the variable name in case you want to save information/log the error later down the rode. It can be any valid variable name.
