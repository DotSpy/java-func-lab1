package by.bsuir.labmda;

import java.util.Comparator;

public class VowelsCountComparator implements Comparator<WordToVowels> {

  @Override
  public int compare(WordToVowels o1, WordToVowels o2) {
    return o2.getVowelsCount() - o1.getVowelsCount();
  }
}
