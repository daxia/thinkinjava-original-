package generics;
//: generics/LimitsOfInference.java
import java.util.*;

import chapter14_typeinfo.pets.*;

public class LimitsOfInference {
  static void
  f(Map<Person, List<? extends Pet>> petPeople) {}
  public static void main(String[] args) {
    // f(New.map()); // Does not compile
  }
} ///:~
