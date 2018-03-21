import org.junit.Assert;
import org.junit.Test;

public class MessageTest {

    @Test
    public void getTimeStampTest() {

    }

    @Test
    public void getSequenceTest() {
        Message message = new Message("sequence", "fromId", "toId", "message");
        Assert.assertEquals("sequence", message.getSequence());
    }


    @Test
    public void getFromIdTest() {
        Message message = new Message("sequence", "fromId", "toId", "message");
        Assert.assertEquals("fromId", message.getFromId());
    }

    @Test
    public void getToIdTest() {
        Message message = new Message("sequence", "fromId", "toId", "message");
        Assert.assertEquals("toId", message.getToId());
    }

    @Test
    public void getMessageTest() {
        Message message = new Message("sequence", "fromId", "toId", "message");
        Assert.assertEquals("message", message.getMessage());
    }

}
