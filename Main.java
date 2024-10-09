public class Main {
    public static void main(String[] args) {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        //Test Case 1
        info = game.getScore();
        System.out.println(info);
        //Test Case 2
        game.recordPlay(1);
        info = game.getScore();
        System.out.println(info);
        //Test Case 3
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        //Test Case 4
        info = game.getScore();
        System.out.println(info);
        //Test Case 5
        game.recordPlay(3);
        info = game.getScore();
        System.out.println(info);
        //Test Case 6
        game.recordPlay(1);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        //Test Case 7
        game.recordPlay(0);
        game.recordPlay(4);
        game.recordPlay(0);
        info = game.getScore();
        System.out.println(info);
        //Test Case 8
        Scoreboard match = new Scoreboard("Lions", "Tigers");
        info = match.getScore();
        System.out.println(info);
        //Test Case 9
        info = game.getScore();
        System.out.println(info);



    }
}