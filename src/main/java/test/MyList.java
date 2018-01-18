package test;

public class MyList implements MyListI{
	int values[];

	@Override
	public void add_element(int value) {
		if(values == null || values.length == 0){
			values = new int[1];
			values[0] = value;
			return;
		}
		if(values.length > 0){
			int cloned_list[] = values.clone();
			values = new int[cloned_list.length+1];
			int i;
			for(i = 0; i < cloned_list.length; i++){
				values[i] = cloned_list[i];
			}
			values[i] = value;
		}
	}

	@Override
	public void remove_last_item() {
		if(values.length > 0){
			int cloned_list[] = values.clone();
			values = new int[cloned_list.length-1];
			for(int i = 0; i < cloned_list.length-1; i++){
				values[i] = cloned_list[i];
			}
		}
	}

	@Override
	public void remove_all() {
		values = null;
	}
	
	public void print_list(){
		if(values == null || values.length == 0){
			System.out.println("list is empty");
			return;
		}
		for(int i = 0; i < values.length; i++){
			System.out.print(values[i]);
			if(i < values.length-1)
				System.out.print(",");
		}
		System.out.println();
		System.out.println("Done.");
	}
}
