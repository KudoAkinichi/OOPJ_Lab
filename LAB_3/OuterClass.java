// WAP in to demonstrate different nested classes.

// Outer class
class OuterClass {

    private int outerVariable = 10;

    static class StaticNestedClass {
        void display() {
            System.out.println("Static Nested Class");
        }
    }

    class InnerClass {
        void display() {
            System.out.println("Inner Class - Outer Variable: " + outerVariable);
        }
    }

    // Local inner class inside a method
    void localInnerClassExample() {
        class LocalInnerClass {
            void display() {
                System.out.println("Local Inner Class");
            }
        }

        // Creating an instance of the local inner class
        LocalInnerClass localInner = new LocalInnerClass();
        localInner.display();
    }
}

