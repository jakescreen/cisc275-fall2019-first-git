public class AnimalCompare implements Comparator<Animal>{
	
	public int compare(Animal ani1, Animal ani2){
		int res = (ani1.name).compareToIgnoreCase(ani2.name);
		if(res == 0){
			res = ani1.legs - ani2.legs;
		}
		return res;
}
}
