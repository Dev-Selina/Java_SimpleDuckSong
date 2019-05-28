package song;

public class SingDuckSong {

    private void songLyrics() {

        int noOfDucksReturn = 5;
        int newNumberDucksReturn = 0;
        String moreThanOneDuck = " little ducks ";
        String oneDuckOnly = " little duck ";
        String pluralCorrection = "";
        String restOfSong = "went swimming one day\nOver the hill and far away\nMother duck said, \"Quack quack quack quack\"";
        String ducksReturnEnding = "";

        if (noOfDucksReturn == 1) {
            pluralCorrection = oneDuckOnly;
        } else if (noOfDucksReturn > 1) {
            pluralCorrection = moreThanOneDuck;
        }

        if (noOfDucksReturn > 1) {
            newNumberDucksReturn = noOfDucksReturn - 1;
            ducksReturnEnding = "\nAnd only " + newNumberDucksReturn + pluralCorrection + "came back!";
        }

        System.out.println(noOfDucksReturn + pluralCorrection + restOfSong + ducksReturnEnding);
    }

    public static void main(String args[]) {
        SingDuckSong play = new SingDuckSong();
        play.songLyrics();
    }


}
