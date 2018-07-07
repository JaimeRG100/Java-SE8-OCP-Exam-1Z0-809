public class TestClass {
  
  public static void main(String[] args) {
    System.out.println("begin");           // output "begin"
    (new ReadInventoryThread()).start();   // Simple Thread whose output is "Printing zoo inventory"
    (new Thread(new PrintData())).start(); // Simple Thread whose output is output is "Printing record: n" (from 1 to 3)
    (new ReadInventoryThread()).start();   // Simple Thread whose output is "Printing zoo inventory"
    System.out.println("end");             // output "end"
  }
  
}

/*
OUTPUT # 1                  OUTPUT # 2                 OUTPUT # 3 (WOW)
-------------------------------------------------------------------------------
begin                       begin                      begin
end                         end                        end
Printing zoo inventory      Printing zoo inventory     Printing zoo inventory 
Printing record: 0          Printing zoo inventory     Printing record: 0  
Printing record: 1          Printing record: 0         Printing zoo inventory 
Printing record: 2          Printing record: 1         Printing record: 1 
Printing zoo inventory      Printing record: 2         Printing record: 2 
*/