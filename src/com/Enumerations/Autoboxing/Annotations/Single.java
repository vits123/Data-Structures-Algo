package com.Enumerations.Autoboxing.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MySingle {

  int value(); // this variable name must be value
}

public class Single {

  @MySingle(100)
  public static void myMeth() {
    Single ob = new Single();

    try {

      Method m = ob.getClass().getMethod("myMeth", null);

      MySingle anno = m.getAnnotation(MySingle.class);

      System.out.println(anno.value());

    } catch (NoSuchMethodException e) {
      System.out.println("No such method ");
    }

  }

  public static void main(String[] args) {
    myMeth();
  }

}
