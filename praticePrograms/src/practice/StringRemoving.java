package practice;

public class StringRemoving {
	public static void main(String[] args) {
		String value = "00530000005DikUAAS,00530000006OfdMAAS,00530000005ABgYAAW,00530000005C6FDAA0,00590000000kZRuAAM,00530000005ABfzAAG";
		String valueToExclude = "00530000005ABgYAAW";
		String finalValue = "";
		for(String chunk : value.split(",")){
			System.out.println("chunk: "+chunk+" valueToExclude: "+valueToExclude);
			if(!chunk.equals(valueToExclude)){
				finalValue += (finalValue.trim().length()>0?",":"")+chunk;
			}
		}
		System.out.println("final value : "+ finalValue);
	}
}
