package xml;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Deserializza 
{
    public void ReadFileAndPrint() throws JsonParseException, JsonMappingException, IOException
    {
        

        XmlMapper xmlMapper = new XmlMapper();

        File file = new File("src/classe.xml");

        
        root value = xmlMapper.readValue(file, root.class);


        System.out.println(toString(value));
        
    }

    public String toString(root value)
    {
        String s = "La Classe " + value.getClasse() + " " + value.getSpecializzazione() + 
                   " Si Trova Nell'aula " + value.getAula().getNome() + " Ed è Composta Dai Seguenti Studenti: \n";

                   for(int i = 0; i < value.getStudenti().size(); i++)
                        s += value.getStudenti().get(i).getCognome() + " ";

        return s;
    }
}
