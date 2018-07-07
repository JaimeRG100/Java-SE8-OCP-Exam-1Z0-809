interface Account{ 
  public default String getId(){      return "0000";   } 
} 
interface PremiumAccount extends Account{ 
  public String getId(); 
}

interface Other extends PremiumAccount {
  public default String getId(){      return "0000";   } 
}

class BankAccount implements Other {
   public static void main(String[] args) {   
     Account acct = new BankAccount();   
     System.out.println(acct.getId()); 
   } 
 }