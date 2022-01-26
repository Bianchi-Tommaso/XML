package xml;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONDeserializza 
{
    public void DeserializzaJSON() throws JsonParseException, JsonMappingException, IOException
    {

        ObjectMapper objectMapper = new ObjectMapper();

        File file = new File("src/classe.json");     //Lettura File XML

        
        root value = objectMapper.readValue(file, root.class);     //Lettura Della Root XML


        System.out.println(value.getAnnoDiInizio());        //Stampa Del Contenuto
    }    
}
