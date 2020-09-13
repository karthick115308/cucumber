package dataProvider;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;


public class ConfigFileReader {
	private Properties properties;
	 private final String propertyFilePath= "Config\\congi.properties";
	 public ConfigFileReader() throws IOException
	 {
		 BufferedReader reader;
		 try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
			properties.load(reader);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		 
	 }
	 public String getbrowser()
	 {
		 String driver = properties.getProperty("browser");
		 return driver;
		 
	 }
	 public String getdriverPath()
	 {
		String driverpath = properties.getProperty("driverPath");
		 return(driverpath!=null ?driverpath:"Driver path not available");
	 }
	 public String getApplicationUrl() {
		 String url = properties.getProperty("url");
		 if(url != null) return url;
		 else throw new RuntimeException("url not specified in the Configuration.properties file.");
		 }

public String getReportConfigPath(){
 String reportConfigPath = properties.getProperty("reportConfigPath");
 if(reportConfigPath!= null) return reportConfigPath;
 else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath"); 
}

}
