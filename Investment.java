/**
 * Concrete class Investment that inherits Bank Account
 */
public class Investment extends BankAccount{
    /**
     * Data member
     */
    private String type;
    /**
     * Constructor with four parameters
     * @param number initial value for the account number
     * @param owner initial value for the name of the owner
     * @param balance initial value of the balance
     * @param type value of the types "Property", "Growth" , "Shares"
     */
    public Investment(long number, String owner, double balance, String type){
        super(number, owner, balance);
        this.type = type;
    }
    /**
     * Constructor with three parameters
     * @param owner initial value for the name of the owner
     * @param balance initial value of the balance
     * @param type value of the types "Property", "Growth" , "Shares"
     */
    public Investment(String owner, double balance, String type){
        super(owner, balance);
        this.type = type;
    }
    /**
     * Accessor for the type 
     * @return value of the tyoe
     */
    public String getType(){
        return type;
    }
    /**
     * Mutator for the Type
     * @param id value of the Type
     */
    public void setYearlyInterest(String Type){
        this.type = type;
    }
    public double getProfitOrLoss(double risk){
        if (risk >= 0.5){
            double profit = (0.05 * balance);
            balance = balance + (0.05 * balance);
            return profit;
        } else {
            double loss = (0.02 * balance);
            balance = balance - (0.02 * balance);
            return -loss; 
        }
    }
    /**
    * Accessor for the Checking account attributes
    * @return formatted string with type label and object attributes
    */
    public String toString(){
       return String.format("%-16s", "Investment") + super.toString() + String.format("\t%-10s", type);
    }
}