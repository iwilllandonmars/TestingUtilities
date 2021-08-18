package FindersandClickers;
import org.yaml.snakeyaml.*;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class YAMLReader {
    private Yaml yam = new Yaml();
    private InputStream r;
    private Map<String,String> hM;
    private String name = null;
    public YAMLReader(String filename) throws FileNotFoundException {
        this.name = filename;
        String userDirectory = System.getProperty("user.dir"); //returns general project directory
        r =new FileInputStream(new File(userDirectory + "\\"+filename));
        hM = yam.load(r);
    }
    public String read(String key) throws Exception {
        String val = hM.get(key);
        if(val == null){
            throw new Exception("The element "+ key +" is not in the yaml "+ this.name);
        }
        return val;
    }

}
