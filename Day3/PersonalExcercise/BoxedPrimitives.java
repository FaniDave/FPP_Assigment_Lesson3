package Day3.PersonalExcercise;


public class BoxedPrimitives {

    //main method
    public static void main(String[] args) {
        //wrapper class to primitive
        Integer a = 10;
        int b = a.intValue();
        System.out.println(b);
        Integer aa;
//              System.out.println(aa.intValue());

        //primitive to Wrapper class
        int c = 10;
        Integer d = Integer.valueOf(c);
        System.out.println(d);

        //Autoboxing (primitive to objects of corresponding Wrapper class)
        int e = 5;
//              Integer f = new Integer(e); //Compiler error

        //Unboxing (object of wrapper class to the corresponding primitive)
//            Integer g = new Integer(10);
//              int h = g;


    }
}
