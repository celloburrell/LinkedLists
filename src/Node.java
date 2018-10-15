public class Node
{
    private Node nextNode;
    private Object item;

    public Node()
    {
        nextNode = null;
        this.item = null;
    }

    public Node(Object item)
    {
        this.item = item;
    }

    public Node getNextNode()
    {
        return this.nextNode;
    }

    public void setNextNode(Node next)
    {
        this.nextNode = next;
    }

    public Object getItem()
    {
        return this.item;
    }

    public void setItem(Object item)
    {
        this.item = item;
    }
}
