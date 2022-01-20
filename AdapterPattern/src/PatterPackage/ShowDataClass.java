package PatterPackage;

public class ShowDataClass implements IXMLFormatClass{

	UseJSONClass json_format; 
	@Override
	public void XMLData(String fileName, String format) {
		// TODO Auto-generated method stub
		if(format.equals(".xml")) {
		System.out.println("File Name : "+fileName+", Format: "+format+" format");
		System.out.println("Show Company Chart And Diagram Data "+format);
	}
	else if (format.equals(".json")) {
		json_format = new UseJSONClass(format);
		json_format.XMLData(fileName, format);
	}
		
		
	}
	
}
