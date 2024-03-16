// WAP in to demonstrate different nested classes.

public class NestedClassDemo {
    public static void main(String[] args) {
        // Using static nested class
        OuterClass.StaticNestedClass staticNested = new OuterClass.StaticNestedClass();
        staticNested.display();

        // Using inner class
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display();

        // Using local inner class
        outer.localInnerClassExample();
    }
}
