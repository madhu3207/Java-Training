package Day8;

class BankAccount {
    String name;
    double balance;

    BankAccount() {
        this("Madhu", 1000);
    }

    BankAccount(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    void display() {
        System.out.println(name + " : " + balance);
    }

    public static void main(String[] args) {//simple bank account class with default and parameterized constructor
        BankAccount b = new BankAccount();
        b.display();
    }
}
