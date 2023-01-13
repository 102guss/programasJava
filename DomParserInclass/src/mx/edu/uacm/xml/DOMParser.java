package mx.edu.uacm.xml;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class DOMParser {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {

		System.out.println(" Inicio DOM parser");
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder(); 
			
		Document document = documentBuilder.parse(
				ClassLoader.getSystemResourceAsStream("xml/Patient.xml"));
		
		System.out.println(" Document parsed");

		
		NodeList nameList = document.getElementsByTagName("name");
		Node nameItem = nameList.item(0);
		System.out.println(" Nombre: " + nameItem.getTextContent() );
		
		NodeList emailList = document.getElementsByTagName("email");
		Node emailItem = emailList.item(0);
		System.out.println(" Email: " + emailItem.getTextContent() );
		
		NodeList phoneList = document.getElementsByTagName("phone");
		
		Node phoneItem1 = phoneList.item(0);
		Node phoneItem2 = phoneList.item(1);
		
		System.out.println(" Phone 1: " + phoneItem1.getTextContent() );
		System.out.println(" Phone 2: " + phoneItem2.getTextContent() );
		
		
		NodeList seguroList = document.getElementsByTagName("seguro");
		
		
		Node seguroNode = seguroList.item(0);
		
		NodeList seguroChildList = seguroNode.getChildNodes();
		
		System.out.println("Longitud Nodo seguro: " + seguroChildList.getLength());
		
		
		for(int i =0; i < seguroChildList.getLength(); i++) {
			
			Node item = seguroChildList.item(i);
			
			if ( item instanceof Element ) {
				
				String nodeName = item.getNodeName(); 
				
				switch ( nodeName ) {
					
					case "publico":
							System.out.println("\tSeguro publico");
							
							NodeList seguroPublicoChilds = item.getChildNodes();
							
							
							for (int j=0; j < seguroPublicoChilds.getLength(); j++ ) {
									Node itemPrivate = seguroPublicoChilds.item( j );
								
									
										System.out.println(" \t" + itemPrivate.getNodeName() 
														 + " : " + itemPrivate.getTextContent());
									
							}

						break;
						
					default:
				
						break;
				}
			}
		}
		
		
		//LECTURA DE ATRIBUTOS
		Element documentElement = document.getDocumentElement();
		String Id = documentElement.getAttribute("Id");
		
		System.out.println("Attribute Id: "  + Id);
	
	}

}

