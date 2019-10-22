package Optional;

import java.util.Optional;

public class OptionalDemo {

  public static void main(String[] args) {
    Optional<String> noVal = Optional.empty(); // isPresent() is false here
    Optional<String> hasVal = Optional.of("ABCDE");
    if (noVal.isPresent()) {
      System.out.println("This will not execute");
    } else {
      System.out.println("noVal has no value");
    }

    if (hasVal.isPresent()) {
      System.out.println("String in hasVal is: " + hasVal.get());
    }
    String defStr = noVal.orElse("Default String ");
    System.out.println(defStr);

  }

}
