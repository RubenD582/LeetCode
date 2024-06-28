# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

def addTwoNumbers(l1, l2):
    """
    :type l1: ListNode
    :type l2: ListNode
    :rtype: ListNode
    """
    reverse_list1 = []
    current = l1
    while current:
        reverse_list1.append(current.val)
        current = current.next
        
    # ------------------------------------------
    
    reverse_list2 = []
    current = l2
    while current:
        reverse_list2.append(current.val)
        current = current.next

    total = str(int(''.join(map(str, reverse_list1[::-1]))) + int(''.join(map(str, reverse_list2[::-1]))))[::-1]
    
    head = ListNode(int(total[0]))
    current = head
    for char in total[1:]:
        new_node = ListNode(int(char))
        current.next = new_node
        current = current.next
        
    return head
    
def print_list(node):
    output = "["
    
    current = node
    while current:
        if current.next is None:  # Check if current node is the last node
            output += str(current.val)
        else:
            output += str(current.val) + ","
            
        current = current.next
    
    print(output + "]")

head1 = ListNode(2)
head1.next = ListNode(4)
head1.next.next = ListNode(3)

head2 = ListNode(5)
head2.next = ListNode(6)
head2.next.next = ListNode(4)

print_list(addTwoNumbers(head1, head2))