
public class RepeatedWords {

    public static void main(String[] args) {
        String phrase = "Fear leads to anger; anger leads to hatred; hatred leads to conflict; " +
                "conflict leads to suffering";  //Input String
        String[] words = phrase.split(" ");  //Split the word from String
        int wrc = 1;    //Variable for getting Repeated word count

        for (int i = 0; i < words.length; i++) //Outer loop for Comparison
        {
            for (int j = i + 1; j < words.length; j++) //Inner loop for Comparison
            {

                if (words[i].equals(words[j]))  //Checking for both strings are equal
                {
                    wrc = wrc + 1;    //if equal increment the count
                    words[j] = "0"; //Replace repeated words by zero
                }
            }
            if (words[i] != "0")
                System.out.println(words[i] + "--" + wrc); //Printing the word along with count
            wrc = 1;

        }

    }
}


