
public class IteratorPatternMain {

	public static void main(String[] args) {
NameRepository namesRepository=new NameRepository();
for(Iterator iter=namesRepository.getInterator();iter.hasNext();) {
	String name=(String)iter.next();
	System.out.println("name:"+name);
}

		
	}
	
	
}
interface Iterator{
	
	public boolean	hasNext();
	public Object next();
		
}
interface Container{
	
	public Iterator getInterator();
	}


 class NameRepository implements Container{
	 
	 public String names[]= {"Robert","John","Julie","Lora"};
	 
	 @Override
	public Iterator getInterator() {
		// TODO Auto-generated method stub
		return new NameIterator();

	 
	 }
	 
	 
	 private class NameIterator implements Iterator{
		 
		 int index;
		 
		 public boolean hasNext() {
			 
			 if(index<names.length) {
				 return true;
			 }
			 return false;
			 	}
	public Object next() {
		if(this.hasNext()) {
		return names[index++];
		}
			return null;
	
	}

	 }
	 
 }
 
 





