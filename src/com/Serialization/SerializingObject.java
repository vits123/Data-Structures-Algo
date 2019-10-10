package com.Serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializingObject {

  public static void main(String[] args) {
    Employee employeeOutput = null;
    FileOutputStream fos = null;
    ObjectOutputStream oos = null;

    employeeOutput = new Employee();
    employeeOutput.setSerializeValueName("Aman");
    employeeOutput.setNonSerializeValueSalary(50000);

    try {
      fos = new FileOutputStream("Employee.ser");
      oos = new ObjectOutputStream(fos);
      oos.writeObject(employeeOutput);

      System.out.println("Serialized data is stored in Employee.ser file");
      oos.close();
      fos.close();

    } catch (IOException e) {
      e.printStackTrace();
    }


  }

}
