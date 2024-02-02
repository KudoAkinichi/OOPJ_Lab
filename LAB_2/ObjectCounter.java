// Q3. WAP in java to count number of objects created in a programme using static variable count and a constructor.

public class ObjectCounter {
    
    private static int count = 0;

    
    public ObjectCounter() {
        count++; 
    }

    
    public static int getObjectCount() {
        return count;
    }

    public static void main(String[] args) {
        // Creating objects to demonstrate the counting
        ObjectCounter obj1 = new ObjectCounter();
        ObjectCounter obj2 = new ObjectCounter();
        ObjectCounter obj3 = new ObjectCounter();

        // Display the count of objects
        System.out.println("Number of objects created: " + ObjectCounter.getObjectCount());
    }
}
