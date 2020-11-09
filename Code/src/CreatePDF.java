import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;
import sun.tools.jstat.Alignment;

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
            addTitle();
            addStats();
            addAttacks();
            document.newPage();
            document.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void addAttacks() throws DocumentException {
        Paragraph AttackOne = new Paragraph();
        Paragraph AttackTwo = new Paragraph();
        Paragraph AttackThree = new Paragraph();
        AttackOne.setAlignment(Element.ALIGN_RIGHT);
        AttackTwo.setAlignment(Element.ALIGN_RIGHT);
        AttackThree.setAlignment(Element.ALIGN_RIGHT);
        AttackOne.setFont(catFont);
        AttackTwo.setFont(catFont);
        AttackThree.setFont(catFont);

        String FirstAttack = Totalinfo.monsterInfo.get("Attack One");

        String SecondAttack = Totalinfo.monsterInfo.get("Attack Two");
        String ThirdAttack = Totalinfo.monsterInfo.get("Attack Three");

        if(FirstAttack != null){
            AttackOne.add("Attack One: " + FirstAttack);
        }
        if(SecondAttack != null){
            AttackTwo.add("Attack Two: " + SecondAttack);
        }
        if(ThirdAttack != null){
            AttackThree.add("Attack Three: " + ThirdAttack);
        }

        document.add(AttackOne);
        document.add(AttackTwo);
        document.add(AttackThree);

    }

    private void addTitle() throws DocumentException {
        Paragraph preface = new Paragraph();

        Paragraph HP = new Paragraph();
        Paragraph AC = new Paragraph();

        HP.setAlignment(Element.ALIGN_CENTER);
        AC.setAlignment(Element.ALIGN_CENTER);
        preface.setAlignment(Element.ALIGN_CENTER);

        preface.setFont(catFont);
        AC.setFont(catFont);
        HP.setFont(catFont);

        String MonsterName = Totalinfo.monsterInfo.get("Monster Name");
        String TotalHP = Totalinfo.monsterInfo.get("HP");
        String TotalAC = Totalinfo.monsterInfo.get("AC");

        preface.add(MonsterName);
        AC.add("AC: " + TotalAC);
        HP.add("HP: " + TotalHP);


        document.add(preface);
        document.add(new Paragraph("\n\n"));
        document.add(HP);
        document.add(AC);
    }

    private void addStats() throws DocumentException{
        Paragraph preface = new Paragraph();
        preface.setAlignment(Element.ALIGN_LEFT);

        String strmodifier = Totalinfo.monsterInfo.get("Str");
        String dexmodifier = Totalinfo.monsterInfo.get("Dex");
        String wismodifier = Totalinfo.monsterInfo.get("Wis");
        String conmodifier = Totalinfo.monsterInfo.get("Con");
        String intmodifier = Totalinfo.monsterInfo.get("Int");
        String charmodifier = Totalinfo.monsterInfo.get("Char");

        Paragraph str = new Paragraph("Str: " + strmodifier);
        Paragraph dex = new Paragraph("Dex: " + dexmodifier);
        Paragraph wis = new Paragraph("Wis: " + wismodifier);
        Paragraph con = new Paragraph("Con: " + conmodifier);
        Paragraph intmod = new Paragraph("Int: " + intmodifier);
        Paragraph charmod = new Paragraph("Char: " + charmodifier);

        str.setFont(catFont);
        dex.setFont(catFont);
        wis.setFont(catFont);
        con.setFont(catFont);
        intmod.setFont(catFont);
        charmod.setFont(catFont);



        document.add(str);
        document.add(dex);
        document.add(wis);
        document.add(con);
        document.add(intmod);
        document.add(charmod);
        document.add(preface);

    }

    public void addBasics(){
        document.addTitle("Total Monster");
        document.addSubject("Using iText");
        document.addKeywords("Java, PDF, iText");
    }

}
