public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode output = mergeTwoLists(list1, list2);
        System.out.println(output);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode(0);
        ListNode currentNode = newNode;

        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                currentNode.next = list1;
                list1 = list1.next;
            } else {
                currentNode.next = list2;
                list2 = list2.next;
            }

            currentNode = currentNode.next;
        }

        if (list1 != null) {
            currentNode.next = list1;
        } else {
            currentNode.next = list2;
        }

        return newNode.next;
    }
}

public class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode currentNode = this;
        while (currentNode != null) {
            sb.append(currentNode.val);
            if (currentNode.next != null) {
                sb.append(" -> ");
            }
            currentNode = currentNode.next;
        }
        return sb.toString();
    }
}