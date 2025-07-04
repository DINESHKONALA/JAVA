class shop{
    int books(int money_resived , int requride_count_books){
        System.out.println("Welcome to the book store! You can buy books here.");
        System.out.println("You have " + money_resived + " money.");
        System.out.println("You want to buy " + requride_count_books + " books.");
        System.out.println("Each book costs 80 money.");
        int book_cost = 80; // Cost of a book
        int total_cost = book_cost * requride_count_books; // Calculate total cost based on the number of books
        if (requride_count_books == 1) 
        {
            // System.out.println("You can buy a book.");
            if (money_resived >= total_cost ) {
                int remailning_money = money_resived - total_cost; // Calculate remaining money after purchase
                System.out.println("You can buy a book and you will have " + remailning_money + " left.");
            } 
            else {
                System.out.println("You can not buy a book because you don't have enough money.");
                int requride_money = total_cost - money_resived; // Calculate required money to buy a book
                System.out.println("You need " + requride_money + " more money to buy a book.");
            }
        }
        else if (requride_count_books == 0) 
        {
            System.out.println("please enter a valid number of books to buy.");
        }
        else if (requride_count_books > 1) 
        {
            if (money_resived >= total_cost) 
            {
                int remailning_money = money_resived - total_cost; // Calculate remaining money after purchase
                System.out.println("You can buy " + requride_count_books + " books and you will have " + remailning_money + " left.");
            } 
            else 
            {
                System.out.println("You can not buy " + requride_count_books + " books because you don't have enough money.");
                int requride_money = total_cost - money_resived; // Calculate required money to buy a book
                System.out.println("You need " + requride_money + " more money to buy a books.");
            }
        }
        else 
        {
            int requride_money = total_cost - money_resived;
            System.out.println("You need " + requride_money + " more money to buy a book.");

        }

        return money_resived;
    }
}
public class methods {
    public static void main(String[] args) 
    {
        int money = 5000000; 
        int books_count = 20;// Amount of money received
        shop a = new shop(); // Creating an object of the shop class
        a.books(money,books_count);
    }
}

