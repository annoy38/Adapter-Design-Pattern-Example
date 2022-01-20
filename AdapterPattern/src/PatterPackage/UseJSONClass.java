package PatterPackage;

public class UseJSONClass implements IXMLFormatClass{

	ShowDataInJSONFormatClass jformat;
	UseJSONClass(String format){
		jformat = new ShowDataInJSONFormatClass();
	}
	@Override
	public void XMLData(String fileName, String format) {
		// TODO Auto-generated method stub
		jformat.JSONData(fileName, format);
		
	}

}
