package Classes;

public class Cuboid {

	
	int width;
	int height;
	int depth;
	
	//Application wants all attributes to be manually assigned
	Cuboid(int width, int height, int depth){
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//Application wants depth constant and others manual
	Cuboid(int width, int height){
		this.width = width;
		this.height = height;
		this.depth = 10;
	}
	
	//Application wants all attributes to have the same value
		Cuboid(int dimension){
			this.width = dimension;
			this.height = dimension;
			this.depth = dimension;
		}
		
	//Application doesn't want to supply any values but expects sam value for all properties
	
		Cuboid(){
			this.width = 10;
			this.height = 10;
			this.depth = 10;
		}
		
	int volume() {
		return this.width * this.height * this.depth;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cuboid stdCuboid = new Cuboid(1,2,3);
		System.out.println(stdCuboid.volume());
		
		Cuboid cuboidWithDefault = new Cuboid(2,3);
		System.out.println(cuboidWithDefault.volume());
		
		Cuboid sameDimensionsCuboid = new Cuboid(20);
		System.out.println(sameDimensionsCuboid.volume());
		
		Cuboid defaultCuboid = new Cuboid();
		System.out.println(defaultCuboid.volume());
		
	}

}
