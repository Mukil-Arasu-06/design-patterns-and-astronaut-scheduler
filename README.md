# design-patterns-and-astronaut-scheduler
Java implementations of design patterns (Part 1) and a console-based Astronaut Daily Schedule Organizer using Singleton, Factory, and Observer (Part 2).



# Assignment – Design Patterns & Astronaut Daily Schedule Organizer

This repository contains the **complete solution** for the two-part assignment:

1. **Part 1:** Six simple design pattern implementations (Builder, Prototype, Adapter, Decorator, Strategy, Command).  
2. **Part 2:** Astronaut Daily Schedule Organizer – a console-based application demonstrating Singleton, Factory, and Observer patterns.

The focus is on clarity, correct usage of patterns, and fulfilling mandatory requirements.

---

## 📌 Part 1: Six Design Pattern Examples

### 🔹 Creational Patterns
- **Builder Pattern** – Demonstrates building a `Computer` step by step using a `ComputerBuilder`.
- **Prototype Pattern** – Demonstrates cloning a `Book` object.

### 🔹 Structural Patterns
- **Adapter Pattern** – Demonstrates making an `AudioPlayer` support both MP3 and MP4 playback with an adapter.
- **Decorator Pattern** – Demonstrates dynamically adding formatting (`BoldDecorator`) to a `Text` object.

### 🔹 Behavioral Patterns
- **Strategy Pattern** – Demonstrates switching payment methods (`CreditCardPayment`, `PaypalPayment`) in a `ShoppingCart`.
- **Command Pattern** – Demonstrates controlling a `Light` using commands executed by a `RemoteControl`.

Each pattern is implemented in its own folder with a runnable demo class.

---

## 📌 Part 2: Astronaut Daily Schedule Organizer

A console-based application that helps astronauts organize their daily tasks.  
This application demonstrates **Singleton, Factory, and Observer** patterns while implementing mandatory CRUD operations.

### ✨ Features (Mandatory)
1. Add a new task (description, start time, end time, priority).  
2. Remove an existing task.  
3. View all tasks (sorted by start time).  
4. Validate that tasks do not overlap.  
5. Provide clear error messages.  

### 🚀 Design Patterns Used
- **Singleton Pattern:** `ScheduleManager` ensures only one instance manages tasks.  
- **Factory Pattern:** `TaskFactory` creates task objects.  
- **Observer Pattern:** `ConflictObserver` checks for and reports task conflicts.  

### 🖥️ Sample Usage

