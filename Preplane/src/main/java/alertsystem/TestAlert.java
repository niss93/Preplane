package alertsystem;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class TestAlert {
  
 public static void main(String[] args)
 {
  @SuppressWarnings("unused")
ApplicationContext alert = new ClassPathXmlApplicationContext("Alert.xml"); 
 }
 
}

