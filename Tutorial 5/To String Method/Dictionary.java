package ToStringMethod;

import ToStringMethod.Book;

public class Dictionary extends Book {
    private int words; // number of words in the dictionary

    Dictionary(int words, int pages) {
        super(pages);
        this.words = words;
    }

    @Override
    public String toString() {
        return " words: " + words + " " + "pages:" + " " + super.toString();
    }
}
