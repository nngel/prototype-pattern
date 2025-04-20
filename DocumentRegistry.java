public class DocumentRegistry {
    private PdfDocument pdfPrototype = new PdfDocument();
    private TextDocument textPrototype = new TextDocument();
    private SpreadsheetDocument spreadsheetPrototype = new SpreadsheetDocument();

    public PdfDocument createSheep(String fileName, String author, int pageCount) {
        PdfDocument newPdf = pdfPrototype.clone();
        newPdf.setFileName(fileName);
        newPdf.setAuthor(author);
        newPdf.setPageCount(pageCount);
        return newPdf;
    }

    public TextDocument createHorse(String filePath, String encoding, int wordCount) {
        TextDocument newText = textPrototype.clone();
        newText.setFilePath(filePath);
        newText.setEncoding(encoding);
        newText.setWordCount(wordCount);
        return newText;
    }

    public SpreadsheetDocument createCow(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument newSpreadsheet = spreadsheetPrototype.clone();
        newSpreadsheet.setSpreadsheetName(spreadsheetName);
        newSpreadsheet.setRowCount(rowCount);
        newSpreadsheet.setColumnCount(columnCount);
        return newSpreadsheet;
    }
}