public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        ChainedHashtable hashTable = new ChainedHashtable();

        hashTable.put("Jones", janeJones);
        hashTable.put("Doe", johnDoe);
        hashTable.put("Wilson", mikeWilson);
        hashTable.put("Smith", marySmith);

        printSeparators();

        hashTable.printHashtable();

        printSeparators();
        System.out.println("Retrieve key Wilson: " + hashTable.get("Wilson"));

        printSeparators();
        System.out.println("Retrieve key Smith: " + hashTable.get("Smith"));

        printSeparators();
        hashTable.remove("Doe");
        hashTable.remove("Jones");

        hashTable.printHashtable();

        printSeparators();
        System.out.println("Retrieve key Smith: " + hashTable.get("Smith"));

        printSeparators();
    }

    public static void printSeparators() {
        System.out.println("-".repeat(55));
    }
}