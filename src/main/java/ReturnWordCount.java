
public class ReturnWordCount {
    /**
     * @param in A String representing a sentence, with words delineated by spaces.
     * @return return the amount of words in a string.
     */
    public int count(String in){
        //Split the input string by spaces to get an array of words
        String[] words = in.split("\\s+");

        //Return number of words in array
        return words.length;
    }
}
