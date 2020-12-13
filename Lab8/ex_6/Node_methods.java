package ex_6;


 public class Node_methods {

     private Node head = null;
     private Node tail = null;

     void createHead(int[] values) {
         head = new Node(values[0], null);
         tail = head;

         for (int i = 1; i < values.length; i++) {
             head = new Node(values[i], head);
         }
     }

     void createHeadRec(int[] values) {
         head = new Node(values[0], null);
         tail = head;

         addItemsHeadRec(subArray(values));
     }

     private int[] subArray(int[] arr) {

         int[] newArr = new int[arr.length - 1];

         if (newArr.length >= 0) System.arraycopy(arr, 1, newArr, 0, newArr.length);

         return newArr;
     }

     private void addItemsHeadRec(int[] values) {
         if (values.length == 0) return;

         head = new Node(values[0], head);

         addItemsHeadRec(subArray(values));
     }

     void createTail(int[] values) {
         head = new Node(values[0], null);
         tail = head;

         for (int i = 1; i < values.length; i++) {
             tail.next = new Node(values[i], null);
             tail = tail.next;
         }
     }

     void createTailRec(int[] values) {
         head = new Node(values[0], null);
         tail = head;

         addItemsTailRec(subArray(values));
     }

     private void addItemsTailRec(int[] values) {
         if (values.length == 0) return;

         tail.next = new Node(values[0], null);
         tail = tail.next;

         addItemsTailRec(subArray(values));
     }

     void outList() {
         System.out.println(toString());
     }

     void addFirst(Node node) {
         node.next = head;
         head = node;
     }

     void addLast(Node node) {
         tail.next = node;
         tail = node;
     }

     void insert(Node node) {

         Node ref = head;
         while (ref != null) {

             if (ref.value == 1) {
                 node.next = ref.next;
                 ref.next = node;
                 break;
             }
             ref = ref.next;
         }
     }

     void removeFirst() {
         head = head.next;
     }

     void removeLast() {

         Node ref = head;

         while (ref.next.next != null) {
             ref = ref.next;
         }

         ref.next = null;
         tail = ref;
     }

     void remove() {

         Node ref = head;

         while (ref.next.value != 3) ref = ref.next;

         ref.next = ref.next.next;
     }

     @Override
     public String toString() {

         StringBuilder sb = new StringBuilder();
         Node ref = head;

         while (ref != null) {
             sb.append(ref.value);
             sb.append(" ");
             ref = ref.next;
         }

         return sb.toString();
     }

     String toStringRec() {

         return toStringRecIntern(head);
     }

     private String toStringRecIntern(Node current) {

         if (current == null) return "";

         return current.value + " " + toStringRecIntern(current.next);
     }
 }