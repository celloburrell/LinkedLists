public class SinglyLinkedList
{
    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList()
    {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty()
    {
        return head == null;
    }

    public int getSize()
    {
        return size;
    }

    public void add(Object item)
    {
        Node newNode = new Node(item);
        size++;
        if(head == null)
        {
            head = newNode;
            tail = head;
        }
        else
        {
            tail.setNextNode(newNode);
            tail = newNode;
        }
    }

    public void addFirst(Object item)
    {
        Node newNode = new Node(item);
        size++;
        if(head == null)
        {
            head = newNode;
            tail = head;
        }
        else
        {
            newNode.setNextNode(head);
            head = newNode;
        }
    }

    public void addAtPosition(Object item, int index)
    {
        Node newNode = new Node(item);
        Node currectNode = head;

        if(index >= size)
        {
            System.out.println("Invalid index");
        }
        else if(index == 0)
        {
            this.addFirst(item);
        }
        else
        {
            index = index-1;
            for(int i = 0; i < size; i++)
            {
                if(i == index)
                {
                    Node tempNode = currectNode.getNextNode();
                    currectNode.setNextNode(newNode);
                    newNode.setNextNode(tempNode);
                    break;
                }
                currectNode = currectNode.getNextNode();
            }
            size++;
        }
    }

    public void removeAtPosition(int index)
    {
        if(index >= size)
        {
            System.out.println("Invalid index");
        }
        else if(index == 0)
        {
            head = head.getNextNode();
            size--;
        }
        else if(index == size-1)
        {
            Node s = head;
            Node t = head;
            while(s != tail)
            {
                t = s;
                s = s.getNextNode();
            }
            tail = t;
            tail.setNextNode(null);
            size--;
        }
        else
        {
            Node currentNode = head;
            for(int i = 1; i < size; i++)
            {
                if(i == index)
                {
                    Node temp = currentNode.getNextNode();
                    temp = temp.getNextNode();
                    currentNode.setNextNode(temp);
                    break;
                }
                currentNode = currentNode.getNextNode();
            }
            size--;
        }
    }

    public void display()
    {
        if(size == 0)
        {
            System.out.println("List is empty");
        }
        else if(head.getNextNode() == null)
        {
            System.out.println(head.getItem());
        }
        else
        {
            Node currentNode = head;
            System.out.print(head.getItem() + " -> ");
            currentNode = currentNode.getNextNode();
            while(currentNode.getNextNode() != null)
            {
                System.out.print(currentNode.getItem() + " -> ");
                currentNode = currentNode.getNextNode();
            }
            System.out.print(currentNode.getItem() + "\n");
        }
    }
}
