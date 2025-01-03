package week_1.w1_3_simpleInherit;

public class InheritTest {
    public static void main(String[] args) {
        Parent parentA = new Parent();
        parentA.hello("java");

        Child childA = new Child();
        childA.hello("java");
    }
}