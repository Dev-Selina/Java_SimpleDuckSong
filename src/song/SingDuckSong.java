package song;

public class SingDuckSong {

    private void songLyrics() {
        int beginNoDucks = 5;

        String moreThanOneDuck = " little ducks ";
        String oneDuckOnly = " little duck ";

        String restOfSong = "went swimming one day\nOver the hill and far away\nMother duck said, \"Quack quack quack quack\"";
        String ducksReturnEnding;

        while(beginNoDucks > 1) {
            System.out.println(beginNoDucks + moreThanOneDuck + restOfSong);
            int endNoDucks;

            endNoDucks = beginNoDucks - 1;

            ducksReturnEnding = "And only " + endNoDucks + moreThanOneDuck + "came paddling back!";

            System.out.println(ducksReturnEnding + "\n");

            beginNoDucks = beginNoDucks - 1;
        }
    }

    public static void main(String args[]) {
        SingDuckSong play = new SingDuckSong();
        play.songLyrics();
    }


}
