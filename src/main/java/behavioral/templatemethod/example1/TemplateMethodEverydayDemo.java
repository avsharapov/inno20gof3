package behavioral.templatemethod.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TemplateMethodEverydayDemo {
  private static Logger logger = LoggerFactory.getLogger(TemplateMethodEverydayDemo.class);

  public static void main(String[] args) {
    Person bryan = new Person("Bryan", "801-555-1212", 39);
    Person mark = new Person("Mark", "801-444-1234", 41);
    Person chris = new Person("Chris", "801-222-5151", 38);

    List<Person> people = new ArrayList<>();
    people.add(bryan);
    people.add(mark);
    people.add(chris);

    logger.info("Not sorted: {}", people);

    Collections.sort(people);

    logger.info("Sorted by age: {}", people);
  }
}

class Person implements Comparable<Person> {
  private String name;
  private String phoneNumber;
  private int age;

  public Person(String name, String phoneNumber, int age) {
    this.name = name;
    this.phoneNumber = phoneNumber;
    this.age = age;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", phoneNumber='" + phoneNumber + '\'' +
        ", age=" + age +
        '}';
  }

  // template method
  @Override
  public int compareTo(Person o) {
    if (this.age > o.age) {
      return 1;
    }
    if (this.age < o.age) {
      return -1;
    }
    return 0;
  }
}