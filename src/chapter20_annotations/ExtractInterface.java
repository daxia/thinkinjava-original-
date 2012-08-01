//: annotations/ExtractInterface.java
// APT-based annotation processing.
package chapter20_annotations;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.SOURCE)
public @interface ExtractInterface {
  public String value();
} ///:~
