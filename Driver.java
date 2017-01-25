
public class Driver {

	public static void main(String[] args) {
		
		LinkedList lst = new LinkedList();
		Person p = new Person("John","12012017","ab49786");
		Person pOne = new Person("Dave","23012017","bv452268");
		Person pTwo = new Person ("Boab","15012017","bn5748392");
		lst.addFirst(p);
		lst.addElement(pOne);
		lst.addElement(pTwo);
		
		
		Person temp = (Person) lst.getFirst();
		System.out.print(lst.iterator());
		
		System.out.println("His name is: " + temp.name +" "+"His Date of Birth is: " +  temp.dob + " "+
				"His national Insurance number is: " + temp.niNum);
		

	}

}
