package PatterPackage;

public class ShowDataInJSONFormatClass implements IJSONFormatClass{

	@Override
	public void JSONData(String fileName, String Jformat) {
		// TODO Auto-generated method stub
		System.out.println("File Name : "+fileName+", Format: "+Jformat+" format");
		System.out.println("Show company Chart and Diagram data "+Jformat);
	}

}
