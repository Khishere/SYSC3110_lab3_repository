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
    public void removeBuddy(BuddyInfo toRemove){
        for(BuddyInfo friend : friendList){
            if(friend.equals(toRemove)){
                friendList.remove(friend);
            }
        }
    }

    //main
    public static void main(String[] args){
        System.out.println("Address Book");

        BuddyInfo buddy = new BuddyInfo("Tom", "Carleton", "613");
        AddressBook addressBook = new AddressBook();
        addressBook.addBuddy(buddy);
        addressBook.removeBuddy(buddy);
    }
}
