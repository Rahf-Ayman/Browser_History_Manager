public interface IBrowserHistoryManager {
    public void visit(String url) ; /* Add new URL and clear forward stack */
    public String back() ; /* Move to the previous page using stack */
    public String forward();  /* Move to the next page using stack */
    public void jumpTo(String url);  /* Navigate to a specific page */
    public void displayHistory();  /* Print all visited pages */
}
