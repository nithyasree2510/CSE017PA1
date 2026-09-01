/**
 * Abstract class Bank account acts as a blueprint for types of 
 * bank account like checking, investment and savings
 */
public abstract class BankAccount{
    // Data members 
    private long number;
    private String owner;
    protected double balance;
    private static long nextNumber = 1111111111L;
    /**
     * Constructor with two parameters
     * @param owner initial value for the name of the owner
     * @param balance initial value of the balance
     */
    public BankAccount(String owner, double balance){
        this.number = nextNumber;
        this.owner = owner;
        this.balance = balance;
        nextNumber++;
    }
    /**
     * Constructor with three parameters
     * @param number initial value for the account number
     * @param owner initial value for the name of the owner
     * @param balance initial value of the balance
     */
    public BankAccount(long number, String owner, double balance){
        this.number = number;
        this.owner = owner;
        this.balance = balance;
    }
    /**
     * Accessor for the account number
     * @return value of the account number
     */
    public long getNumber(){
         return number;
    }
    /**
     * Accessor for the owner name
     * @return value of the owner name
     */
    public String getOwner(){
        return owner;
    }
    /**
     * Accessor for the balance
     * @return value of the balance
     */
    public double getBalance(){
        return balance;
    }
    /**
     * Accessor for the BankAcount attributes
     * @return formatted string with the object attributes
     */
    public String toString(){
        String str = String.format("%-10d\t%-30s\t$%-10.2f", 
                                   number, owner, balance);
        return str;
    }
    /**
     * Mutator for the accountnumber
     * @param id value of the acoount number
     */
    public void setNumber(long n){
        this.number = n;
    }
    /**
     * Mutator for the owner name
     * @param name value of the owner name
     */
    public void setOwner(String o){
        this.owner = o;
    }
    /**
     * Deposits the given amount into the account
     */
    public void deposit(double amount){
        balance = balance + amount;
    }
    /**
     * Withraw the given amount given that balance is enough 
     */
    public boolean withdraw(double amount){
        if (amount < balance){
            balance = balance - amount;
            return true;
        }
        else{
            return false;
        }

    } 
}