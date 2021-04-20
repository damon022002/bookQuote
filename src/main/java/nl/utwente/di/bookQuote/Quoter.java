package nl.utwente.di.bookQuote;

import java.awt.print.Book;
import java.util.HashMap;

public class Quoter {
    public HashMap<String,Double> bookPrice = new HashMap<>();
    public double getBookPrice(String bookName) {
        return bookPrice.getOrDefault(bookName, 0.0);
    }

    public Quoter() {
        bookPrice.put("1",10.0);
        bookPrice.put("2",45.0);
        bookPrice.put("3",20.0);
        bookPrice.put("4",35.0);
        bookPrice.put("5",50.0);
    }
}
