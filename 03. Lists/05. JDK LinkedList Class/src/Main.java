import java.util.Iterator;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        Employee janeJones = new Employee("Jane", "Jones", 123);
        Employee johnDoe = new Employee("John", "Doe", 4567);
        Employee marySmith = new Employee("Mary", "Smith", 22);
        Employee mikeWilson = new Employee("Mike", "Wilson", 3245);

        LinkedList<Employee> list = new LinkedList<>();

        list.addFirst(janeJones);
        list.addFirst(johnDoe);
        list.addFirst(marySmith);
        list.addFirst(mikeWilson);

        printList(list);

//        for (Employee employee : list) {
//            System.out.println(employee);
//        }

        Employee billEnd = new Employee("Bill", "End", 78);
        list.add(billEnd);

        printList(list);

        list.removeFirst();
        printList(list);

        list.removeLast();
        printList(list);
    }

    public static void printList(LinkedList list) {
        Iterator iter = list.iterator();
        System.out.println("-".repeat(55));
        System.out.println("HEAD -> ");
        while (iter.hasNext()) {
            System.out.print(iter.next());
            System.out.println(" <=>");
        }
        System.out.println("null");
    }
}