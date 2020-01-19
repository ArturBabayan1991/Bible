public class HelloWorldG {
    public static void main(String[] args) {
        String name = args[0];
        System.out.println ("Joy to the world");
        System.out.println ("Joy to the " + name + "! ");

        int a = 5;
        int  b = 7;
        int  c = a + b;
        System.out.println (c);

        char chr = '?';
        System.out.println (chr);

//        boolean flag = true;
//        flag = false;
//        System.out.println (flag);

        char[] original;
        String str = "Hello";
        System.out.println (str);

        int d = 7;
        int e = 5;
        System.out.println ("d / e = " + (d /e ));
        System.out.println ("d % e = " + (d % e ));

        boolean flag = true;
       if (12 == 5+7 && 4-4 == 0) {
           System.out.println (flag);
       } else {
           System.out.println ("false");
       }

    }
}