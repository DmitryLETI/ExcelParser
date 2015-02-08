package practice;

import java.util.ArrayList;
import java.util.List;

public class sampleProgram {
	public static void main(String[] args) {
		List<String> oldList = new ArrayList<String>();
		oldList.add("a");
		oldList.add("b");
		oldList.add("c");
		List<String> newList = new ArrayList<String>();
		newList.add("a");
		newList.add("c");
		newList.add("x");
		List<String> removedIds = new ArrayList<String>();
		List<String> addedIds = new ArrayList<String>();
		for(Integer i=0;i<oldList.size();i++){
			String oldId = oldList.get(i);
				Integer j=0;
				while(j<newList.size()){
					String id = newList.get(j);
					if(id == oldId){
						break;
					}
				j++;
				}
				if(j== newList.size()){
					removedIds.add(oldId);
				}
		}
		for(Integer i=0;i<newList.size();i++){
			String newId = newList.get(i);
				Integer j=0;
				while(j<oldList.size()){
					String id = oldList.get(j);
					if(id == newId){
						break;
					}
				j++;
				}
				if(j == oldList.size()){
					addedIds.add(newId);
				}
		}
		System.out.println("removed ids");
		for(String ids : removedIds){
			System.out.println(ids);
		}
		System.out.println("addedIds");
		for(String ids : addedIds){
			System.out.println(ids);
		}
	}
}
