import static java.lang.System.out;
import java.util.ArrayList;
import java.util.Collections;
class ArList{
	public static void main(String ar[]){
		ArrayList list = new ArrayList();
		//we can story any type of data in list, 
		//coz we have not restricted its type
		list.add("abc");
		list.add(123);
		list.add('b');
		list.add(33.4543);
		list.add(45.2);
		list.add(4.5f);
		out.println(list);
		out.println("Size of list is : "+list.size());
		
		//to restrict the type we use generic tag
		//Ex of list with only integers
		ArrayList <Integer> list1 = new ArrayList <Integer>();
		list1.add(6767);
		list1.add(2222);
		list1.add(4433);
		list1.add(1111);
		list1.add(56563);
		out.println(list1);
		out.println("Size of list1 is : "+list1.size());
		//since its dynamic array so we can't sort directly with sort()
		//we need to use sort method of collections class
		Collections.sort(list1);
		//we use get() method to get the elements of list
		for(int i=0;i<list1.size();i++){
			out.println(list1.get(i));
		}
				//OR
		for(int data : list1){
			out.println(data);
		}
				//OR lemda expression
		list1.forEach(data->System.out.println(data));
	}
}