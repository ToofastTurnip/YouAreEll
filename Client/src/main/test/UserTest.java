import org.junit.Assert;
import org.junit.Test;

public class UserTest {

    @Test
    public void getUserIdTest() {
        User user = new User("123", "Mitch", "dingusFella");
        Assert.assertEquals("123", user.getId());
    }

    @Test
    public void getNameTest() {
        User user = new User("123", "Mitch", "dingusFella");
        Assert.assertEquals("Mitch", user.getName());
    }

    @Test
    public void getGithubTest() {
        User user = new User("123", "Mitch", "dingusFella");
        Assert.assertEquals("dingusFella", user.getGithub());
    }

}
