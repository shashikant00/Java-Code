import java.util.*;
import java.util.Map.*;
class Test1
{
	public static void main(String[] args)
	{
		//WAP to find the Duplicates character in given String?
		
		String s="hello";
		Map<Character,Integer> map=new HashMap<>();
		
		char[] chars=s.toCharArray();
		
		for(char ch :chars)
		{
			if(!map.containsKey(ch))
			{
				map.put(ch,1);
			}else{
				int count=map.get(ch);
				map.put(ch,count+1);
			}
		}
		
		System.out.println(map);
		
	Set<Map.Entry<Character,Integer>> set=map.entrySet();
	for(Map.Entry<Character,Integer> em :set)
	{
		if(em.getValue()>1) {
			System.out.println(em.getKey());
		}
	}
	}
}