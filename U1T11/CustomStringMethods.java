package U1T11;

class CustomMethodsRunner {
    public static void main(String[] args) {
        CustomStringMethods methods = new CustomStringMethods();
        String str = methods.removeCharacter("Halloween", 5);
System.out.println(str);
str = methods.removeCharacter("Halloween", 0);
System.out.println(str);
str = methods.removeCharacter("Halloween", 8);
System.out.println(str);
str = methods.removeCharacter("Halloween", 9);
System.out.println(str);
str = methods.removeCharacter("Halloween", 20);
System.out.println(str);
str = methods.removeCharacter("Hi friend", 0);
System.out.println(str);
str = methods.removeCharacter("Hi friend", 1);
System.out.println(str);
str = methods.removeCharacter("Hi friend", 2);
System.out.println(str);
str = methods.removeCharacter(" Hi friend", 0);
System.out.println(str);
str = methods.removeCharacter("A", 0);
System.out.println(str);
str = methods.removeCharacter("A ", 0);
System.out.println(str);
str = methods.removeCharacter("A", 1);
System.out.println(str);
str = methods.removeCharacter("A ", 1);
System.out.println(str);






    }
}




public class CustomStringMethods {
    public CustomStringMethods() {}

    public boolean longerThan(String word, int maxLength) {
        if (word.length() > maxLength) {
            return true;
        } else {
            return false;
        }
    }
    public String funnyString(String word, int idx) {
        String currLetter = word.substring(idx,idx+1);
        String newWord = word + currLetter;
        currLetter += newWord;
        return currLetter;
    }

    public String halvesReversed(String word) {
        String secondHalf = word.substring(word.length()/2);
        String firstHalf = word.substring(0,word.length()/2);
        return secondHalf + firstHalf;
    }

    public String pigLatin(String word) {
        String beginning = word.substring(0,1);
        String newWord = word.substring(1);
        newWord += beginning;
        newWord += "ay";
        return newWord;
    }

    public String removeCharacter(String word, int idx) {
        if (word.length()-1 < idx) {
            return word;
        }
        return "";
    }

    public String insertAt(String word, String subword, String character) {
        if (word.indexOf(character) >= 0) {
            int charPosition = word.indexOf(character);
            String firstHalf = word.substring(0,charPosition);
            String secondHalf = word.substring(charPosition, word.length());
            return firstHalf + subword + secondHalf;
        } else {
            return word;
        }
    }

    public String endUp(String word, int num) {
        if (word.length() > num) {
            String firstHalf = word.substring(0,num);
            String secondHalf = word.substring(num,word.length());
            secondHalf = secondHalf.toUpperCase();
            return firstHalf + secondHalf;
        } else {
            return word.toUpperCase();
        }
    }

    public String yellOrWhisper(String word) {
        String begin = word.substring(0,1);
        if (begin == begin.toUpperCase()) {
            return word.toUpperCase();
        } else {
            return word.toLowerCase();
        }
    }

}
