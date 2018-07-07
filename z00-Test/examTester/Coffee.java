public enum Coffee  //1
{
  ESPRESSO("Very Strong"), MOCHA("OK"), LATTE("SA"); //2
  public String strength; //3    
  Coffee(String strength) //4   
  {    
    this.strength = strength; //5  
  } 
} 