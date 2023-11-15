public interface CartInterface {
    void printBookList(Book[] p);
    boolean isCartInBook(Stirng id);
    void insertBook(Book p);
    void removeCart(int numId);
    void deleteBook();
}
