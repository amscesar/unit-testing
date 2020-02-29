package school.cesar.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyApplicationTest {
    MessageService FakeService = new MessageService(){
        @Override
        public boolean sendMessage(String msg, String rec) {
            return Math.random() > 0.5;
        }
    };

    @Test
    public void processMessage_sendMessageIsTrue_true() {
        MessageService service = new MessageService() {
            @Override
            public boolean sendMessage(String msg, String rec) {
                return true;
            }
        };

        MyApplication application = new MyApplication();
        application.setService((service));
        Message dummy = new Message();
        Assertions.assertTrue(application.processMessage(dummy));
    }

}
