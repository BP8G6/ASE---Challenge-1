package com.example.estore;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import android.R.string;



public class XMLParser {
	
	/*String userselectedstate=null;
	String userselectedcity = null;
	
	String finalurl = "www.supermarketapi.com/api.asmx/StoresByCityState?APIKEY=APIKEY&SelectedCity="+userselectedstate+"&SelectedState="+userselectedcity;
	
	
	
	XMLParser obj = new XMLParser();
	//obj.getStringFromURL();
	obj.parseData("");
	*/
	public String getStringFromURL(String urlstring)
	{
		String data=null;
		URL url=null;
		StringBuffer bufferData = new StringBuffer();
		try
		{
			
	 url =  new URL(urlstring);
	 URLConnection conn =  url.openConnection();
	 BufferedReader in = new BufferedReader( new  InputStreamReader(conn.getInputStream()));
	 
	 while((data = in.readLine())!= null) {
		 bufferData.append(data);
	 }
	 	in.close();
		}
		catch(Exception e)
		{
			
		}
		return bufferData.toString();
		
	}
	
	
	public void parseData(String url) {
		
		String xmltag=null;
		
		Document document = null;
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		
		try {
			DocumentBuilder db = dbf.newDocumentBuilder();
			InputSource is = new InputSource();
			is.setCharacterStream(new StringReader(getStringFromURL(url)));
			document = db.parse(is);
			document.getDocumentElement().normalize();
			NodeList tagList = document.getElementsByTagName(xmltag);
			
/*for (int temp = 0; temp < tagList.getLength(); temp++) {
				
				Node nNode = tagList.item(temp);
				NodeList childNodeList = nNode.getChildNodes();	
				StoreStates obj = new StoreStates();
				for (int i = 0; i < childNodeList.getLength(); i++) {
					if (childNodeList.item(i).getNodeType() == Node.ELEMENT_NODE) {
						Node eElement = (Node) childNodeList.item(i);					
						obj.setState(eElement.getTextContent());
						
					}
				}
	//store each ibj to array*/
//}
			
		}
		catch (Exception e) {
			
		}
		
	}
	}
