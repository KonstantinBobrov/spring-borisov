package quoters;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

public class TermitatorQuoterTest {

    @Test
    public void sayQuote() throws InterruptedException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        //while (true) {
        //    Thread.sleep(100);
        //    context.getBean(Quoter.class).sayQuote();
        //}

        context.getBean(Quoter.class).sayQuote();
    }

}