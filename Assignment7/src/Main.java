
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Volume box1 = new Volume();
	        Volume box2 = new Volume(7);
	        Volume box3 = new Volume(2, 3, 4);

	        // Print the volumes
	        System.out.println("Volume of box1: " + box1.volume());
	        System.out.println("Volume of box2: " + box2.volume());
	        System.out.println("Volume of box3: " + box3.volume());
	}

}
