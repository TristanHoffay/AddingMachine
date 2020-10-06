package cse360assignment02;

public class AddingMachine {

    // Current value stored by the adding machine
    private int total;
    // String displaying history of operations on the total (Example: "0 + 2 - 3 + 4")
    private String history;


    // Constructor initializes total as 0 and history as a String starting with 0
    public AddingMachine () {
        total = 0;
        history = "" + total;
    }

    // Returns the current total of the AddingMachine object
    public int getTotal () {
        return total;
    }

    // Increments the total by the input value and appends the operation to the history String
    public void add (int value) {
        total += value;
        history += " + " + value;
    }

    // Subtracts the input value from the total and appends the operation to the history String
    public void subtract (int value) {
        total -= value;
        history += " - " + value;
    }

    // Returns the recorded history of operations to the total
    public String toString () {
        return history;
    }

    // Resets the total to 0 and erases the operation history
    public void clear() {
        total = 0;
        history = "" + total;
    }
}
