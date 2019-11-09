package q1.extract_method.refactored;

import java.util.List;

class Graph {
	String name;
	boolean contains(String p) {
		return name.contains(p);
	}
}
public class A {
   Node m1(List<Node> nodes, String p) {
	   ex(nodes, p);
		// other implementation
	   return null;
   }

   Edge m2(List<Edge> edges, String p) {
	   ex(edges, p);
	   // other implementation
	   return null;
   }
   <T extends Graph> void ex(List<T> objs, String p) {
	   for(T obj : objs) {
		   if(obj.contains(p)) {
			   System.out.println(obj);
		   }
	   }
   }
}

class Node extends Graph { }

class Edge extends Graph { }