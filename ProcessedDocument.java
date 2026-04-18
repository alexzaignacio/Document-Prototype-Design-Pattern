public class ProcessedDocument {
    public static void main(String[] args) {
        DocumentRegistry registry = new DocumentRegistry();

        // Create and use PDF document
        Document pdfDoc = registry.createPdfDocument("annual_report_2024.pdf", "Acme Corp", 150);
        pdfDoc.open();
        System.out.println("Type: " + pdfDoc.getType() + ", File: " + ((PdfDocument) pdfDoc).getFileName() +
                ", Author: " + ((PdfDocument) pdfDoc).getAuthor() +
                ", Pages: " + ((PdfDocument) pdfDoc).getPageCount());

        // Create and use Text document
        Document textDoc = registry.createTextDocument("meeting_notes.txt", "UTF-8", 250);
        textDoc.open();
        System.out.println("Type: " + textDoc.getType() + ", Path: " + ((TextDocument) textDoc).getFilePath() +
                ", Encoding: " + ((TextDocument) textDoc).getEncoding() +
                ", Words: " + ((TextDocument) textDoc).getWordCount());

        // Create and use Spreadsheet document
        Document spreadsheetDoc = registry.createSpreadsheetDocument("sales_data_q1.xlsx", 1000, 20);
        spreadsheetDoc.open();
        System.out.println("Type: " + spreadsheetDoc.getType() + ", Name: " + ((SpreadsheetDocument) spreadsheetDoc).getSpreadsheetName() +
                ", Rows: " + ((SpreadsheetDocument) spreadsheetDoc).getRowCount() +
                ", Columns: " + ((SpreadsheetDocument) spreadsheetDoc).getColumnCount());

        // Additional PDF document
        Document pdfDoc2 = registry.createPdfDocument("summary_report.pdf", "Acme Corp", 30);
        pdfDoc2.open();
    }
}