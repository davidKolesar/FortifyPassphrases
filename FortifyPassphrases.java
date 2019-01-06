import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PlayPass {
	public static String playPass(String s, int n) {
        //stores instances of numbers and their index within passphrase
        Map<Integer, Integer> instancesOfNumbers = new HashMap<>();
        //stores characters in passphrase
        List<Character> orderedShiftedCharacterResults = new ArrayList<>();
        char[] characters = s.toCharArray();
        int indexOfCharacter = 0;
        int complement;
        boolean isAdded;

        for (char textCharacter : characters)
        {
            isAdded = false;

            //check if character is an integer
            if (Character.isDigit(textCharacter) && isAdded == false)
            {
                isAdded = true;
                int digitValue = Integer.parseInt(String.valueOf(textCharacter));
                instancesOfNumbers.put(indexOfCharacter, digitValue);
                //add index to character list to avoid index out of bounds exception
                orderedShiftedCharacterResults.add(indexOfCharacter, textCharacter);
                //evaluate complement
                if (digitValue - 9 > 0)
                {
                    complement = (digitValue - 9);
                }
                else
                {
                    complement = (9 - digitValue);
                }
                instancesOfNumbers.put(indexOfCharacter, complement);
            }

            //if character is a symbol, do not change it
            if (!Character.isLetter(textCharacter) && !Character.isDigit(textCharacter) && isAdded == false)
            {
                isAdded = true;
                orderedShiftedCharacterResults.add(indexOfCharacter, textCharacter);
            }
            
            //force lower case
            char lowerCaseCharacter = Character.toLowerCase(textCharacter);

            //translate character to ASCII value
            int asciiValue = (int)lowerCaseCharacter;

            //determine if circular shift is necessary
            if (asciiValue + n > 122 && isAdded == false)
            {
                isAdded = true;
                char asciiCharacter = translateIntegerToCharValue((asciiValue + n - 122) + 96);
                char properlyCasedValue = determineCasing(asciiCharacter, indexOfCharacter);
                orderedShiftedCharacterResults.add(indexOfCharacter, properlyCasedValue);
            }
            if (isAdded == false)
            {
                char asciiCharacter = translateIntegerToCharValue(asciiValue + n);
                char properlyCasedValue = determineCasing(asciiCharacter, indexOfCharacter);
                orderedShiftedCharacterResults.add(indexOfCharacter, properlyCasedValue);
            }

            indexOfCharacter++;
        }

        StringBuffer buffer = new StringBuffer();
        //Combine data to create a passphrase String 
        for (int i = 0; i < (orderedShiftedCharacterResults.size()); i++)
        {
            //determine if there are integers in the passphrase
            if (!instancesOfNumbers.isEmpty() && instancesOfNumbers.containsKey(i))
            {

                for (Integer index : instancesOfNumbers.keySet())
                {
                    if (i == index)
                    {
                        buffer.append(Integer.toString(instancesOfNumbers.get(index)));
                    }
                }

            }
            else
            {
                buffer.append(orderedShiftedCharacterResults.get(i));
            }
        }

        buffer.reverse();
        return buffer.toString();
    }

    private static char translateIntegerToCharValue(int asciiValue)
    {
        char asciiCharacter = (char)asciiValue;
        return asciiCharacter;
    }

    private static char determineCasing(char character, int index)
    {
        if (index % 2 == 0)
        {
            return Character.toUpperCase(character);
        }
        else
        {
            return Character.toLowerCase(character);
        }
    }
}