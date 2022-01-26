package xml;

import java.io.IOException;

import javax.xml.transform.TransformerConfigurationException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public final class Main 
{
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException, TransformerConfigurationException 
    {
        XMLDeserializza xml = new XMLDeserializza();    //Oggetto XML Deserializza
        XMLSerializza xml1 = new XMLSerializza();       //Oggetto XML Serializza
        JSONSerializza json = new JSONSerializza();     //Oggetto JSON Serializza
        JSONDeserializza json1 = new JSONDeserializza();

        root value; //Valore root

        value = xml.DeserializzaXML(); //Richiamo Del Metodo      

        xml1.SerializzaXML(value);     //Richiamo Del Metodo         

        json.SerializzaJSON(value);     //Richiamo Del Metodo    

        json1.DeserializzaJSON();
    }
}
