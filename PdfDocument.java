public class PdfDocument implements Document {
    private String fileName;
    private String author;
    private int pageCount;

    public PdfDocument() {
        System.out.println("Creating a PDF Document prototype.");
    }

    public void setFileName(String fileName) { this.fileName = fileName; }
    public void setAuthor(String author) { this.author = author; }
    public void setPageCount(int pageCount) { this.pageCount = pageCount; }

    @Override
    public PdfDocument clone() {
        try {
            return (PdfDocument) super.clone();
        } catch (CloneNotSupportedException e) {
            System.out.println("Cloning not supported!");
            return null;
        }
    }

    @Override
    public String getType() {
        return "PDF";
    }

    @Override
    public void open() {
        System.out.println("\nOpening PDF Document: " + fileName + " by " + author + " (" + pageCount + " pages)");
        System.out.println("Type: " + getType() + ", File: " + fileName + ", Author: " + author + ", Pages: " + pageCount);
    }
}