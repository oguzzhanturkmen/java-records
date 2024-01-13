# Records

Java Records, introduced in Java 14 as a preview feature and later finalized in Java 16, provide a concise way to create immutable data classes. Let's dive into the details and explore this feature with examples.

### **1. Introduction to Records**

A record in Java is a special kind of class. It is intended to be a simple, concise way to create immutable data-carrying classes. Before records, developers had to write a lot of boilerplate code (like getters, setters, **`hashCode`**, **`equals`**, **`toString`** methods) for such classes.

### **Syntax**

```java

public record RecordName(Type1 field1, Type2 field2, ...) { }

```

### **2. Characteristics of Records**

- **Immutable**: Fields of a record are final and cannot be modified after the object is constructed.
- **Public Fields**: The fields of a record are public, but they are also final, so they are safe from modification.
- **Automatic Getters**: For each field, a public getter method is automatically generated.
- **No Setters**: Since the fields are final, there are no setter methods.
- **Compact Constructors**: Records allow you to define a compact constructor, which is a shorthand for a constructor that only sets the record's fields.
- **Custom Methods**: You can add custom methods to a record.
- **Automatic `equals`, `hashCode`, and `toString`**: These methods are automatically provided and operate on all fields.

### **3. Basic Example**

```java

public record Person(String name, int age) { }

```

Usage:

```java

Person person = new Person("John", 30);
System.out.println(person.name());  // John
System.out.println(person.age());   // 30

```

### **4. Custom Methods in Records**

```java

public record Employee(String name, int age) {
    public String greet() {
        return "Hello, my name is " + name;
    }
}

```

Usage:

```java

Employee employee = new Employee("Alice", 28);
System.out.println(employee.greet()); // Hello, my name is Alice

```

### **5. Compact Constructor**

```java

public record Car(String model, int year) {
    public Car {
        if (year < 2000) {
            throw new IllegalArgumentException("Year must be after 2000");
        }
    }
}

```

Usage:

```java

Car car = new Car("Tesla", 2021);  // Valid
// Car oldCar = new Car("Ford", 1990); // This would throw an IllegalArgumentException

```

### **6. Record with Custom `equals`, `hashCode`, and `toString`**

While you generally don't need to override **`equals`**, **`hashCode`**, and **`toString`**, you can if you need specific behavior.

```java

public record Book(String title, String author) {
    @Override
    public String toString() {
        return title + " by " + author;
    }
}

```

Usage:

```java

Book book = new Book("1984", "George Orwell");
System.out.println(book); // 1984 by George Orwell

```

### **Conclusion**

Records are a powerful feature in Java, especially for creating data classes with minimal boilerplate. They ensure immutability, which is a key aspect of functional programming and helps in creating thread-safe applications. However, they are not a one-size-fits-all solution and should be used when their characteristics align with the requirements of the data class you're designing.
