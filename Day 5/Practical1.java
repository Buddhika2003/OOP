class Paper{
	int length;
	int width;
	String text;
	
}

class Document{
	String name;
	Paper p;
	
	public static void main(String[] args){
		Document d=new Document();
		System.out.println("Created a Document object d");
		d.name="My first Document";
		System.out.println("Name of the Document d is "+d.name);
		d.p=new Paper();
		//d.p.text="This is the next in the pape rof doocumemt My first Document"
		System.out.println("Size (1*w) of the paper of the document d is "+d.p.length+"*"+d.p.width);
		
		
		Document d2=new Document();
		System.out.println("Create a document object d2");
		d2.name="My second Document";
		System.out.println("Name of the document d2 is "+d2.name);
	}
}
