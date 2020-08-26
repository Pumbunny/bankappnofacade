/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bankfacade;

import FacadeServer.BankFacadeServer;
import bankcustomers.BankAccount;
import bankcustomers.BankCustomer;
import gencustaccount.AccountIf;
import gencustaccount.CustomerIf;
import java.util.ArrayList;

/**
 *
 * @author sarun
 */
public class BankFacade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<AccountIf> cust1Accounts = new ArrayList();
       AccountIf acc = new BankAccount(12345);
       acc.deposit(500);
       cust1Accounts.add(acc);
       acc = new BankAccount(12346);
       acc.deposit(1000);
       cust1Accounts.add(acc);
       CustomerIf cust1 = new BankCustomer("John", cust1Accounts);
       
       ArrayList<AccountIf> cust2Accounts = new ArrayList();
       AccountIf acc2 = new BankAccount(22345);
       acc2.deposit(700);
       cust2Accounts.add(acc2);
       acc2 = new BankAccount(22346);
       acc2.deposit(6000);
       cust2Accounts.add(acc2);
       CustomerIf cust2 = new BankCustomer("Rose", cust2Accounts);
       
       
       BankFacadeServer obj = BankFacadeServer.getMyFacadeObject();
        
       obj.getBankAccount(cust1 ,12345);
       obj.doDeposit(3000, cust2, 12345);
       obj.getBankCustomer("John", cust1Accounts);
    }
    
}
