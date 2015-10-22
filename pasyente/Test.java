class Test {
	public static void main (String[] args) {
		
		Sorting sort = new Sorting(3);
		sort.getValue(0,"Jessa", "Caudilla", 16, "Camaines Sur");
		sort.getValue(1,"Xyleeh", "Balbuena", 20, "Southern Leyte");
		sort.getValue(2,"Gielyn", "Baloloy", 17, "Angono, Rizal");

		System.out.println("\n**** ORIGINAL ****");
		sort.display();

		System.out.println("\n **** Sorted By AGE ****");
		sort.bubbleSort();
		sort.display();
	}
}

