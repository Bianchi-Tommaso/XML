package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class XMLSerializza 
{
    public void SerializzaXML(root value) throws IOException
    {
        XmlMapper xmlMapper = new XmlMapper();

        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);

        String xml = xmlMapper.writeValueAsString(value);


        
        System.out.println("Serializzazione: " + xml);

        File XML = new File("src/classe1.xml");
        FileWriter scrivi = new FileWriter(XML);

        if (XML.createNewFile()) 
        {
            System.out.println("File creato: " + XML.getName());

            scrivi.write(xml);

            scrivi.close();
        } 
        else 
        {
            System.out.println("File Già Esistente");           

            scrivi.write(xml);

            scrivi.close();
        }
    }
    
}
