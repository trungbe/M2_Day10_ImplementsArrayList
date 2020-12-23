
public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(0, 1);
        listInteger.add(1, 2);
        listInteger.add(2, 3);
        listInteger.add(3, 4);
        listInteger.add(4, 5);

        listInteger.remove(1);
//        listInteger.clear();

        System.out.println(listInteger);
        System.out.println(listInteger.indexOf(3));
    }
}

