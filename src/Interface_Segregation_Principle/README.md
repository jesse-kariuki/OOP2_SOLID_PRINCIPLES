# Interface Segregation Principle (ISP) in Java

This project demonstrates the Interface Segregation Principle using a clear example comparing bad and improved design.

---

## ❌ 1. Worker Interface — One Large Interface (Violates ISP)

This interfaces forces all implementers to define methods they may not need, leading to `UnsupportedOperationException` in some classes.

```java
public interface Worker {
    void work();
    void eat();
    void drive();
}
```

---
## 2. Robot.java
The Robot class is being forced to implement methods it doesn’t need.

``` java

public class Robot implements Worker {
    public void work() {
        System.out.println("Robot is working");
    }

    public void eat() {
        throw new UnsupportedOperationException();
    }

    public void drive() {
        throw new UnsupportedOperationException();
    }
}
```
---
## ✅3. Segregated Interfaces (Adheres to ISP)
 Split the large interface into smaller, focused ones, allowing classes to only implement what they need.

```java
public interface Workable {
    void work();
}

public interface Eatable {
    void eat();
}

public interface Drivable {
    void drive();
}
```

---
## 4. Robot.java — Now Follows ISP
It only contains a single method: work().
No unnecessary methods.
This makes the code cleaner, safer, and easier to maintain.
``` java
public class Simple_Robot implements Workable {
    public void work() {
        System.out.println("Robot is working");
    }
}
```

---
## 5. HumanWorker.java — Can Do More
The HumanWorker class can implement all three interfaces, because a human can work, eat, and drive.

``` java
public class HumanWorker implements Workable, Eatable, Drivable {
public void work() {
System.out.println("Human is working");
}

    public void eat() {
        System.out.println("Human is eating");
    }

    public void drive() {
        System.out.println("Human is driving");
    }
}
```

---

## 6. Main.java — Demo
The `Main.java` class shows how the Interface Segregation Principle is applied in action.

- The `Robot` only works — it doesn't eat or drive.
- The `HumanWorker` can work, eat, and drive — each capability coming from a separate interface.

``` java
public class Main {
    public static void main(String[] args) {
        // Robot only implements Workable
        Workable robot = new Simple_Robot();
        robot.work();

        System.out.println();

        // HumanWorker implements Workable, Eatable, Drivable
        HumanWorker human = new HumanWorker();
        human.work();
        human.eat();
        human.drive();
    }
}
```

### 🖥️ Output
Simple Robot is working

Human is working 

Human is eating

Human is driving

