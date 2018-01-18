package test;

public class Main {

	public static void main(String[] args) throws Exception {
		MyList myList = new MyList();
		myList.add_element(1);
		myList.add_element(2);
		myList.add_element(3);
		myList.add_element(4);
		myList.print_list();
		myList.remove_last_item();
		myList.print_list();
		myList.remove_last_item();
		myList.remove_last_item();
		myList.remove_last_item();
		myList.remove_last_item();
		myList.print_list();
		myList.add_element(1);
		myList.add_element(2);
		myList.add_element(3);
		myList.add_element(4);
		myList.add_element(5);
		myList.add_element(6);
		myList.add_element(7);
		myList.add_element(8);
		myList.print_list();
		myList.remove_all();
		myList.print_list();
	}

}
