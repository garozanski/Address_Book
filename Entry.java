import java.util.Scanner;

public class Entry {
    private String name;
    private String address;
    private String phone_number;

   public void setName(String pname){
       name = pname;
   }
   public String getName(){
       return name;
   }
   public void setAddress(String paddress){
       address = paddress;
   }
   public String getAddress(){
       return address;
   }
   public void setPhone_number(String pnumber){
       phone_number = pnumber;
   }
   public String getPhone_number(){
       return phone_number;
   }


    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Entry myEntry = new Entry();



        myEntry.setName("Tom");
        myEntry.setAddress("road");
        myEntry.setPhone_number("555-5555");

        System.out.println("My Entry is:" + myEntry.getName() + " " + myEntry.getAddress() + " " + myEntry.getPhone_number());

    }
}
