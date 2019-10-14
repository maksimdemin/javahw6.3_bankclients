import BankClients.Clients;
import BankClients.Individual;
import BankClients.IndividualEntrepreneur;
import BankClients.Organization;

public class Main {

    public static void main(String[] args) {

        System.out.println("Individual account.");
        Clients client1 = new Individual(0);
        System.out.println("Current balance = " + client1.getBalance());
        client1.setCashIn(1000);
        System.out.println("Current balance = " + client1.getBalance());
        client1.setCashIn(2500);
        System.out.println("Current balance = " + client1.getBalance());
        client1.setCashOut(100);
        System.out.println("Current balance = " + client1.getBalance());

        System.out.println("\nOrganization account.");
        Clients client2 = new Organization(0);
        client2.setCashIn(1000000);
        System.out.println("Current balance = " + client2.getBalance());
        client2.setCashOut(100000);
        System.out.println("Current balance = " + client2.getBalance());

        System.out.println("\nIndividualEntrepreneur account.");
        Clients client3 = new IndividualEntrepreneur(0);
        client3.setCashIn(100000);
        System.out.println("Current balance = " + client3.getBalance());
        client3.setCashIn(500);
        System.out.println("Current balance = " + client3.getBalance());
    }
}
