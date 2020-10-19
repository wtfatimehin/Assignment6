
import java.util.*;
import acm.program.*;



public class CountNames  extends ConsoleProgram {
	
	public void run() {
		
		HashMap<String, Integer> mapName =  new HashMap<String, Interger>();
		
		nameReader(mapName);
		mapPrinter(mapName);
	}
	
	
	private void nameReader(Map<String, Integer> map) {
		while(true) {
			String names = readLine("Enter the name: ");
			if(names.equals("")) break; 
				
			Integer counts = map.get(names);
			if(counts == null) {
				counts = new Integer(1);
			} else {
				counts = new Integer(counts + 1);
			}
			
			map.put(names, counts);
		}
	}
	
	
	private void mapPrinter(Map<String, Integer> map ) {
		Iterator<String> iT = map.keySet().iterator();
		
		while(iT.hasNext()) {
			String key = iT.next;
			int counts = map.get(key);
			println("Entry [" + key + "] has count" + counts);
		}
	}
}
