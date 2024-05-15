package Tema6.Examen2021;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.w3c.dom.*;


import java.util.HashSet;
import java.util.Set;

public class ejerc3 {
    private static Document doc;

    public static void main(String[] args) throws XmlException {
        String rutaXml = "./src/aeropuerto.xml";
        try {
            doc = AyudasXml.parsearRuta(rutaXml);
        } catch (XmlException e) {
            throw new RuntimeException(e);
        }

        if (doc == null) {
            System.out.println("No se ha podido parsear la ruta del documento");
        } else {
            nombresAerolineasXml();
        }
    }

    private static void nombresAerolineasXml() throws XmlException {
        String outRuta = "./src/Ejer3/aerolineas.xml";
        Document newDoc = null;
        try {
            newDoc = AyudasXml.crearDocumento();
        } catch (XmlException e) {
            throw new RuntimeException(e);
        }
        if (newDoc == null) {
            System.out.println("No se ha podido crear el documento");
            return;
        }
        newDoc.appendChild(newDoc.createElement("compañias"));

        Set<String> nombresCompanias = new HashSet<>();
        NodeList companias = doc.getElementsByTagName("compania");
        for (int i = 0; i < companias.getLength(); i++) {
            /*String compania = companias.item(i).getTextContent();
            if (haveCompania(newDoc, compania)) continue;

            Node c = newDoc.createElement("compania");
            Attr a = newDoc.createAttribute("nombre");
            a.setValue(compania);
            newDoc.appendChild(c.appendChild(a));*/

            nombresCompanias.add(companias.item(i).getTextContent());
        }

        for (String compania : nombresCompanias) {
            Element c = newDoc.createElement("compañia");
            c.setAttribute("nombre", compania);
            newDoc.getDocumentElement().appendChild(c);
        }

        if (AyudasXml.guardarDocumento(newDoc, outRuta)) {
            System.out.println("Se ha guardado el documento correctamente");
        } else {
            System.out.println("Se ha producido un error");
        }
    }

    private static boolean haveCompania(Document doc, String compania) {
        NodeList companias = doc.getElementsByTagName("compañia");
        for (int i = 0; i < companias.getLength(); i++) {
            if (companias.item(i).getTextContent().equals(compania)) return true;
        }
        return false;
    }
}