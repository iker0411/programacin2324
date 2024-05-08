package Tema6.Examen2021;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejerc4 {
    public static void main(String[] args) throws TransformerConfigurationException {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document fichero = db.parse(".\\prueba\\src\\Tema6\\Examen2021\\aeropuerto.xml");
            NodeList companias = fichero.getElementsByTagName("compania");
            Document doc2 = db.newDocument();

            doc2.appendChild(doc2.createElement("compañias"));
            Set<String> nombreCampanias = new HashSet<>();

            for (int i = 0; i < companias.getLength(); i++) {
                String compania = companias.item(i).getTextContent();
                nombreCampanias.add(compania);
            }

            nombreCampanias.stream().forEach(compania -> {
                Element nuevaCompania = doc2.createElement("Compañia");
                nuevaCompania.setAttribute("nombre", compania);
                doc2.getDocumentElement().appendChild(nuevaCompania);
            });


            File f = new File(".\\prueba\\src\\Tema6\\Examen2021\\compañia.xml");
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StreamResult r = new StreamResult(f);
            DOMSource source = new DOMSource(doc2);
            t.transform(source, r);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } ;
    }
}

