import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;


public class CreatePDF {
    public  Document document = new Document();
    private static String FILE = "/Users/sydneykeating/Downloads/TempFile.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);

    public  void createDocument(){
        /*Make methods for inserting the text for the document! Also, make sure to change the page for the final
        document. Insert an image of the pdf into the document at the end. Maybe also have a prompt to specify a class path?
        */
        try {
            Document document = new Document();
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.newPage();
            document.open();
            document.addTitle("Total Monster");
            document.addSubject("Using iText");
            document.addKeywords("Java, PDF, iText");
            Paragraph preface = new Paragraph();
            preface.add(new Paragraph("Title of the document", catFont));
            document.add(preface);
            document.newPage();
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
