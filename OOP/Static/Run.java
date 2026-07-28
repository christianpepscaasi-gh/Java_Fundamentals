public class Run {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Fol");
        Friend friend2 = new Friend("gilgert");
        Friend friend3 = new Friend("naks");

        System.out.println(friend1.name);

        System.out.println(friend2.name);

        System.out.println(friend3.name);

        Friend.showfriends();
    }
}