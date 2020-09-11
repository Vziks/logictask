package reversenode;

/**
 * Class ReverseNodeList
 * Project logictask
 *
 * @author Anton Prokhorov <vziks@live.ru>
 */
public class ReverseNodeList {


    public static void main(String[] args) {

        Node nod1 = new Node("1", null);
        Node nod2 = new Node("2", null);
        nod1.setNext(nod2);
        Node nod3 = new Node("3", null);
        nod2.setNext(nod3);
        Node nod4 = new Node("4", null);
        nod3.setNext(nod4);
        Node nod5 = new Node("5", null);
        nod4.setNext(nod5);

        System.out.println(nod1);
        Node aaa = reverseNode(nod1);
        System.out.println(aaa);


    }

    static Node reverseNode(Node node) {
        if (node == null || node.next == null) {
            return node;
        }

        Node currentNode = node;
        Node previousNode = null;
        Node nextNode;

        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = nextNode;
        }
        return previousNode;

    }
}

