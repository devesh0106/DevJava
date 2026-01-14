package P_Interview;

public class InheritanceDemo {
    public static void main(String[] args) {

        A a = new A();
        a.m1(); // "inside m1 of A"

        A a1 = new B();
        a1.m1(); //inside m1 of B"

       /*This line will result in a compilation error
        because you cannot assign an object of class A to a reference of class B due to the inheritance relationship.*/
       // B b1 = new A();
       // b1.m1();

        B b = new B();
        b.m1();  //inside m1 of B"
        b.m2(); ///inside m2 of A"
    }

    static class A {
        public void m1() {
            System.out.println("inside m1 of A");
        }

        public void m2() {
            System.out.println("inside m2 of A");
        }

    }

    public static class B extends A {
        public void m1() {

            System.out.println("inside m1 of B");
        }
    }
}
