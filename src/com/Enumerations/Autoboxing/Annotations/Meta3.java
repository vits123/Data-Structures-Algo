package com.Enumerations.Autoboxing.Annotations;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3 {

  String str() default "Testing";

  int val() default 9000;
}

public class Meta3 {

  @MyAnno3()
  public static void myMeth() {
    Meta3 ob = new Meta3();

    try {

      Class<?> c = ob.getClass();
      Method m = c.getMethod("myMeth", null);

      MyAnno3 anno = m.getAnnotation(MyAnno3.class);
      System.out.println(anno.str() + " " + anno.val());

    } catch (NoSuchMethodException c) {
      System.out.println("No Method");
    }


  }

  public static void main(String[] args) {
    myMeth();
  }

}
