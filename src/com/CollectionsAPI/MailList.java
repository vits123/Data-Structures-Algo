package com.CollectionsAPI;

import java.util.LinkedList;

class Address {

  private String name;
  private String street;
  private String city;
  private String state;
  private String code;

  Address(String name, String street, String city, String state, String code) {
    this.name = name;
    this.street = street;
    this.city = city;
    this.state = state;
    this.code = code;
  }

  public String toString() {
    return name + "\n" + street + "\n" + city + "\n" + " " + state + " " + code;
  }

}

public class MailList {

  public static void main(String[] args) {
    LinkedList<Address> ml = new LinkedList<Address>();
    ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
    ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
    ml.add(new Address("Tom Carlton", "867 Elm St", "Champaign", "IL", "61820"));

    for (Address ad : ml) {
      System.out.println(ad + "\n");

    }
  }

}
