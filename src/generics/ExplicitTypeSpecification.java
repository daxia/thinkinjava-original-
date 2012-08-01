package generics;
//: generics/ExplicitTypeSpecification.java
import java.util.*;

import chapter14_typeinfo.pets.*;
import net.mindview.util.*;

public class ExplicitTypeSpecification {
  static void f(Map<Person, List<Pet>> petPeople) {}
  public static void main(String[] args) {
    f(New.<Person, List<Pet>>map());
  }
} ///:~
