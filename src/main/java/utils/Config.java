package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class Config {

    public static Properties loadProperties(String propertyFile)  {
        Properties config = new Properties();
        InputStream input;
        try {
            input = Config.class.getClassLoader().getResourceAsStream(propertyFile);
            config.load(input);
        } catch (Exception e) {
            Log.LOG.info("File not found");
        }
        return config;
    }
}
