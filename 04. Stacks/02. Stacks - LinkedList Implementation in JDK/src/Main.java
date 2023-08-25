public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);
        Employee billEnd = new Employee("Bill", "End", 78);

        LinkedStack stack = new LinkedStack();
        stack.push(janeJones);
        stack.push(johnDoe);
        stack.push(marySmith);
        stack.push(mikeWilson);
        stack.push(billEnd);

        printSeparator();
        stack.printStack();

        printSeparator();
        System.out.println(stack.peek());

        printSeparator();
        stack.printStack();

        printSeparator();
        System.out.println("Popped: " + stack.pop());

        printSeparator();
        System.out.println(stack.peek());

        printSeparator();
    }

    public static void printSeparator() {
        System.out.println("-".repeat(55));
    }
}