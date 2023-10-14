package Iterator;

public class Main {
    public static void main(String[] args) {
        SomeString someString = new SomeString();
        someString.addData("안녕");
        someString.addData("하이");
        someString.addData("ㅎㅇㅎㅇ");

        Iterator<String> stringIterator = someString.createdIterator();
        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next());

        }

        SomeInteger someInteger = new SomeInteger();
        someInteger.addData(1);
        someInteger.addData(2);
        someInteger.addData(3);
        someInteger.addData(4);
        someInteger.addData(5);
        Iterator<Integer> integerIterator = someInteger.createdIterator();
        while(integerIterator.hasNext()){
            System.out.println(integerIterator.next());
        }
    }
}
