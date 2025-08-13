package studies.FLX.Main.ObjectOrientedPrograming.Static;

public class Main {
    public static void main(String[] args){

        Friend friend1 = new Friend("Spongebob");
        Friend friend2 = new Friend("Patrick");
        Friend friend3 = new Friend("Squidward");
        Friend friend4 = new Friend("Sandy");
        Friend friend5 = new Friend("Gary");

        // static variable are access by the class name
        System.out.println(Friend.numOfFriends);

        Friend.showFriends();
    }
}
