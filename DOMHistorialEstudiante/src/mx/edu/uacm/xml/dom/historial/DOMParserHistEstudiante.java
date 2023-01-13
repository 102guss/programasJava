package mx.edu.uacm.xml.dom.historial;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import mx.edu.uacm.xml.dom.historial.bean.EstudianteBean;

public class DOMParserHistEstudiante {
	
	public static void main (String[] args ) throws ParserConfigurationException, SAXException, IOException {
		
		System.out.println(" Inicio DOM parser");
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = factory.newDocumentBuilder(); 
			
		Document document = documentBuilder.parse(
				ClassLoader.getSystemResourceAsStream("xml/Historial.xml"));
		
		System.out.println(" Document parsed");
	
		//////////////////////////////////////////
		
		NodeList estudianteList = document.getElementsByTagName("estudiante");//...
		
		Node estudianteNodo = estudianteList.item(0);
		
		NodeList listChildEstidiante =  estudianteNodo.getChildNodes();
		
	
		System.out.println( listChildEstidiante.getLength() );
		//...//
		
		EstudianteBean estudianteBean = new EstudianteBean();		
		
		System.out.println( estudianteBean);
		
		
		for(int idx = 0;  idx < listChildEstidiante.getLength(); idx ++ ) {
			
			Node node = listChildEstidiante.item(idx);

			if ( node instanceof Element ) {//..
		         System.out.println( node.getNodeName());
				if (  node.getNodeName().equals( "ciclos")  ){
					
					  NodeList hijoCiclosList  = node.getChildNodes();
					  
					  for ( int idx_ciclo  =0; idx_ciclo < hijoCiclosList.getLength(); idx_ciclo++) {
						  
						  Node tmp_ciclo = hijoCiclosList.item(idx_ciclo);
						  
						  if (  tmp_ciclo instanceof Element && 
								  (tmp_ciclo.getNodeName().equals("cicloBasico") ||
								   tmp_ciclo.getNodeName().equals("cicloSuperior"))
								  
								
								  ) {
							  System.out.println(" \t" + tmp_ciclo.getNodeName() + " : " + tmp_ciclo.getTextContent());
							  procesaMaterias ( tmp_ciclo );
							  
						  }
					  }
					  									
				} else { 
					estudianteBean.setInfo( node );
				} 				
			}
		}
		
		System.out.println( estudianteBean );
	
		
	}

	
	
	
	static void procesaMaterias ( Node nodoCiclo  ) {
		
		NodeList materiasList = nodoCiclo.getChildNodes();
		
		for (int idx=0; idx < materiasList.getLength() ; idx++)
		
			System.out.println( "Materias: " + materiasList.item(idx).getNodeName());
		
		
		Node materiasNode = materiasList.item(0);
		
		NodeList materiasChildList = materiasNode.getChildNodes(); 
	
		for (int i = 0; i < materiasChildList.getLength() ; i++) {
		
			Node node = materiasChildList.item(i);
					
			if ( node instanceof Element ) { 
				
				if (  node.getNodeName().equals("materia")) {
					
					Node noteTemp = materiasList.item(0);
					
					NodeList materiaInfoList = noteTemp.getChildNodes();
					
				
					if ( materiaInfoList.item(0) instanceof Element ) {
						System.out.println("Materia:" + materiaInfoList.item(0).getNodeName()  );
					}
				}
				
				
			}
		}
		
	}
	
}
