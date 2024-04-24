package Tema6.XML.Ejercicio1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.sql.SQLOutput;

public class ejercicio1 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse("./prueba/src/Tema6/XML/Ejercicio1/web1.html");

            Element raiz = doc.getDocumentElement();

            Element titulo = (Element) raiz.getElementsByTagName("title").item(0);
            System.out.println(titulo.getTextContent());

            System.out.printf("En la página hay %d divisores\n", raiz.getElementsByTagName("div").getLength());

            NodeList divValores = doc.getElementsByTagName("div");
            int contDivValeres = 0;
            for (int i = 0; i < divValores.getLength(); i++) {
                Element element = (Element) divValores.item(i);
                if (!element.getAttribute("id").isBlank()) {
                    contDivValeres++;
                }
            }
            System.out.println("Numero de div con valoes de pagWeb: " + contDivValeres);

            NodeList divValoresAlt = doc.getElementsByTagName("img");
            for (int i = 0; i < divValoresAlt.getLength(); i++) {
                Element element = (Element) divValoresAlt.item(i);
                if (!element.getAttribute("alt").isBlank()) {
                    System.out.println("El texto es el siguiente :" + element.getAttribute("alt"));
                }
            }

            NodeList todosLosDiv = doc.getElementsByTagName("div");
            for (int i = 0; i < todosLosDiv.getLength(); i++) {
                Element element = (Element) todosLosDiv.item(i);
                if (element.getAttribute("class").equals("noticia")) {
                    String titular = element.getElementsByTagName("h2").item(0).getTextContent();
                    System.out.println("Este es el titular de la noticia: " + titular);
                    String textoALT = ((Element) element.getElementsByTagName("img").item(0)).getAttribute("alt");
                    System.out.println("Este es el texto alternativo de la imagen: " + textoALT);
                }
            }

        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.out.println("Error de lectura o no ha sido encontrado");
        }

    }
}
