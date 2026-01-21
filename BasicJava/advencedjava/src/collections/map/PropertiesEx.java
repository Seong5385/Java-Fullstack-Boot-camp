package collections.map;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.util.Properties;

public class PropertiesEx {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try (BufferedReader br = new BufferedReader(new InputStreamReader(
                new FileInputStream("BasicJava\\advencedjava\\src\\map\\config.properties")))) {

            properties.load(br);
            System.out.println(properties);

            properties.put("subject", "AI");
            System.out.println(properties);

            properties.store(new FileOutputStream("BasicJava\\advencedjava\\src\\map\\config.properties"),
                    "#save\n" + new Date(0));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
