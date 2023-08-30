/*package com.abc;
import java.util.HashMap;
import java.util.Map;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer,String> m= new HashMap<Integer,String>();
		m.put(10,"java");
		m.put(20,"sql");
		m.put(30,"oops");
		m.put(40,"sql");
		m.put(50,"oracle");
		m.put(60,"DB");
		m.put(10,"selenium");
		m.put(50,"psql");
		m.put(40,"Hadoop");
		System.out.println(m);
	}
}
*/

/*package com.abc;
import java.util.LinkedHashMap;
import java.util.Map;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		System.out.println(m);
	}
}
*/

/*package com.abc;
import java.util.TreeMap;
import java.util.Map;

public class Day9Map {
	public static void main(String[]args) {
		Map <Character,Integer> m= new TreeMap<Character,Integer>();
		m.put('!',10);
		m.put('@',20);
		m.put('#',30);
		m.put('$',40);
		m.put('%',50);
		m.put('^',60);
		m.put('&',10);
		m.put('*',50);
		m.put('(',40);
		System.out.println(m);
	}
}

*/
/*package com.abc;
import java.util.Hashtable;
import java.util.Map;

public class Day9Map {
	public static void main(String[] args) {
		Map <String, String> m= new Hashtable<String, String>();		
		m.put("vel","Selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("vengat","corejava");
		m.put("Subash","jira");
		System.out.println(m);
	}
}
		
*/

/*package com.abc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		Set<Entry<Integer, String>> g = m.entrySet();
		for (Entry<Integer, String> a : g) {
			System.out.println("Key :" + a.getKey());
		}
	}
}

*/

/*package com.abc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		Set<Entry<Integer, Integer>> g = m.entrySet();
		for (Entry<Integer, Integer> a : g) {
			System.out.println("Key :" + a.getKey());
		}
	}
}

*/

/*package com.abc;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[]args) {
		Map <Character,Integer> m= new TreeMap<Character,Integer>();
		m.put('!',10);
		m.put('@',20);
		m.put('#',30);
		m.put('$',40);
		m.put('%',50);
		m.put('^',60);
		m.put('&',10);
		m.put('*',50);
		m.put('(',409);
		Set<Entry<Character,Integer>> g = m.entrySet();
		for (Entry<Character,Integer> a : g) {
			System.out.println("Key :" + a.getKey());
		}
	}
}

*/
/*package com.abc;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map <String, String> m= new Hashtable<String, String>();		
		m.put("vel","Selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("vengat","corejava");
		m.put("Subash","jira");
		Set<Entry<String, String>> g = m.entrySet();
		for (Entry<String, String> a : g) {
			System.out.println("Key :" + a.getKey());
		}
	}
}

*/

/*package com.abc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		Set<Entry<Integer, String>> g = m.entrySet();
		for (Entry<Integer, String> a : g) {
			System.out.println("Value :" + a.getValue());
		}
	}
}

*/

/*package com.abc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		Set<Entry<Integer, Integer>> g = m.entrySet();
		for (Entry<Integer, Integer> a : g) {
			System.out.println("Value :" + a.getValue());
		}
	}
}

*/

/*package com.abc;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[]args) {
		Map <Character,Integer> m= new TreeMap<Character,Integer>();
		m.put('!',10);
		m.put('@',20);
		m.put('#',30);
		m.put('$',40);
		m.put('%',50);
		m.put('^',60);
		m.put('&',10);
		m.put('*',50);
		m.put('(',409);
		Set<Entry<Character,Integer>> g = m.entrySet();
		for (Entry<Character,Integer> a : g) {
			System.out.println("Value :" + a.getValue());
		}
	}
}

*/

/*package com.abc;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map <String, String> m= new Hashtable<String, String>();		
		m.put("vel","Selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("vengat","corejava");
		m.put("Subash","jira");
		Set<Entry<String, String>> g = m.entrySet();
		for (Entry<String, String> a : g) {
			System.out.println("Value :" + a.getValue());
		}
	}
}

*/

/*package com.abc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		Set<Entry<Integer, String>> g = m.entrySet();
		for (Entry<Integer, String> a : g) {
			System.out.println(a);
		}
	}
}

*/

