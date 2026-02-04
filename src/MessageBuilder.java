public class MessageBuilder {

    private String message;  // To be initialized in part (a)
    private int numWords = 1;    // To be initialized in part (a)
    private String abbrev;

    public MessageBuilder(String startingWord) {
        message = startingWord + " ";
        abbrev = startingWord.substring(0, 1);
        String temp = getNextWord(startingWord);
        while (temp != null)
        {
            message += temp + " ";
            abbrev += temp.substring(0, 1);
            temp = getNextWord(temp);
            numWords++;
        }
        message = message.substring(0, message.length() - 1);
    }

    public String getMessage() {
        return message;
    }


    public int getNumWords() {
        return numWords;
    }

    public String getNextWord(String s) {

        String[] tests = {"The", "book", "on", "the", "table", null, "good", "morning", "sunshine", null, "a", "b", "c", "d", "e", "f", "g", "h", null, "nice", "job", null, "yikes", null, "As", "soon", "as", "possible", null};
        for (int i = 0; i < tests.length; i++) {
            if (tests[i] != null) {
                if (tests[i].equals(s)) {
                    return tests[i + 1];
                }
            }
        }
        return null;
    }

    public String getAbbreviation() {
        return abbrev;
    }

}
