import java.util.Scanner;

public class StringOneForAll {

    public static void main(String[] args) {

        //initial strings definition and reading user input
        Scanner in = new Scanner(System.in);
        String initialString = "Dong-ding-dong";
        String secondaryString = in.nextLine();

        // Stage 1 : count the letters
        int letterCounter = 0;
        for (int i = 0; i < initialString.length(); i++) {
            if (Character.isLetter(initialString.charAt(i))) {
                letterCounter++;
            }
        }
        System.out.println("Initial string contains " + letterCounter + " letters.");

        // Stage 2: check if hardcoded string and inputed string are equal ignoring the case
        System.out.println("Are the two strings equal? 0 if yes : " + initialString.compareToIgnoreCase(secondaryString));

        // Stage 3: show initial string as all caps and all lowercase
        System.out.println(initialString.toUpperCase());
        System.out.println(initialString.toLowerCase());

        // Stage 4: show all dongdexes
        for(int i = -1; i <= initialString.length();){
            i = initialString.toLowerCase().indexOf("dong", i+1);
            if(i != -1){
                System.out.println(i);
            }
            else{
                break;
            }
        }

        // Stage 5: replace all words "dong" with "bong"
        initialString = initialString.toLowerCase().replaceAll("dong","bong");
        System.out.println(initialString);

        // Stage 6: search for duplicated words and show their count
        String[] words = initialString.toLowerCase().split("-");
        int counter = 0;
        for(String word : words){
            if(word != ""){
                for(int i = 0; i < words.length; i++){
                    if(word.matches(words[i])){
                        counter++;
                        words[i] = "";
                    }
                }
                System.out.println("The word " + word + " is repeated " + counter + " times.");
                word = "";
                counter = 0;
            }
        }
    }
}
