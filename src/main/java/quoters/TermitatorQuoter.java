package quoters;

import lombok.Setter;
import lombok.Value;

import javax.annotation.PostConstruct;

@Profiling
public class TermitatorQuoter implements Quoter {
    @InjectRandomInt(min = 2 , max = 7)
    private int repeat;

    private String message;

    @PostConstruct
    public void init(){
        System.out.println("Phase 2");
        System.out.println(repeat);
    }

    public TermitatorQuoter(){
        System.out.println("Phase 1");
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void sayQuote() {
        for (int i = 0; i < repeat; i++) {
            System.out.println("message = " + message);
        }
    }
}
