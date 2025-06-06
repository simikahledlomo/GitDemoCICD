package utils;

//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
	private static final String PROPERTIES_FILE = "Feature/config.properties";
    private Properties properties;

    public ConfigReader() {
        properties = new Properties();
        loadProperties();
    }

    private void loadProperties() {
        try (InputStream input = getClass().getClassLoader().getResourceAsStream(PROPERTIES_FILE)) {
            if (input == null) {
                throw new RuntimeException("Unable to find " + PROPERTIES_FILE + 
                    ". Make sure the file exists in the resources folder.");
            }
            properties.load(input);
        } catch (IOException e) {
            throw new RuntimeException("Error loading properties file", e);
        }
    }

    public String getBrowser() {
        String browser = properties.getProperty("browser");
        if (browser == null) {
            throw new RuntimeException("'browser' property not found in " + PROPERTIES_FILE);
        }
        return browser.trim().toLowerCase();
    }

    public String getBaseUrl() {
        String url = properties.getProperty("baseUrl");
        if (url == null || url.trim().isEmpty()) {
            throw new RuntimeException("baseUrl not specified in " + PROPERTIES_FILE);
        }
        return url.trim();
    }
}