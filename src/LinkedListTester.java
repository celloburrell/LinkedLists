public class LinkedListTester
{
    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();
        System.out.printf("Is the LinkedList empty: %b\n", linkedList.isEmpty());
        linkedList.add(2);
        linkedList.add(5);
        linkedList.addFirst(1);
        System.out.printf("The current size is %d\n", linkedList.getSize());
        linkedList.addAtPosition(3,2);
        linkedList.removeAtPosition(3);
        linkedList.display();
    }
}
