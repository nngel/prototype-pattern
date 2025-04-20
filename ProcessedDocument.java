public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();
    
        // Create and open PDF document
        PdfDocument pdf1 = registry.createSheep("annual_report_2024.pdf", "Acme Corp", 150);
        pdf1.open();

        // Create and open Text document
        TextDocument text = registry.createHorse("meeting_notes.txt", "UTF-8", 250);
        text.open();

        // Create and open Spreadsheet document
        SpreadsheetDocument spreadsheet = registry.createCow("sales_data_q1.xlsx", 1000, 20);
        spreadsheet.open();

        // Create and open another PDF document
        PdfDocument pdf2 = registry.createSheep("summary_report.pdf", "Acme Corp", 30);
        pdf2.open();
    }
}