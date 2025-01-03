package week_1.w1_3_simpleInherit;

public class Parent {
    public void hello (String target) {
        if (target==null || target.isEmpty()) {
            System.out.println("Hello nobody!");
        } else {
            System.out.println("(P)Hello " + target);
        }
    }
}
