package Day3.Assigment;

public class Main1 {

    //main method
    public static void main(String[] args) {

        //Instances of Address in an array

        Address billingAddressOne = new Address("1517 South Pagosa St", "Aurora", "CO", "80017");
        Address shippingAddressOne = new Address("1887 North Adriatic St", "Dallas", "Texas", "12364");
        Address billingAddressTwo = new Address("2345 West Illif St", "Phonex", "Arizona", "53453");
        Address shippingAddressTwo = new Address("34545 East Yale St", "LosAngeles", "California", "56745");
        Address billingAddressThree = new Address("23565 South Peoria St", "Chicago", "Illinois", "39863");
        Address shippingAddressThree = new Address("28565 West Alameda", "Denver", "CO", "80017");

        //Instances of Customer
        Customer[] customers = new Customer[]{
                new Customer("Sirak", "Dawit", "12340987"),
                new Customer("Heran", "Zhgta", "56782340"),
                new Customer("Faniel", "Abraha", "34523780")
        };

        customers[0].setShippingAddress(shippingAddressOne);
        customers[0].setBillingAddress(billingAddressOne);

        customers[1].setShippingAddress(shippingAddressTwo);
        customers[1].setBillingAddress(billingAddressTwo);

        customers[2].setShippingAddress(shippingAddressThree);
        customers[2].setBillingAddress(billingAddressThree);

        //Print full information of a customer whose billing address is in Chicago
        printInfo(customers); // prints :  [Faniel, Abraha, ssn: 34523780]


    }

    //printCustomerInfo method
    public static void printInfo(Customer[] customers) {
        for (Customer cust : customers) {
            if (cust.getBillingAddress().getCity().equals("Chicago")) {
                System.out.println(cust.toString());
            }
        }
    }
}
