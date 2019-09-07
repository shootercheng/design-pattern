package com.scd.utils;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 * @author chengdu
 */
public class XmlUtil {

    public static String getCharType(String xmlPath) {
        String type = "";
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            File file = new File(xmlPath);
            if(! file.exists() && ! file.isFile()){
                return type;
            }
            Document document = documentBuilder.parse(file);
            NodeList nodeList = document.getElementsByTagName("type");
            Node node = nodeList.item(0).getFirstChild();
            type = node.getNodeValue();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return type;
    }

    public static InputStream getResourceAsStream(String resource){
       return XmlUtil.class.getClassLoader().getResourceAsStream("builder/actorbuildertype.xml");
    }

    public static String getClassType(String resource){
        String type = "";
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        InputStream inputStream = null;
        try {
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            inputStream = getResourceAsStream(resource);
            Document document = documentBuilder.parse(inputStream);
            NodeList nodeList = document.getElementsByTagName("type");
            Node node = nodeList.item(0).getFirstChild();
            type = node.getNodeValue();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (inputStream != null){
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return type;
    }

    public static void main(String[] args){
        String xmlPath = "src\\main\\java\\com\\scd\\factory\\simplefactory\\fac\\chartype.xml";
        System.out.println(getClassType(xmlPath));
    }
}
