public class FindMaximal {

    public static String max(String text){
        String[] words = text.split(" ");
        String maxWord = words[0];

        for (String s : words) {
            if (s.length() > maxWord.length()) {
                maxWord = s;
            }
        }
        return maxWord;
    }
}
