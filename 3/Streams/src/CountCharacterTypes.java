import java.io.*;

public class CountCharacterTypes {
    public static void main(String[] args) throws IOException {
        try(
                BufferedReader bufferedReader =
                        new BufferedReader(
                                new FileReader("resources/Words"));
                BufferedWriter bufferedWriter =
                        new BufferedWriter(
                                new FileWriter("resources/Count-chars"))
        ){
            String line;
            int countOfVowelsInTheText = 0;
            int countOfPunctuationMarksInTheText = 0;
            int countOfConsonantsInTheText = 0;
            while (!((line=bufferedReader.readLine()) == null)){
                countOfVowelsInTheText += countingTheVowelsInTheLine(line);
                countOfConsonantsInTheText += countingTheConsonantsInTheLine(line);
                countOfPunctuationMarksInTheText = countingThePunctuationMarksInTheLine(line);
            }
            bufferedWriter.write("Vowels: " + countOfVowelsInTheText);
            bufferedWriter.newLine();
            bufferedWriter.write("Consonants: " + countOfConsonantsInTheText);
            bufferedWriter.newLine();
            bufferedWriter.write("Punctuation: " + countOfPunctuationMarksInTheText);
        }
    }

    private static int countingThePunctuationMarksInTheLine(String line) {
        return ((int) line.chars().filter(ch -> ch == '!' || ch == ',' || ch == '?' || ch == '.').count());
    }

    private static long countingTheConsonantsInTheLine(String line) {
        return line.chars().filter(ch -> !(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch=='u'|| ch == ' '
                || ch=='!' || ch==',' || ch=='?' || ch=='.')).count();
    }

    private static long countingTheVowelsInTheLine(String line) {
        return line.chars().filter(ch -> ch=='a' ||  ch=='e' || ch=='i' || ch=='o' || ch=='u').count();
    }
}