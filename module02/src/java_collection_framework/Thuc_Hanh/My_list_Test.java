package java_collection_framework.Thuc_Hanh;

public class My_list_Test {
    public static void main(String[] args) {
        My_List<Integer> listInteger = new  My_List<Integer>();
        listInteger.add(1);
        listInteger.add(2);
        listInteger.add(3);
        listInteger.add(3);
        listInteger.add(4);

        System.out.println("element 4: "+listInteger.get(4));
        System.out.println("element 1: "+listInteger.get(1));
        System.out.println("element 2: "+listInteger.get(2));
        System.out.println("element 0: "+listInteger.get(0));



    }

}
