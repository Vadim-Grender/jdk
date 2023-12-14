public class Main {
    public static void main(String[] args) {


        Number[] numArray = new Number[3];
        numArray[0] = 1;
        numArray[1] = 2.0f;
        numArray[2] = 3567367546283L;
        MyArray<Number> myArray = new MyArray<>(numArray);
        myArray.printList();
        System.out.println(myArray.getArrayLength());

        System.out.println(Calculator.sum(5, 2.5));
        System.out.println(Calculator.multi(3 , 2.6f));
        Pair<String, Integer> pair = new Pair<>("Hello World", 523984);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair);
    }
}