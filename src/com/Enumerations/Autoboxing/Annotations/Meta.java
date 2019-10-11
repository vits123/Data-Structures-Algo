package com.Enumerations.Autoboxing.Annotations;

// An annotation type declaration

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno {

  String str();

  int val();
}

public class Meta {

  @MyAnno(str = "Annotation example", val = 100)
  public static void myMeth() {
    Meta ob = new Meta();
    // obtain annotation for this method and disply values

    try {
      // First get the class object that represents this class

      Class<?> c = ob.getClass();

      // Now, get a method object that represent this method

      Method m = c.getMethod("myMeth", null);

      // Get the annotation for this class

      MyAnno anno = m.getAnnotation(MyAnno.class);

      // Finally, display the values

      System.out.println(anno.str() + " " + anno.val());

    } catch (NoSuchMethodException me) {
      me.printStackTrace();
    }

  }


  public static void main(String[] args) {
    myMeth();
  }
}
