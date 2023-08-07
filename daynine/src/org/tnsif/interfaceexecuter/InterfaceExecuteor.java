//driver class
package org.tnsif.interfaceexecuter;

public class InterfaceExecuteor {

	public static void main(String[] args) {
		//Sony s=new Sony(); we can't instantiate an interface
		SonyTv s=new SonyTv();
		s.display();
		s.show();
		Sony.accept();
		
		ISRO i=new ISRO();
		i.status();
		
		Human h=new Human();
		h.show();

	}

}
