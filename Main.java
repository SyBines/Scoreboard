public class Main
{
    public static void main(String[] args)
    {
        String info;
        Scoreboard game = new Scoreboard("Red", "Blue");
        System.out.println(game.getScore());
        game.recordPlay(0);
        game.recordPlay(2);
        info = game.getScore();
        System.out.println(info);


    }
}
