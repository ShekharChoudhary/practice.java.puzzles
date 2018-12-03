package yash.online.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeSet;

public class MatchScore {

	public static void main(String[] args) {
		MatchScore score = new MatchScore();
		String [] input = {"Team-2 12:4 Team-1", 
				 "Team-1 44:32 Team-2", 
				 "Team-2 16:27 Team-4", 
				 "Team-3 8:2 Team-1", 
				 "Team-4 50:38 Team-3", 
				 "Team-4 50:50 Team-1", 
				 "Team-4 50:40 Team-1", 
				 "Team-4 40:38 Team-3", 
				 "Team-5 3:0 Team-6"};		
		
		String [] output = score.leagueTable(input);

		for (String string : output) {
			System.out.println(string);
		}
	}
	
	String[] leagueTable(String[] matches) {
	
		HashMap<String,Integer> map = new HashMap<>();
	
		for(int i =0;i<matches.length;i++) {
		
		String input = matches[i];
		String [] eachGame = input.split(":");
         
		String [] firstTeam = eachGame[0].split(" ");
		String [] secondTeam = eachGame[1].split(" ");
		if(Integer.parseInt(firstTeam[1]) > Integer.parseInt(secondTeam[0])) {
			
			if(map.containsKey(firstTeam[0]) && !map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], (map.get(firstTeam[0]))+3);
				map.put(secondTeam[1],0);
			}else if (!map.containsKey(firstTeam[0]) && map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], 3);
			}else if (map.containsKey(firstTeam[0]) && map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], (map.get(firstTeam[0]))+3);
			}else {
			map.put(firstTeam[0], 3);
			map.put(secondTeam[1],0);
			}
		}else if (Integer.parseInt(firstTeam[1]) == Integer.parseInt(secondTeam[0])) {
			
			if(map.containsKey(firstTeam[0]) && !map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], (map.get(firstTeam[0]))+1);
				map.put(secondTeam[1],1);
			}else if(!map.containsKey(firstTeam[0]) && map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], 1);
				map.put(secondTeam[1], (map.get(secondTeam[1]))+1);
			}else if (map.containsKey(firstTeam[0]) && map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], (map.get(firstTeam[0]))+1);
				map.put(secondTeam[1], (map.get(secondTeam[1]))+1);
			}else {
			map.put(firstTeam[0], 1);
			map.put(secondTeam[1],1);
			}
		}else {
			
			if(!map.containsKey(firstTeam[0]) && map.containsKey(secondTeam[1])) {
				map.put(firstTeam[0], 0);
				map.put(secondTeam[1], (map.get(secondTeam[1]))+3);
			}else if (map.containsKey(firstTeam[0]) && !map.containsKey(secondTeam[1])) {
				map.put(secondTeam[1], 3);
			}else if (map.containsKey(firstTeam[0]) && map.containsKey(secondTeam[1])) {
				map.put(secondTeam[1], (map.get(secondTeam[1]))+3);
			}else {
				map.put(firstTeam[0], 0);
			map.put(secondTeam[1],3);
			}
		}
	
		}

		
		StringBuilder output = new StringBuilder();
		String [] outputArr = new String[map.size()];
		
		 Map<String, Integer> outputMap = new LinkedHashMap<>();
	        map.entrySet().stream()
	                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
	                .forEachOrdered(x -> outputMap.put(x.getKey(), x.getValue()));

	        int i =0;
	        for (String string : outputMap.keySet()) {
				outputArr[i] = string +" "+Integer.toString(outputMap.get(string));
				i++;

			}
	    
		return outputArr;
	}
}
