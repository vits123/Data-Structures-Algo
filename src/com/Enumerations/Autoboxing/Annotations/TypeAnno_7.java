package com.Enumerations.Autoboxing.Annotations;

// marker annotation that can be applied to a type

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE_USE)
@interface TypeAnno {

}

@Target(ElementType.TYPE_USE)
@interface NotZeroLen {

}

@Target(ElementType.TYPE_USE)
@interface Unique {

}

@Target(ElementType.TYPE_USE)
@interface MaxLen {

  int value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface What_1 {

  String description_1();
}

@Target(ElementType.FIELD)
@interface EmptyOK {

}

@Target(ElementType.METHOD)
@interface Recommended {

}


public class TypeAnno_7<@What_1(description_1 = "Generic Data type ") T> {


  public @Unique TypeAnno_7() {
  }

  @TypeAnno String str;

  @EmptyOK
  String test;


  public int f(@TypeAnno TypeAnno_7<T>this, int x) {
    return 10;
  }


  public @TypeAnno Integer f2(int j, int k) {
    return j + k;
  }


  public @Recommended
  Integer f3(String str) {
    return str.length() / 2;
  }

  String @MaxLen(10) [] @NotZeroLen [] w;

  @TypeAnno Integer[] vec;

  public static void myMeth(int i) {

    TypeAnno_7<@TypeAnno Integer> ob = new TypeAnno_7<@TypeAnno Integer>();

    @Unique TypeAnno_7<Integer> ob2 = new @Unique TypeAnno_7<Integer>();

    Object x = new Integer(10);
    Integer y;

    y = (@TypeAnno Integer) x;

  }


  public static void main(String[] args) {
    myMeth(10);
  }
}
