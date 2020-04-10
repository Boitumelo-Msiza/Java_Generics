public class Generics {

                //GENERIC METHOD
    public static <E> void printArrayContent(E[] inputArray) {

        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
        //GENERIC CLASS
    static class Test<T> {
        T obj;

        Test(T obj) {
            this.obj = obj;
        }

        public T getObject() {
            return this.obj;
        }
    }


    public static void main(String[] args) {


        System.out.println("GENERIC METHOD");
        Integer[] intArray = {12, 324, 6, 7900};

        String[] StringArray = {"Life", "is", "Beautiful"};

        System.out.println("Array integerArray contains:");
        printArrayContent(intArray);   // pass an Integer array

        System.out.println("\nArray characterArray contains:");
        printArrayContent(StringArray);   // pass a Character array

        System.out.println("GENERIC CLASS");
        Test<Integer> iObj = new Test<Integer>(25);
        System.out.println(iObj.getObject());

        Test<String> sObj =
                new Test<String>("I love Java");
        System.out.println(sObj.getObject());


    }
}

