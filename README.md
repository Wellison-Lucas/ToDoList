# Task Manager (Java Console Application)

This is a simple console application to manage tasks using Java.

## Features
- Add a new task
- Remove an existing task
- Edit a task description
- List all tasks
- Mark a task as completed
- Exit the program

## How to Run
1. Make sure Java is installed (JDK 8 or higher).
2. Compile the files:
   ```
   javac Main.java Tarefa.java
   ```
3. Run the program:
   ```
   java Main
   ```

## Project Files
- `Main.java` — Main program with the menu and user input handling.
- `Tarefa.java` — Class that represents a task with description and completion status.

## Example Output
```
Enter 1 to add a task.
Enter 2 to remove a task.
Enter 3 to edit a task.
Enter 4 to list tasks.
Enter 5 to mark a task as completed.
Enter 6 to exit.
```

Tasks will appear like this:
```
0 - [ ] Buy groceries
1 - [X] Finish homework
```

## Notes
This project is for educational use and can be expanded with more features.
