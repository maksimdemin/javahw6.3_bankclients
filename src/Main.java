import BankClients.Clients;
import BankClients.Individual;
import BankClients.IndividualEntrepreneur;
import BankClients.Organization;

public class Main {

    public static void main(String[] args) {

        System.out.println("Individual account.");
        Clients client1 = new Individual(0);


        client1.cashToScore(2500);
//        System.out.println("Current balance = " + client1.getBalance());
        client1.cashFromScore(1000);
//        System.out.println("Current balance = " + client1.getBalance());
        client1.cashToScore(10000);
        client1.cashFromScore(5000);

        System.out.println("\nOrganization account.");
        Clients client2 = new Organization(0);
//        System.out.println("Current balance = " + client2.getBalance());
        client2.cashToScore(1000000);
//        System.out.println("Current balance = " + client2.getBalance());
        client2.cashFromScore(100000);
        System.out.println("Current balance = " + client2.getBalance());
//
        System.out.println("\nIndividualEntrepreneur account.");
        Clients client3 = new IndividualEntrepreneur(0);
//        System.out.println("Current balance = " + client3.getBalance());
        client3.cashToScore(100000);
//        System.out.println("Current balance = " + client3.getBalance());
        client3.cashToScore(500);
//        System.out.println("Current balance = " + client3.getBalance());
        client3.cashFromScore(1000);
        System.out.println("Current balance = " + client3.getBalance());

    }
}
