package com.xml2html;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import java.io.File;

public class Xml2Html_Tranceformer {

    public static void main(String[] args){
         String xslFile="src/main/com/xml2html/studentXml2Html.xsl";
         String input_Xml_file = "src/main/com/xml2html/students.xml";
         String output_html = "src/main/com/xml2html/Student.html";

        StreamSource xslcode  = new StreamSource(new File(xslFile));
        StreamSource input = new StreamSource(new File(input_Xml_file));
        StreamResult output = new StreamResult(new File(output_html));

        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer trans;
        try {
            trans = tf.newTransformer(xslcode);
            trans.transform(input, output);
        } catch (TransformerConfigurationException e) {
            // TODO: handle exception
            e.printStackTrace();
        } catch (TransformerException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
