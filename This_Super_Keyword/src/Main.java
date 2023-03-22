
class A{
    int a = 10;
}

class B extends A{
    int a = 20;
    void show(int a){
        System.out.println(a);
        System.out.println("Current Class Variable Using This Keyword : "+this.a);
        System.out.println("Parent Class Variable Using Super Keyword : "+super.a);
    }
}


public class Main {
    public static void main(String[] args) {
        B b = new B();
        b.show(30);
    }
}