package xml;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONSerializza 
{
    public void SerializzaJSON(root value) throws IOException
    {
        ObjectMapper objectMapper = new ObjectMapper();
        
        System.out.println(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value));

        File JSON = new File("src/classe.json");
        FileWriter scrivi = new FileWriter(JSON);

        if (JSON.createNewFile()) 
        {
            System.out.println("File creato: " + JSON.getName());

            scrivi.write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value));

            scrivi.close();
        } 
        else 
        {
            System.out.println("File Già Esistente");            

            scrivi.write(objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(value));

            scrivi.close();
        }
    }
}
