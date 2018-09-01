package testJdom;

import java.util.*;
import org.jdom.*;
import org.jdom.input.SAXBuilder;
/**
 * 使用的是jdom方式,dom4j功能更强。
 * @author Yhh
 */
public class TestJdom {
	
  public static void main(String[] args) throws Exception{ 
	  
    SAXBuilder sb = new SAXBuilder();
    //构造文档对象
    Document doc = sb.build(TestJdom.class.getClassLoader().getResourceAsStream("beans.xml"));
    
    Element root = doc.getRootElement(); //获取根元素HD
    List list = root.getChildren("bean");//取名字为disk的所有元素
    for(int i=0; i<list.size(); i++){
       Element element = (Element)list.get(i);
       String id = element.getAttributeValue("id");
       String clazz = element.getAttributeValue("class");
       System.out.println(id);
       System.out.println(clazz);
       
       /*
       String name = element.getAttributeValue("name");
       String capacity=element.getChildText("capacity");//取disk子元素capacity的内容
       String directories=element.getChildText("directories");
       String files=element.getChildText("files");
       System.out.println("磁盘信息:");
       System.out.println("分区盘符:"+name);
       System.out.println("分区容量:"+capacity);
       System.out.println("目录数:"+directories);
       System.out.println("文件数:"+files);
       System.out.println("-----------------------------------");
       */
    } 
    
  }
} 