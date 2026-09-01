/**
 * Bank has a array with BankAccount objects
 * Adds, finds, removes acounts by bank number 
 * Sorts accounts by balance
 */
public class Bank{
    /**
     * Data members
     */
    private BankAccount[] accounts;
    private int count;
    /**
     * Default constructor creates an array of size 50
     */
    public Bank(){
        accounts = new BankAccount[50];
        count = 0;
    }
    /**
     * Accessor for the number of accounts currently in the bank
     * @return the number of accounts currently stored
     */
    public int size(){
        return count;
    }
    /**
     * Adds a new account to the bank at the next available index
     * and increments count
     * @param ba the BankAccount to add
     */
    public void add(BankAccount ba){
        accounts[count] = ba;
        count++;
    } 
    /**
     * Searches for an account by its account number
     * @param number the account number to search for
     * @return the matching BankAccount if found or else null
     */
    public BankAccount find(long number){
        for(int i = 0; i < count; i++){
            if(accounts[i].getNumber() == number){
                return accounts[i];
            }
        }
        return null;
    }
    /**
     * Searches for an account by its account number and removes it
     * if found and shifts all subsequent accounts down one index
     * then decrements count
     * @param number the account number to remove
     * @return the removed BankAccount if found, null otherwise
     */
    public BankAccount remove(long number){
        for (int i=0; i<count; i++){
            if(accounts[i].getNumber() == number){
                BankAccount removed = accounts[i];
                for(int j = i; j < count - 1; j++){
                    accounts[j] = accounts[j+1];
                }
                count--;
                return removed;
            }
        }
        return null;
    }
    /**
     * Sorts the accounts array in ascending order by balance,
     * using the insertion sort algorithm
     */
    public void sort(){
        for (int i=1; i < count; i++) {
             BankAccount current = accounts[i];
             double currentVal = current.getBalance();
             int j = i;
             while (j>0 && currentVal<accounts[j - 1].getBalance()){
                 accounts[j] = accounts[j - 1];
                 j--;
 	        }
 	    accounts[j] = current;
        }

    }
     /**
     * Accessor for the Bank's list of accounts
     * @return a formatted string listing all accounts currently
     *         in the bank, one per line, preceded by a header row
     */
    public String toString(){
        String str = String.format("%-16s%-16s\t%-30s\t%-12s%-10s\n",
                                "Type", "Number", "Owner", "Balance", "Interest/Type");
        for (int i = 0; i < count; i++){
             str += accounts[i].toString() + "\n";
        }
        return str;
    }
}