import java.util.ArrayList;

public class AddressBook {
    //this will store the array of our list items
    public ArrayList<PersonInfo> list;

    public void setList(ArrayList<PersonInfo> list) {
        this.list = list;
    }

    public ArrayList<PersonInfo> getList() {
        return list;
    }

    AddressBook(){

    }

    @Override
    public String toString() {
        return ""+list;
    }
}