package test.automation.getrequest;

import com.intuit.karate.junit5.Karate;
import com.intuit.karate.junit5.Karate.Test;

public class TestGetRunner {

 @Test
 public Karate runTests() {
 return Karate.run("getrequest").relativeTo(getClass());
 }


 //Running Tests using specific feature:
 // public Karate runTestUsingClassPath(){

 //  return Karate.run("classpath:automation/getrequest/getRequest.feature");
 // }
}
