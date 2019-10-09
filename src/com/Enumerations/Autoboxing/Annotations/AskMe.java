package com.Enumerations.Autoboxing.Annotations;

import java.util.Random;

enum Answers {
  No, Yes, Maybe, Later, Soon, Never
}

class Question {

  Random random = new Random();

  Answers ask() {
    int prob = (int) (100 * random.nextDouble());
    if (prob < 15) {
      return Answers.Maybe;
    } else if (prob < 30) {
      return Answers.No;
    } else if (prob < 60) {
      return Answers.Yes;
    } else if (prob < 75) {
      return Answers.Later;
    } else if (prob < 98) {
      return Answers.Soon;
    } else {
      return Answers.Never;
    }
  }
}


public class AskMe {

  static void answer(Answers result) {
    switch (result) {
      case No:
        System.out.println("NO");
        break;

      case Yes:
        System.out.println("YES");
        break;

      case Maybe:
        System.out.println("MAYBE");
        break;

      case Later:
        System.out.println("LATER");
        break;

      case Soon:
        System.out.println("SOON");
        break;

      case Never:
        System.out.println("NEVER");
        break;

    }
  }


  public static void main(String[] args) {
    Question q = new Question();
    answer(q.ask());
    answer(q.ask());
    answer(q.ask());
    answer(q.ask());

  }
}
