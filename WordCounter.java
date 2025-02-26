import java.util.Scanner;

  public class WordCounter{
    
    public static String getSentenceInput(){
    
      System.out.println("Enter a sentence: ");
      Scanner scanner = new Scanner(System.in);
      String sentence = scanner.nextLine();
      return sentence;
  }
  
  public static int countWords(String sentence){
    
      if (sentence == null || sentence.trim().isEmpty()) {
        return 0;
      }
      
      String[] words = sentence.trim().split("\\s+");
      return words.length;
  }
  
  public static void main(String[] args){
      String text = getSentenceInput();
      int result = countWords(text);
      
      System.out.println("The sentence has a " + result + "words"); 
    }
  }
