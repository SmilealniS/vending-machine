import java.util.ArrayList;
import java.util.Scanner;

class Machine 
{
    public static void main(String[] args) 
    {
        Product milk = new Product("Milk", 12);
        Product water = new Product("Water", 8);
        Product mama = new Product("Mama", 15);
        Product shoes = new Product("Shoes", 30);
        Product drug = new Product("Medicine", 17);

        ArrayList<Product> items = new ArrayList<>();
        items.add(milk);
        items.add(water);
        items.add(mama);
        items.add(shoes);
        items.add(drug);

        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < items.size(); i++)
        {
            System.out.println(items.get(i).toString() + ": " + i);
        }
        
        System.out.print("Select item: ");
        int n = scan.nextInt();
        
        while(n < 0 || n >= items.size()) 
        {
            System.out.print("Select again: ");
            n = scan.nextInt();
        }

        Customer c = new Customer(items.get(n));

        while(c.getMoney() < c.getPrice())
        {
            System.out.print("Insert coin: ");
            int coin = scan.nextInt();
            c.addMoney(coin);
        }

        if(c.validate()) System.out.println("Return: " + c.change());

        scan.close();
    }
}