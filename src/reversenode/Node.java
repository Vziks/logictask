package reversenode;

/**
 * Class Node
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class Node {
    Object obj;
    Node next;

    public Node(Object obj, Node next) {
        this.obj = obj;
        this.next = next;
    }

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Node{" +
                "obj=" + obj +
                ", next=" + next +
                '}';
    }
}
