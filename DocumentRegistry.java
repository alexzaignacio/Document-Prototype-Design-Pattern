public class DocumentRegistry {
    private PdfDocument pdfPrototype;
    private TextDocument textDocumentPrototype;
    private SpreadsheetDocument spreadsheetPrototype;

    public DocumentRegistry() {
        System.out.println("Creating a PDF Document prototype.");
        pdfPrototype = new PdfDocument("default.pdf", "Default Author", 0);

        System.out.println("Creating a Text Document prototype.");
        textDocumentPrototype = new TextDocument("default.txt", "UTF-8", 0);

        System.out.println("Creating a Spreadsheet Document prototype.");
        spreadsheetPrototype = new SpreadsheetDocument("default.xlsx", 0, 0);
    }

    public Document createPdfDocument(String fileName, String author, int pageCount) {
        PdfDocument newDoc = (PdfDocument) pdfPrototype.clone();
        newDoc = new PdfDocument(fileName, author, pageCount); // Update fields after clone
        return newDoc;
    }

    public Document createTextDocument(String filePath, String encoding, int wordCount) {
        TextDocument newDoc = (TextDocument) textDocumentPrototype.clone();
        newDoc = new TextDocument(filePath, encoding, wordCount);
        return newDoc;
    }

    public Document createSpreadsheetDocument(String spreadsheetName, int rowCount, int columnCount) {
        SpreadsheetDocument newDoc = (SpreadsheetDocument) spreadsheetPrototype.clone();
        newDoc = new SpreadsheetDocument(spreadsheetName, rowCount, columnCount);
        return newDoc;
    }
}