package nl.utwente.di.bookQuote;

import org.junit.Test;
import org.junit.Assert;

//testing the quoter
public class TestQuoter {

    @Test
    public void testBook1() throws Exception {
        Quoter Quoter = new Quoter();
        double price = Quoter.getBookPrice("1");
        Assert.assertEquals("Price of book 1", 10.0, price, 0.0);
    }
}
