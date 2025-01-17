package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

public class ParameterizedTests {
  @ParameterizedTest(name = "Run :{index} - value: {arguments}")
  @ValueSource(ints = {1,5,6})
    void intValues(int theParam){
      System.out.println("theParam = " + theParam);
  }

  @ParameterizedTest
//  @NullSource
//  @EmptySource
  @NullAndEmptySource
  @ValueSource(strings = {"firstString","secondString"})
  void stringValues (String theParam){
    System.out.println("theParam = " + theParam);
  }
  @ParameterizedTest
  @CsvSource(value = {"steve,rogers","ghazala,babar","atif,babar"})
  void csvSource_StringString(String param1, String param2){
    System.out.println("param1 = " + param1 + ", param2 = " + param2);
  }
  @ParameterizedTest
  @CsvSource(value = {"ghazala,32,true","atif,27,false","hello,5,true"})
  void csvSource_StringIntBoolean(String param1, int param2, boolean param3){
    System.out.println("param1 = " + param1 + ", param2 = " + param2 + ", param3 = " + param3);
  }
  @ParameterizedTest
  @CsvSource(value = {"captain america,'steve,rogesrs'","winter solider," + "'bucky,barnes'"})
  void csvSource_StringWithComa(String param1, String param2){
    System.out.println("param1 = " + param1 + ", param2 = " + param2);
  }
  @ParameterizedTest
  @CsvSource(value = {"steve?rogers","bucky?barnes"},delimiter = '?')
  void csvSource_StringWithDiffDelimiter
          (String param1,String param2){
    System.out.println("param1 = " + param1 + ", param2 = " + param2);
  }
  @ParameterizedTest
  @CsvFileSource(files ={"C:\\Users\\Admin\\IdeaProjects\\Junitcourse\\src\\test\\resources\\params\\shoppingList.csv","src/test/resources/params/shoppingList2.csv"} , numLinesToSkip = 1)
  void csvFileSource_StringDoubleIntStringString(String name, double price, int qty, String uom, String provider){
    System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);

  }
  @ParameterizedTest
  @CsvFileSource(files ="src/test/resources/params/shoppingList3.csv", numLinesToSkip = 1,delimiterString = "____")
  void csvFileSource_StringDoubleIntStringStringSpecifiedDelimiter(String name, double price, int qty, String uom, String provider){
    System.out.println("name = " + name + ", price = " + price + ", qty = " + qty + ", uom = " + uom + ", provider = " + provider);
  }
}
