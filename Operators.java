public class Operators {
    public static void main(String[] args){
        int a=10;
        int b=267;
        System.out.println("arithmetic operator");
        System.out.println("Addition:"+(a+b));
        System.out.println("subtaction:"+(a-b));
        System.out.println("multiplication:"+(a*b));
        System.out.println("division:"+(a/b));
        System.out.println("modulo division:"+(a%b));
        System.out.println("Relational Operator");
        System.out.println(a==b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a!=b);
        System.out.println(a>b);
        System.out.println("logical operator");
        System.out.println(a==b&&a>=b);
        System.out.println(a<b||b>a);
        System.out.println(~a);
        System.out.println("assignment Operators");
        System.out.println(a+=b);
        System.out.println(a-=b);
        System.out.println(a*=b);
        System.out.println(a/=b);
        System.out.println("uniary operators");
        System.out.println(a++);
        System.out.println(++a);
        System.out.println(a--);
        System.out.println("Bitwise operators");
        System.out.println(a&b);
        System.out.println(a|b);
        System.out.println(a^b);
        System.out.println("ternary operator");
        System.out.println(a==b?a:b);
    }
}
