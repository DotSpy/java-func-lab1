package by.bsuir.labmda;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class SortWordToVowelsService {

  private static final Set<Character> vowels =
      new HashSet<Character>() {
        {
          add('a');
          add('A');
          add('e');
          add('E');
          add('i');
          add('I');
          add('o');
          add('O');
          add('u');
          add('U');
        }
      };

  public List<WordToVowels> sentenceToWordToVowels(String sentence) {
    return Arrays.stream(sentence.split(" "))
        .map(word -> new WordToVowels(word, countVowels(word)))
        .collect(Collectors.toList());
  }

  private static Integer countVowels(String string) {
    return (int) string.chars().mapToObj(c -> (char) c).filter(vowels::contains).count();
  }
}
