import java.util.Scanner;
import java.util.ArrayList;

class Inventory {
  public String name;
  public String sNum;
  public int price;
}

class Main {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    ArrayList<Inventory> allItems = new ArrayList<Inventory>();

    int order;

    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
    order = scanner.nextInt();

    while (order != 5) {
      switch (order) {
        case 1:

          Inventory item = new Inventory();

          scanner.nextLine();// consumes /n character left behind by nextInt()
          System.out.println("Enter the name:");
          item.name = scanner.nextLine();
          System.out.println("Enter the serial number:");
          item.sNum = scanner.nextLine();
          System.out.println("Enter the value in dollars (whole number):");
          item.price = scanner.nextInt();
          // scanner.nextLine();

          allItems.add(item);
          break;

        case 2:
          scanner.nextLine();
          System.out.println("Enter the serial number of the item to delete:");
          String case2String = scanner.nextLine();

          allItems.removeIf(n -> n.sNum.equals(case2String));
          break;

        case 3:
          scanner.nextLine();
          System.out.println("Enter the serial number of the item to change:");
          String case3String = scanner.nextLine();
          for (Inventory i : allItems) {
            if (i.sNum.equals(case3String)) {
              System.out.println("Enter the new name:");
              i.name = scanner.nextLine();
              System.out.println("Enter the new value in dollars (whole number):");
              i.price = scanner.nextInt();
            }
          }

          scanner.nextLine();
          break;

        case 4:
          scanner.nextLine();
          for (Inventory i : allItems) {
            System.out.println(i.name + "," + i.sNum + "," + i.price);
          }
          break;

      }
      System.out.println("Press 1 to add an item.");
      System.out.println("Press 2 to delete an item.");
      System.out.println("Press 3 to update an item.");
      System.out.println("Press 4 to show all the items.");
      System.out.println("Press 5 to quit the program.");
      order = scanner.nextInt();
    }
    scanner.close();

  }
}