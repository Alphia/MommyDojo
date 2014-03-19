public class MommyDojo {
    private static final String[] VOWELS = new String[]{"a", "e", "i", "o", "u"};

    public String mommify(String input) {
        if(inputContainsVowels(input)) {
//            String result = "";
//            String[] splited = input.split("i");
//            return result.concat(splited[0]).concat("mommy").concat(splited[1]);
            char[] inputString = input.toCharArray();
            for(char inputCharacter : inputString) {
                if ()
            }
        }
        return input;
    }

    private boolean inputContainsVowels(String input) {
        for(String vowel : VOWELS) {
            if (input.contains(vowel)) {
                return true;
            }
        }
        return false;
    }

    public String momify2(String input){

        return "";
    }
}
