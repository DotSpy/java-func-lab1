package by.bsuir.labmda;

public class WordToVowels {

  private String word;
  private Integer vowelsCount;

  public WordToVowels(String word, Integer vowelsCount) {
    this.word = word;
    this.vowelsCount = vowelsCount;
  }

  public String getWord() {
    return word;
  }

  public void setWord(String word) {
    this.word = word;
  }

  public Integer getVowelsCount() {
    return vowelsCount;
  }

  public void setVowelsCount(Integer vowelsCount) {
    this.vowelsCount = vowelsCount;
  }
}
