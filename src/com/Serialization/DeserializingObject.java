package com.Serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializingObject {

  public static void main(String[] args) {
    Employee employeeInput = null;
    FileInputStream fis = null;
    ObjectInputStream ois = null;

    try {

      fis = new FileInputStream("Employee.ser");
      ois = new ObjectInputStream(fis);
      employeeInput = (Employee) ois.readObject();

      System.out.println("Serialize data is restored from Employee.ser");
      ois.close();
      fis.close();

    } catch (ClassNotFoundException | IOException e) {
      e.printStackTrace();
    }

    System.out.println("Name of Employee is " + employeeInput.getSerializeValueName());
    System.out.println("Salary of employee is " + employeeInput.getNonSerializeValueSalary());

  }


}
