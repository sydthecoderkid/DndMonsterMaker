import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;
import java.util.Arrays;


public class CreatePDF {
    public  Document document = new Document();
    private static String FILE = "/Users/sydneykeating/Downloads/TempFile.pdf";
    private static Font catFont = new Font(Font.FontFamily.TIMES_ROMAN, 18,
            Font.BOLD);

    public void createDocument(){
        /*Make methods for inserting the text for the document! Also, make sure to change the page for the final
        document. Insert an image of the pdf into the document at the end. Maybe also have a prompt to specify a class path?
        */
        try {
            PdfWriter.getInstance(document, new FileOutputStream(FILE));
            document.newPage();
            document.open();
            addBasics();
            addText();
            document.newPage();
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addText() throws DocumentException {
        Paragraph preface = new Paragraph();
        preface.setAlignment(Element.ALIGN_CENTER);
        preface.setFont(catFont);
        String MonsterName = Totalinfo.monsterInfo.get("Monster Name");
        preface.add(MonsterName);
        document.add(preface);
    }

    public void addBasics(){
        document.addTitle("Total Monster");
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
    }

}
