/* Skriv en klasse til at håndtere bankkonti */


class BankAccount{
    private double balance;

    BankAccount(double balance){
        this.balance = balance;
    }
    void withdraw(double amount) {
        balance = balance - amount;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
        double getBalance(){
        return balance;
    }
}


void main() {
    double startBalance = 1000;
    BankAccount account = new BankAccount(startBalance);
    account.withdraw(1200);
    account.deposit(100);
    IO.println("Din nuværende saldo er: " + account.getBalance());
}


