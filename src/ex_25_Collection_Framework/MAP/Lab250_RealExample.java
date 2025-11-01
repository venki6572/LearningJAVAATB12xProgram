package ex_25_Collection_Framework.MAP;

import java.util.HashMap;
import java.util.Map;

public class Lab250_RealExample {
    public static void main(String[] args){

        //storig environment specific configuratios
        Map<String,String> envConfig = new HashMap<>();
        envConfig.put("production","https://prod.api.com");
        envConfig.put("staging","https://stag.api.com");

        //managing credentials
        Map<String,String> credentials = new HashMap<>();
        envConfig.put("admin","admin123");
        envConfig.put("user","user123");
    }
}
