public interface Subject {
    void add (Observer observer);
    void remove (Observer observer);
    void notification(String mess);
}
