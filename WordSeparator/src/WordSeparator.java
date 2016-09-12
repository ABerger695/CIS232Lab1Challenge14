import java.util.Scanner;

public class WordSeparator {
public static void main(String[] args){
	
	//Initialize Scanner
	Scanner keyboard = new Scanner(System.in);
	
	//Declare Variables
	String runSentence, fixSentence;
	
	//Ask user for sentence
	System.out.println("Please enter a sentence: ");
	runSentence = keyboard.nextLine();
	
	//Close keyboard
	keyboard.close();
	
	//Get the fixed sentence
	fixSentence = separateWords(runSentence);
	
	//Display the fixed sentence
	System.out.println("This is your fixed sentence: " + fixSentence);
}

private static String separateWords(String runSentence) 
{
	//StringBuilder Variable
	StringBuilder str = new StringBuilder(runSentence); 
    int i = 1; 

    //While loop used add spaces and lower-case letters
    while (i < str.length())
    {
        if(Character.isUpperCase(str.charAt(i)))
        {
            str.insert(i, ' '); 
            i++;
            char ch = Character.toLowerCase(str.charAt(i)); 
            str.setCharAt(i, ch);
        }
        i++; 
    }
    return str.toString();
}
}
