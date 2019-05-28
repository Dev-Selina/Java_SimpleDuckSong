package song;

public class SingDuckSong {

    private void songLyrics() {

        int noOfDucksReturn = 5;
        int newNumberDucksReturn = 0;
        String moreThanOneDuck = " little ducks ";
        String oneDuckOnly = " little duck ";
        String restOfSong = "went swimming one day\nOver the hill and far away\nMother duck said, \"Quack quack quack quack\"";
        String ducksReturnEnding = " ";

        if (noOfDucksReturn > 0) {
            newNumberDucksReturn = noOfDucksReturn - 1;
            ducksReturnEnding = newNumberDucksReturn + "";
        }

        System.out.println(noOfDucksReturn + moreThanOneDuck + restOfSong + newNumberDucksReturn + ducksReturnEnding);
    }

    public static void main(String args[]) {
        SingDuckSong play = new SingDuckSong();
        play.songLyrics();
    }


}
