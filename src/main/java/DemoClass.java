class A{
    public void fun(){
        System.out.println("Class A method");
    }
}
class B extends A{
    public void fun(){
        System.out.println("Class B method");
    }
}

public class DemoClass {
//    public static void fun(Integer a, Integer b){
//        System.out.println("Integer Called");
//    }
//    public static void fun(int a, int b){
//        System.out.println("int Called");
//    }
    public static void main(String[] args) {
//        int a=20,b=20;
//        DemoClass demoClass = new DemoClass();
//        demoClass.fun(null, null);

        A a = new A();
        a.fun();
    }
}
