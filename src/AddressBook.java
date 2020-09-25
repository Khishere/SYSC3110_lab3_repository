import java.util.ArrayList;

public class AddressBook {

    //field(s)
    public ArrayList<BuddyInfo> friendList;

    //constructor
    public AddressBook(){
        friendList = new ArrayList<BuddyInfo>();
    }

    //addBuddy   check if the friend is already in the list, if not will add the friend to the list
    public void addBuddy(BuddyInfo newFriend){
        for(BuddyInfo friend : friendList){
            if(newFriend.equals(friend)){
                System.out.println("Friend already in list");
            }
        }
        friendList.add(newFriend);
    }

    //removeBuddy    remove the friend from the list by using a valid index number
    public void removeBuddy(int indexNum){
        if(indexNum<0 && indexNum>friendList.size()){
            System.out.println("Invalid index number");
        }
        friendList.remove(indexNum);
    }

    //main
    public static void main(String[] args){
        System.out.println("Address Book");
    }
}
