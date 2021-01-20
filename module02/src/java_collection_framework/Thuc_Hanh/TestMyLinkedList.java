package java_collection_framework.Thuc_Hanh;

 class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll = new MyLinkedList(10);
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.addFirst(17);
        ll.add(4,9);
        ll.add(4,9);
        ll.add(2,5);
        ll.addFirst(17);
        ll.add(4,9);
        ll.add(4,9);
        ll.add(2,5);
        ll.printList();
    }
}
