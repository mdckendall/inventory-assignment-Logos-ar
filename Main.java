import java.util.Scanner;
import java.util.ArrayList;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String name, sNum;
    int order, price;
    int element = -1;

    ArrayList<Item> allItems = new ArrayList<Item>();

    System.out.println("Press 1 to add an item.");
    System.out.println("Press 2 to delete an item.");
    System.out.println("Press 3 to update an item.");
    System.out.println("Press 4 to show all the items.");
    System.out.println("Press 5 to quit the program.");
    order = scanner.nextInt();

    while (order != 5) {
      switch (order) {
        case 1:
          scanner.nextLine();// consumes /n character left behind by nextInt()
          System.out.println("Enter the name:");
          name = scanner.nextLine();
          System.out.println("Enter the serial number:");
          sNum = scanner.nextLine();
          System.out.println("Enter the value in dollars (whole number):");
          price = scanner.nextInt();
          // scanner.nextLine();

          Item item = new Item(name, sNum, price);
          allItems.add(item);
          break;

        case 2:
          scanner.nextLine();
          System.out.println("Enter the serial number of the item to change:");
          String case2String = scanner.nextLine();
          for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getSerialNumber().equals(case2String)) {
              element = i;
            }
          }
          if (element >= 0)
            allItems.remove(element);
          break;

        case 3:
          scanner.nextLine();
          System.out.println("Enter the serial number of the item to change:");
          String case3String = scanner.nextLine();
          for (int i = 0; i < allItems.size(); i++) {
            if (allItems.get(i).getSerialNumber().equals(case3String)) {
              element = i;
            }
          }
          if (element >= 0) {
            System.out.println("Enter the new name:");
            allItems.get(element).setName(scanner.nextLine());
            System.out.println("Enter the new value in dollars (whole number):");
            allItems.get(element).setPrice(scanner.nextInt());
          }
          scanner.nextLine();

          break;

        case 4:
          scanner.nextLine();
          for (int i = 0; i < allItems.size(); i++) {
            System.out.println(allItems.get(i).toString());
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