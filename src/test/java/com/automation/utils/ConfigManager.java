package com.automation.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {
    static Properties prop;

    public static void initProperties(){
        prop = new Properties();
        try {
            prop.load(new FileInputStream("src/test/resources/Config/config.properties"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static String getTheProperty(String key){
        return prop.getProperty(key);
    }

    public static void setProperty(String key, String value) throws FileNotFoundException {
        prop.setProperty(key, value);
        prop.save(new FileOutputStream("src/test/resources/Config/config.properties"),"Done the edit");
    }
}
