package Tema6.Examen2021;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejerc2 {
    public static void main(String[] args) {
        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document fichero = db.parse(".\\prueba\\src\\Tema6\\Examen2021\\aeropuerto.xml");
            NodeList vuelos = fichero.getElementsByTagName("vuelo");
            Pattern p = Pattern.compile("(\\d)(\\d{2})(\\d{2})(\\{3})");
            for (int i = 0; i < vuelos.getLength(); i++) {
                Element vuelo = (Element) vuelos.item(i);
                String id = vuelo.getElementsByTagName("id").item(0).getTextContent();
                Matcher m = p.matcher(id);

                if (m.matches()) {

                    String continente = m.group(1);
                    String pais = m.group(2);
                    String aerolinea = m.group(3);
                    String codigoVuelo = m.group(4);

                    String nuevoId = aerolinea + codigoVuelo + pais + continente;

                    vuelo.getElementsByTagName("id").item(0).setTextContent(nuevoId);
                    vuelo.removeChild(vuelo.getElementsByTagName("compania").item(0));
                }

            }

            File f = new File(".\\prueba\\src\\Tema6\\Examen2021\\aeropuerto2.xml");
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            t.setOutputProperty(OutputKeys.INDENT, "yes");
            t.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
            StreamResult r = new StreamResult(f);
            DOMSource source = new DOMSource(fichero);
            t.transform(source, r);
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (SAXException e) {
            throw new RuntimeException(e);
        } catch (TransformerConfigurationException e) {
            throw new RuntimeException(e);
        } catch (TransformerException e) {
            throw new RuntimeException(e);
        }
    }
}