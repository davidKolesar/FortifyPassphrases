# FortifyPassphrases
Takes a given passphrase (String) and makes it stronger by applying 5 major changes to it. 

Given text in capital letters including (with or without) numbers and non alphabetic characters. This program will:

 1.  Shift each letter by a given number but the transformed letter must be a letter (circular shift),
 2.  Replace each number by its complement to 9,
 3.  Keep such as non-alphabetic and non-numeric characters,
 4.  Downcase each letter in odd position, upcase each letter in even position (the first character is in position 0),
 5.  Reverse the whole result.

#Example:

your text: "BORN IN 2015!", shift once

1 + 2 + 3 -> "CPSO JO 7984!"

4 "CpSo jO 7984!"

5 "!4897 Oj oSpC"