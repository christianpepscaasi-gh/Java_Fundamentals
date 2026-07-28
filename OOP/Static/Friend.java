public class Friend {
    String name;
    static int numOfFriends;

    Friend(String name){
        this.name = name;
        numOfFriends++;
    }

    static void showfriends(){
        System.out.println("you have " + numOfFriends + " friends");
    }
}