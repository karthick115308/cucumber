package managers;

import java.io.IOException;

import dataProvider.ConfigFileReader;

public class FileReaderManager {
	private static FileReaderManager filereadermanager = new FileReaderManager();
	ConfigFileReader configfilereader;
	
	private FileReaderManager()
	{
		
	}

	public static FileReaderManager getInstance()
	{
		return filereadermanager;
	}
	public ConfigFileReader getConfigReader() throws IOException
	{
		return (configfilereader == null)? new ConfigFileReader(): configfilereader;
	}
}
