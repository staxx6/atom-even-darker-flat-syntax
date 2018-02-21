import de.pack;

public static void main(Stirng[] args) {
  TestClass testclass = new TestClass("One");
  System.out.println(testclass.printTheNumber(6));
}

/*
* Funny comment or so TODO: More fun
*/
@Override
public Class TestClass exntends OtherClass {

  private String name;
  private int aNumber;

  public TextClass(final String name) {
    this.name = name;
  }

  public int printTheNumber(final int number) {
    return "The class: " + name + " prints the number"
      + number;
  }
}
