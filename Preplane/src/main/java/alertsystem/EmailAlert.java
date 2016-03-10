package alertsystem;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
 
import javax.mail.MessagingException;
 
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.core.io.ClassPathResource;
import org.springframework.scheduling.quartz.QuartzJobBean;

import buisnessobject.User;
 
public class EmailAlert extends QuartzJobBean
{
  
 private EmailService emailService;
 public void setEmailService(EmailService emailService)
 {
  this.emailService = emailService;
 }
  
 @Override
 protected void executeInternal(JobExecutionContext context) throws JobExecutionException
 {
  System.out.println("Alert !! ");
  List<User> usersToAlert = getUsersToAlert();
  for (User user : usersToAlert)
  {
   try
   {
    Email email = new Email();
    email.setFrom("younes@lamghari.com");
    email.setSubject("Alert System !");
    email.setTo(user.getEmail());
    email.setText("<h1>Dear "+user.getName()+
      ",I'm here to alert you that .. :-)</h1>");
    
    emailService.sendEmail(email);
   }
   catch (MessagingException e)
   {
    e.printStackTrace();
   }
   catch (Exception e)
   {
    e.printStackTrace();
   }
  }
 }
  
 private List<User> getUsersToAlert()
 {
  List<User> users = new ArrayList<User>();
  User user1 = new User("Younes", "aaa@gmail.com", new Date());
  users.add(user1);
  return users;
 }
}
