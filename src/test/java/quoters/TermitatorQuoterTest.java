package quoters;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TermitatorQuoterTest {

    @Test
    public void sayQuote(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        context.getBean(TermitatorQuoter.class).sayQuote();


    }

}