import java.util.*;

public class LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        List<List<Integer>> increasingSequences = new ArrayList<>();
        List<Integer> numbersInput = new ArrayList<>();
        String[] input = reader.nextLine().split(" ");
        for (int i = 0; i < input.length; i++){
            numbersInput.add(Integer.parseInt(input[i]));
        }

        //finding increasing sequences
        for (int i = 0; i <numbersInput.size(); i++){
            if (i > 0 && numbersInput.get(i) > numbersInput.get(i - 1)){
                increasingSequences.get(increasingSequences.size() - 1).add(numbersInput.get(i));
            }
            else{
                increasingSequences.add(new LinkedList<>(Arrays.asList(numbersInput.get(i))));
            }
        }

        //finding the longest sequence
        List<Integer> longestSequence = new ArrayList<>();
        if (increasingSequences.size() >= 1){
            try {
                longestSequence = increasingSequences.stream()
                        .filter(list -> list.size() >= increasingSequences.stream().findAny().get().size())
                        .findFirst()
                        .get();
            }
            catch (NoSuchElementException ex) {
                increasingSequences.stream()
                        .findFirst()
                        .get();
            }
        }

        increasingSequences.stream().findFirst().get();

        for (List<Integer> increasingSequence : increasingSequences){
            increasingSequence.forEach(number-> System.out.print(number + " "));
            System.out.println();
        }

        System.out.print("Longest: ");
        longestSequence.forEach(number-> System.out.print(number + " "));
        //5 -1 10 20 3 4 gives wrong result
    }
}
