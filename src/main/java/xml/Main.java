package xml;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

public final class Main 
{
    public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException 
    {
        Deserializza xml = new Deserializza();

        xml.ReadFileAndPrint(); //Richiamo Del Metodo
    }
}
