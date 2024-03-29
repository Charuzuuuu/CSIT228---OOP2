import Arithmetic.Arithmetic;
import Map.MyMap;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Arithmetic Class
        System.out.println("\nArithmetic Class\n");

        System.out.print("Enter an integer number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter a decimal number: ");
        double n2 = sc.nextDouble();

        Arithmetic arith = new Arithmetic(n1, n2);

        // Operations
        System.out.println("Addition: " + arith.add());
        System.out.println("Subtraction: " + arith.subtract());
        System.out.println("Multiplication: " + arith.multiply());
        System.out.println("Division: " + arith.divide());
        System.out.println("Minimum: " + arith.getMin());
        System.out.println("Maximum: " + arith.getMax());

        sc.nextLine();

        //MyMap Class

        System.out.println("\nMyMap Class");

        System.out.print("\nEnter first integer: ");
        String num1 = sc.nextLine();
        Integer key = Integer.valueOf(num1);

        System.out.print("Enter second integer: ");
        String num2 = sc.nextLine();
        Integer value = Integer.valueOf(num2);

        MyMap<Integer, Integer> map = new MyMap<>(key, value);

        // put() method
        map.put(2, 7);
        map.put(3,8);

        // created ArrayList
        System.out.println("\nKey arraylist: " + map.getKeys());
        System.out.println("Values arraylist: " + map.getValues());

        // update via put() method
        map.put(2, 69);
        map.put(4,9);
        System.out.println("\nNew Key arraylist via put() method: " + map.getKeys());
        System.out.println("New Values arraylist via put() method: " + map.getValues());

        // get() method
        System.out.println("\nGet key #2: "+ map.get(2));
        System.out.println("Get key #3: "+ map.get(3));
        System.out.println("Get key #5: "+ map.get(5));

        // remove() method
        System.out.println("\nRemove key #" + key + ": " + map.remove(key));
        System.out.println("Remove key #3: " + map.remove(3));
        System.out.println("Remove key #5: " + map.remove(5));

        // updated ArrayList
        System.out.println("\nUpdated key arraylist: " + map.getKeys());
        System.out.println("Updated values arraylist: " + map.getValues());

    }
}
