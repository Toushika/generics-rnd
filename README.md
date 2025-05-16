
## 📦 Java Generics Example Project

This is a simple Java project that shows how to use **generics** with classes and methods.

---

### ❓ What Are Generics?

**Generics** in Java let you write code that works with **different data types**, but still keeps **type safety**.

Instead of writing the same code for `String`, `Integer`, etc., you write it once using a **type placeholder** like `<T>`.

🔹 Example:

```java
Box<String> box = new Box<>();
Box<Integer> box2 = new Box<>();
```

* Here, `Box<T>` is a generic class.
* `T` can be **any type**: `String`, `Integer`, `User`, etc.
* The compiler makes sure you don’t accidentally put the wrong type inside.

**Benefits:**

* Reusable code
* Fewer errors
* No need for casting

---

### 📂 Files Included

* **Box.java**
  A generic class that can hold any type of value (like `String`, `Integer`, etc.).
  It also has a method `getData(...)` to return simulated data using type casting.

* **Printing.java**
  A utility class with a generic method `printArray(...)` to print any type of array (like `String[]`, `Integer[]`, etc.).

* **Main.java**
  The main class to run and test everything.

---

### 🧪 What This Project Does

1. **Creates a Box for Strings and Integers**

   * Stores and prints values using generics.
2. **Prints arrays of Strings and Integers**

   * Uses a generic method to print any type of array.
3. **Fetches simulated data using generics**

   * Demonstrates how `Class<T>` is used to safely cast data.

---

### ✅ Example Output

```text
-------- Box class as String --------
Hello World!
-------- Box class as Integer --------
100
--------Utilize Print Array method for String--------
Alesco
adrian
liana
tina
--------Utilize Print Array method for Integer--------
10
20
30
40
50
John Doe
```

---

### 💡 What You Learn

* How to use **generic classes** like `Box<T>`
* How to write **generic methods** like `printArray`
* How to safely cast using `Class<T>` and `.cast()`
* Why generics help avoid type errors in your code

---

### 🚀 How to Run

1. Open this project in an IDE like IntelliJ or Eclipse.
2. Run the `Main` class.
3. See the output in your console.

---
