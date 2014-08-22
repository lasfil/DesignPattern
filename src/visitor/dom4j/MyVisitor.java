package visitor.dom4j;

import org.dom4j.Attribute;
import org.dom4j.Element;
import org.dom4j.VisitorSupport;

public class MyVisitor extends VisitorSupport {

    public void visit(Attribute node){
      System.out.println("属性 : "+node.getName()+" = "+node.getValue());
    }

    public void visit(Element node){
      if(node.isTextOnly()){
        System.out.println("节点: "+node.getName()+" = "+node.getText());
      }else{
        System.out.println("节点："+node.getName());
      }
    }
}