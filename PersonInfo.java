import java.util.ArrayList;
import java.util.Scanner;

public class PersonInfo {
//    public static void main(String[] args) {

        public String item;

        public String getItem() {
            return item;
        }

        public void setItem(String item) {
            this.item = item;

        PersonInfo(String item) {
            setItem(item);
        }

        public static void main(String[]) {
            AddressBook AddressBook = new AddressBook();
            AddressBook.setList(new ArrayList<PersonInfo>());
            Scanner sc = new Scanner(System.in);
            int commandInput = 0;
            String entry;

            int exitLoop = 6;

            int userInt = 0;
            String userInput;

            String commandList = "" +
                    "Please enter in a command (only numbers)\n" +
                    "1. Add an entry\n" +
                    "2. Delete an entry\n" +
                    "3. Search for an entry\n" +
                    "4. Print the contents of the address book" +
                    "5. Delete the contents of the address book\n" +
                    "6. Quit the program";

            while(userInt != exitLoop){

            //Display our command list
            System.out.println(commandList);

            //take input from user
            userInt = sc.nextInt();

            if(userInt == 6){
                System.out.println("Goodbye");
                break;
            } else if(userInt == 1){
                System.out.println("Please type a name to add: ");

                //get the data from the user and store it in a variable
                userInput = sc.next();

                //add that variable to our list
                AddressBook.list.add(new PersonInfo(userInput));
                System.out.println(AddressBook);
            } else if(userInt == 2){
                System.out.println("Please type a name to delete");


            } else if(userInt == 3){
                System.out.println("Search for an entry");
                System.out.println("Please type a name to search: ");

                //get the data from the user and store it in a variable
                userInput = sc.next();

                //add that variable to our list
                AddressBook.list.remove(new PersonInfo(userInput));
                System.out.println(AddressBook);;
            } else if(userInt == 4){
                System.out.println("Print the contents of the address book");
            } else if(userInt == 5){
                System.out.println("Delete the contents of the address book");
            }
        }

        /*
        1. Adding entries
        New entries should contain all of the properties required by an entry. The email address needs to be unique. Other properties do not need to be unique.

        2. Remove an entry
        An entry can be removed by searching the database for an email address and then removing the entry with that unique email addres.

        3. Search for an entry
            Users can pick which methods they will search by (first name, last name, phone number, or email address). The program will then take in a search query
            and search the address book for an entry that contains the search as a substring (e.g. if a first name search is conducted with 'a,' all entries that have a
            first name starting with 'a' will be returned).

        4. Printing the address book
        All of the entries will be printed out

        5. Deleting the book
        The address book will be cleared

        6. Quit
        The program will stop running
         */

    }}}
//        @Override
//        public String toString() {
//            return item;
//        }