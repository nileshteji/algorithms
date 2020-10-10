import java.util.HashMap;
import java.util.Map;

class Sol{
	public static void main(String[] args) {
		int[] array ={4,8,8,8,6,4};
		// 3 6    4  8 /8 6 4 
		int k=3;
		Map<Integer,Integer> map=new HashMap<>();
		for (int i :array){
			if(map.get(i)!=null){
				map.put(i,map.get(i)+1);
			}
			else{
				map.put(i, 1);
			}
		}

		boolean ans=true;

		if(array.length%k!=0){
			ans=false;
		}
		else{

	  for(Map.Entry<Integer,Integer> entry: map.entrySet()){
		  
		  if(entry.getValue()!=1 && entry.getValue()>array.length/k){
			  ans=false;
		  }
	  }
	}

		System.out.println((ans)?"Yes":"No");

	}
}