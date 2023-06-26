/*Create a class called BankAccount with private properties accountNumber and balance. Implement public methods to deposit, withdraw, and check the account balance. Use encapsulation to ensure that the account number and balance are only accessible and modifiable through the defined methods.*/
class BankAccount{
  private String accountNumber;
  private double balance;

  public String getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}

public void deposit(int depo){
  balance=20000;
    if(depo>=100){
      balance=depo+balance;
    }else{
      System.out.println("Invalid amount");
    }
  }
  public void withdraw(int wd){
    
  }
  public void checkBalance(){
    
  }
}
class BankDemo{
  public static void main(String args[]){
    BankAccount acc=new BankAccount();
    acc.setAccountNumber("39934267458");
    acc.setBalance(40000);
    acc.deposit(2800);
  }
}

//     Create a class called Car with private properties make, model, and year. Implement public methods to get and set the car's make, model, and year. Use encapsulation to protect the internal state of the car object and allow controlled access to its properties.
// ​[11:50 AM] Siraj Ahmad (Guest)
//     lalitha ill be back in 5 min

// Create a class called Employee with private properties name, position, and salary. Implement public methods to get the employee's name and position and set the employee's salary. Use encapsulation to ensure that the salary can only be modified through the defined method.
