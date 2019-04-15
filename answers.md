# Questions:
1. 
public static String flip(){
	int random = (int) (Math.random() * 2);
	if (random == 0){
		return "tails"; 
	}
	else{
		return "heads";
	}
}

2. 
public static boolean arePermutations(int[] array1, int[] array2){
	for (int i = 0; i < array1.length; i++){
		boolean hasMatch = false;
		for (int j = 0; i < array2.length; j++){
			if (array1[i] == array2[j]){
				hasMatch = true;
			}
		}
	}
	if (hasMatch){
		return true;
	}
	else {
		return false;
	}
}

3. 0, 1, 1