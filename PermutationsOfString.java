/**
 * 
 * @author Shivam
 * @date 19-09-2017
 * @description Class PermutationsOfString will take a String and displays all possible combinations of it.
 */
import java.util.ArrayList;
import java.util.List;

public class PermutationsOfString {
	List<String> possiblePermutations = new ArrayList<String>();

    /**
     * @param inputString,  actual string entered by user
     * @param firstIndex
     * @param secondIndex
     * @return String after swapping
     */
    public String swap(String inputString, int firstIndex, int secondIndex) {
        char[] characterArray = inputString.toCharArray();
        char temp = characterArray[firstIndex];
        characterArray[firstIndex] = characterArray[secondIndex];
        characterArray[secondIndex] = temp;
        return String.valueOf(characterArray);
    }
    
     /**
     * @param inputString, the String entered by user and calling itself
     * @param lowIndex, initial index, initially 0
     * @param highIndex , length of array
     * @return ArrayList<String>
     */

    List<String> generatePermutations(String inputString, int lowIndex,
            int highIndex) {

        if (lowIndex == highIndex) {
        	//condition to check that is the last string is same as current string or not
            if (!possiblePermutations.contains(inputString)) {  
                possiblePermutations.add(inputString);
            }
        } else {
            for (int iterateIndex = lowIndex; iterateIndex <= highIndex; iterateIndex++) {
                inputString = swap(inputString, iterateIndex, lowIndex);
                generatePermutations(inputString, lowIndex + 1, highIndex);
                inputString = swap(inputString, iterateIndex, lowIndex);
            }
        }
        return possiblePermutations;
    }
    
    /**
     * 
     * @param inputString, will take input String and calls another function passing initial and last index of String
     * @return , the List<String> of all possible combinations
     */
    List<String> generatePermutations(String inputString) {
    	int lowIndex = 0;
        int highIndex = inputString.length() - 1;
        return generatePermutations(inputString, lowIndex, highIndex);
    }
}

