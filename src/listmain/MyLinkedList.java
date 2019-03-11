/*
Create a list of integer using linked list.
Perform following operations on that list insert ,delete, search
 */
package listmain;

import node.Node;

public class MyLinkedList {
    //private Node list;
    private Node head;

    public Node getHead() {
        return head;
    }

    public void insert(Node element) {
        System.out.println("inserting "+element);
        if (isEmpty()) {
            this.head = element;

        } else {

            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();

            }
            temp.setNext(element);

        }

    }

    public void delete() {
        if (isEmpty()) {
            System.out.println("list is empty");
        } else {
            Node previous = head;
            Node current = head;
            while (current.getNext() != null) {
                previous = current;
                current = current.getNext();
            }
            previous.setNext(null);
        }
    }

    public boolean isEmpty() {
        boolean response = false;
        if (head == null) {
            response = true;
        }
        return response;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {

            System.out.print(temp.getData() + "--->");
            temp = temp.getNext();
        }
        System.out.print("null");
        System.out.println();
    }
  public int printrecursive(Node temp)
  {
      if(temp.getNext()==null)
      {
          return temp.getData();
      }
      printrecursive(temp.getNext());
      return temp.getData();
  }

    public void setHead(Node head) {
        this.head = head;
    }

    public Node  reverse(Node temp) {
        if(temp.getNext() == null)
            return temp;
        else {
            Node  newhead = reverse(temp.getNext());
            temp.getNext().setNext(temp)  ;
            temp.setNext(null);
            return newhead;
        }
    }


}