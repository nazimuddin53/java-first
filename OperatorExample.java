public class OperatorExample{
    public static  void main(String... args){
        int a = 10;
        int b = 5;
        int f = 12;
        boolean c = false;
        boolean d = true;
        /*
        // Unary operator
        System.out.println(a++);// 10
        System.out.println(++a); // 12
        System.out.println(--a);//11
        System.out.println(a--);// =11
        System.out.println(a); // = 10
        System.out.println(~a);// = -11
        System.out.println(!c);
        System.out.println(!d);
        */
        /*
        // Arithmetic Operators
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a*b);
        System.out.println(a%b);
        */
        /*
        // Shift Operator
        // left shift
        System.out.println(10<<2);//10*2^2 = 40
        System.out.println(20<<3);//20*2^3 = 320
        //Right shift
        System.out.println(10>>2);//10/2^2 =
        System.out.println(20>>2);//20/2^2 = 5
        System.out.println(20>>>2);// = 5
        System.out.println(-20>>2);//20/2^2 = -5
        System.out.println(-20>>>2); //1073741819
        */
        /*
        // Bitwise and logical Operator
        System.out.println(a<b&++a<f);//false & true = false
        System.out.println(a<b&&a<f);// false && true = false
        System.out.println(a>b|a>f); // true | false = true
        System.out.println(a>b||a>f);// true || flase = true
         */
        /*
        // ternary operator
        System.out.println(a>b?(String) "hello expration 1":(String) "hello expration 2");// condition is true expration1 false expration2
         */

        //Assignment operator
        System.out.println(a+=1);//a = a + 1
        System.out.println(a-=1);//a = a - 1
        System.out.println(b*=2);//b = b * 2
        System.out.println(a/=2);//a = a / 2
        System.out.println(a^=2);//a = a^2
        System.out.println(a&=4);
        System.out.println(7^2);
    }
}