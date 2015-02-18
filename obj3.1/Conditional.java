class Conditional {
	public static void main(String[] args) {
		int sizeOfYards = 10;
		int numOfPets = 3;
		String status = (numOfPets < 2) ? "Pet count OK" 
						: (sizeOfYards < 8) ? "Pet Limit On the Age"
						: "too many pets";
		System.out.println("Pet status is " + status); //too many pets
	}
}