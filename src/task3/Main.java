package task3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Price [] items = new Price[2];

        String str, searchedShop;
        boolean isShopFound = false;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < items.length; i++) {
            items[i] = new Price();
            System.out.printf("Record №%d %n", i+1);

            System.out.print("Enter name of the item: ");
            items[i].itemName = in.nextLine();

            System.out.print("Enter name of the shop: ");
            items[i].shopName = in.nextLine();

            System.out.print("Enter cost of the item: ");
            items[i].cost = in.nextInt();
            str = in.nextLine();

        }
        System.out.println("Enter searched shop");

        searchedShop = in.nextLine();

        System.out.println("list of shops");
        for (Price item : items) {
            if (item.shopName.equals(searchedShop)){
                System.out.printf("Shop %s has %s item with cost %.2f UAH",item.shopName, item.itemName, item.cost);
                isShopFound = true;
            }
        }
        try{
            if (!isShopFound) throw new Exception("Shop is not found");
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
