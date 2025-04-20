public interface Document extends Cloneable {
    Document clone();
    String getType();
    void open();
}
