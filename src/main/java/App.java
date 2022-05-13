/**
 * 123.
 * 123
 */
public class App {

  /**
   * 123.
   * 123
   */
  public static void main(String[] args) {
    GradeConverter converter = new GradeConverter();

    for (int i = 0; i < 105; i++) {
      System.out.println(i + ";" + converter.convert(i));
    }
  }
}
