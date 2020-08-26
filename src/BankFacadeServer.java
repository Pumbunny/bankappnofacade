/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FacadeServer;

import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;
/**
 *
 * @author GP63
 */
public class BankFacadeServer {

    /**
     * @param args the command line arguments
     */
    private static BankFacadeServer myFacadeObj = null;
    
    private BankFacadeServer() {
    }
    public static BankFacadeServer getMyFacadeObject(){
        if(myFacadeObj == null){
            myFacadeObj = new BankFacadeServer();
        }
        return myFacadeObj;
    }
    public void doDeposit(double amt, CustomerIf cust, int accNo){
        AccountIf acc = cust.getAccount(accNo);
        acc.deposit(amt);
    }
    public void getBankAccount(CustomerIf cust, int accNo){
        
        //AccountIf acc = new BankAccount(accNo);
        AccountIf acc = cust.getAccount(accNo);
        System.out.println("Account Number: " + acc.getAccountNumber() + " has " + acc.getBalance());
    }
    public void getBankCustomer(String custName, ArrayList<AccountIf> custAccounts){
//       BankFacadeServer a = new BankFacadeServer();
//       ArrayList<AccountIf> custAccounts = new ArrayList();
//       if(custName == "John"){
//           custAccounts = 
//       }
       CustomerIf cust1 = new BankCustomer(custName, custAccounts);
       System.out.println("Customer and account information");
       System.out.println("Name = " + cust1.getCustomerName());
       System.out.println("Has " + cust1.getNumAccounts() + " accounts");
       ArrayList<AccountIf> accounts = cust1.getllAccounts();
       for(AccountIf account : accounts) {
           System.out.println("Account number " + account.getAccountNumber() + " has " + account.getBalance());
       }
    }
}
