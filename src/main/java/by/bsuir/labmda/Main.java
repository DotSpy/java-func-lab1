package by.bsuir.labmda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

  public static void main(String[] args) throws IOException {
    SortWordToVowelsService service = new SortWordToVowelsService();
    try (Stream<String> lines =
        Files.lines(Paths.get("D:\\projects\\java-func-lab1\\src\\main\\resources\\text.txt"))) {
      List<String> textLines = lines.collect(Collectors.toList());
      textLines
          .forEach(
              line ->
                  Arrays.stream(line.split("\\."))
                      .map(sentence -> sentence.replaceAll("[^a-zA-Z \n]", ""))
                      .map(
                          sentence ->
                              service.sentenceToWordToVowels(sentence).stream()
                                  .sorted(new VowelsCountComparator())
                                  .collect(Collectors.toList()))
                      .map(
                          wordsToVowels ->
                              wordsToVowels.stream()
                                  .map(WordToVowels::getWord)
                                  .collect(Collectors.joining(" ")))
                      .collect(Collectors.toList())
              .forEach(System.out::println)
          );
    }
  }
}
