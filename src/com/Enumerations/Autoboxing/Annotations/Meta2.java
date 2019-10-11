package com.Enumerations.Autoboxing.Annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2 {

  String str();

  int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface What {

  String description();
}


@What(description = "An annotation test class")
@MyAnno(str = "Meta2", val = 99)
public class Meta2 {

  @What(description = "An annotation test method")
  @MyAnno(str = "Testing", val = 100)
  public static void myMeth() {
    Meta2 ob = new Meta2();

    try {

      Annotation annos[] = ob.getClass().getAnnotations();

      System.out.println("All annotations for Meta2");

      for (Annotation a : annos) {
        System.out.println(a);
        System.out.println();
      }

      Method m = ob.getClass().getMethod("myMeth", null);
      annos = m.getAnnotations();

      System.out.println("All annotations for myMeth");

      for (Annotation a : annos) {
        System.out.println(a);
      }


    } catch (NoSuchMethodException sm) {
      System.out.println("No such method..");
    }

  }

  public static void main(String[] args) {
    myMeth();
  }

}
