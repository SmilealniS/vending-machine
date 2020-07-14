class Customer 
{
    private double price;
    private double money;

    public Customer(Product item)
    {
        this.price = item.getPrice();
        this.money = 0;
    }

    public double getMoney()
    {
        return this.money;
    }

    public double getPrice()
    {
        return this.price;
    }

    public void addMoney(double money)
    {
        if(validate(money)) 
        {
            this.money += money;
        }
    }

    public boolean validate()
    {
        if(this.money >= this.price)
        {
            this.money -= this.price;
            
            System.out.println("Here is your item");

            return true;
        }

        return false;
    }

    public boolean validate(double money)
    {
        if(money == 5 || money == 1) return true;

        System.out.println("Invalid\nReturn coin");

        return false;
    }

    public double change()
    {
        return this.money;
    }
}