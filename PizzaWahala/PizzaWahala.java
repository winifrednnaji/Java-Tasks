import java.util.Scanner;

public class PizzaWahala {

    public static int getSlicesPerBox(String pizzaType) {
        switch (pizzaType.trim().toLowerCase()) {
            case "sapa size": return 4;
            case "small money": return 6;
            case "big boys": return 8;
            case "odogwu": return 12;
            default: throw new IllegalArgumentException("Invalid pizza type!");
        }
    }

    public static int getPricePerBox(String pizzaType) {
        switch (pizzaType.trim().toLowerCase()) {
            case "sapa size": return 2500;
            case "small money": return 2900;
            case "big boys": return 4000;
            case "odogwu": return 5200;
            default: throw new IllegalArgumentException("Invalid pizza type!");
        }
    }

    public static int calculateBoxes(int guests, int slicesPerBox) {
        return (int) Math.ceil((double) guests / slicesPerBox);
    }

    public static int calculateLeftoverSlices(int guests, int boxes, int slicesPerBox) {
        return (boxes * slicesPerBox) - guests;
    }

    public static int calculateTotalPrice(int boxes, int pricePerBox) {
        return boxes * pricePerBox;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of guests: ");
        int guests = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        System.out.print("Enter pizza type: ");
        String pizzaType = scanner.nextLine();

        int slicesPerBox = getSlicesPerBox(pizzaType);
        int pricePerBox = getPricePerBox(pizzaType);

        int boxes = calculateBoxes(guests, slicesPerBox);
        int leftovers = calculateLeftoverSlices(guests, boxes, slicesPerBox);
        int totalPrice = calculateTotalPrice(boxes, pricePerBox);

        System.out.println("Number of boxes of pizza to buy = " + boxes + " boxes");
        System.out.println("Number left over slices after serving = " + leftovers + " slices");
        System.out.println("Price = " + totalPrice);

        scanner.close();
    }
}
