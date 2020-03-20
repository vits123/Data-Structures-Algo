/*
   -- Symmetry- for non-null reference values, x.equals(y) must return true if and only if
  y.equals(x) returns true
  
*/



package com.equalscontractdemo;

import java.util.Objects;

// Broken - violates symmetry
public final class CaseInsensitiveString {
  
  private final String s;

  public CaseInsensitiveString(String s) {
    this.s = Objects.requireNonNull(s);

  }

  @Override
  public boolean equals(Object o) {
    
    
    /*

    if (o instanceof CaseInsensitiveString) {
      return s.equalsIgnoreCase(((CaseInsensitiveString) o).s);
    }

    if (o instanceof String) // one-way interoperability
      return s.equalsIgnoreCase((String) o);

    return false;

  */
    
    
    return o instanceof CaseInsensitiveString && ( (CaseInsensitiveString) o).s.equalsIgnoreCase(s); // solution to above faulty code
    
    

  }
  
  public static void main(String[] args) {
     CaseInsensitiveString cis=new CaseInsensitiveString("Polish");
     String s="polish";
     
    System.out.println(cis.equals(s));
    System.out.println(s.equals(cis));  // false - because equals in String class is oblivious to case-insensitive strings
     
  }
  
  
}