/*package com.abc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		Set<Entry<Integer, Integer>> g = m.entrySet();
		for (Entry<Integer, Integer> a : g) {
			System.out.println(a);
		}
	}
}

*/

/*package com.abc;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[]args) {
		Map <Character,Integer> m= new TreeMap<Character,Integer>();
		m.put('!',10);
		m.put('@',20);
		m.put('#',30);
		m.put('$',40);
		m.put('%',50);
		m.put('^',60);
		m.put('&',10);
		m.put('*',50);
		m.put('(',409);
		Set<Entry<Character,Integer>> g = m.entrySet();
		for (Entry<Character,Integer> a : g) {
			System.out.println(a);
		}
	}
}

*/
		
/*package com.abc;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map <String, String> m= new Hashtable<String, String>();		
		m.put("vel","Selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("vengat","corejava");
		m.put("Subash","jira");
		Set<Entry<String, String>> g = m.entrySet();
		for (Entry<String, String> a : g) {
			System.out.println(a);
		}
	}
}

*/

/*package com.abc;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer, String> m = new HashMap<Integer, String>();
		m.put(10, "java");
		m.put(20, "sql");
		m.put(30, "oops");
		m.put(40, "sql");
		m.put(50, "oracle");
		m.put(60, "DB");
		m.put(10, "selenium");
		m.put(50, "psql");
		m.put(40, "Hadoop");
		Set<Entry<Integer, String>> g = m.entrySet();
		for (Entry<Integer, String> b : g) {
		System.out.println(b.getKey());
		System.out.println(b.getValue());
		}
	}
}

*/

/*package com.abc;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map<Integer,Integer> m= new LinkedHashMap<Integer,Integer>();
		m.put(10,10);
		m.put(20,20);
		m.put(30,30);
		m.put(40,40);
		m.put(50,50);
		m.put(60,60);
		m.put(10,10);
		m.put(50,50);
		m.put(40,40);
		Set<Entry<Integer, Integer>> g = m.entrySet();
		for (Entry<Integer, Integer> a : g) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
			}
		}
	}
	
*/

/*package com.abc;
import java.util.TreeMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[]args) {
		Map <Character,Integer> m= new TreeMap<Character,Integer>();
		m.put('!',10);
		m.put('@',20);
		m.put('#',30);
		m.put('$',40);
		m.put('%',50);
		m.put('^',60);
		m.put('&',10);
		m.put('*',50);
		m.put('(',409);
		Set<Entry<Character,Integer>> g = m.entrySet();
		for (Entry<Character,Integer> a : g) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
			}
		}
	}

*/
/*package com.abc;
import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Day9Map {
	public static void main(String[] args) {
		Map <String, String> m= new Hashtable<String, String>();		
		m.put("vel","Selenium");
		m.put("Ganesh","framework");
		m.put("Dinesh","oracle");
		m.put("vengat","corejava");
		m.put("Subash","jira");
		Set<Entry<String, String>> g = m.entrySet();
		for (Entry<String, String> a : g) {
			System.out.println(a.getKey());
			System.out.println(a.getValue());
			}
		}
	}
		
*/

/*package com.abc;
import java.util.HashMap;
import java.util.Map;
public class Day9Map {
	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();	
		m.put("empId", 1234);
		m.put("phone", 1234567890);
		m.put("dob", 01042000);
		m.put("doj", 17072023);
		m.put("Sal", 25000);
		Map<String, String> q= new HashMap<String,String>();	
		q.put("name", "Dia");
		q.put("address", "12B,ABC-Flat,Chennai.");
		q.put("eMail", "abc@gmail.com");
		q.put("gender", "Female");
		System.out.println(m);
		System.out.println(q);
		
	}
}

*/

/*package com.abc;
import java.util.HashMap;
import java.util.Map;
public class Day9Map {
	public static void main(String[] args) {
		Map<String, Integer> m= new HashMap<String, Integer>();	
		m.put("StdId", 1234);
		m.put("Stdphone", 1234567890);
		m.put("dob", 01042000);
		Map<String, String> q= new HashMap<String,String>();	
		q.put("Stdname", "Dia");
		q.put("address", "12B,ABC-Flat,Chennai.");
		q.put("eMail", "abc@gmail.com");
		q.put("gender", "Female");
		System.out.println(m);
		System.out.println(q);
		
	}
}

*/






