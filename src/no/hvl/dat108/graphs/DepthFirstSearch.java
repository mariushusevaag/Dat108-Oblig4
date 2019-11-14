/**
 * 
 */
package no.hvl.dat108.graphs;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

/**
 * @author tdoy
 *
 */
public class DepthFirstSearch {

	private String source;
	private Graph graph;
	
	public DepthFirstSearch(Graph graph, String source) {
		
		this.graph = graph;
		this.source = source;
	}
	
	public Set<String> doDepthFirstSearch(){
		
		Set<String> visited = new LinkedHashSet<String>();
		Stack<String> stack = new Stack<String>();
		
		//push the source in the stack
		stack.push(source);
		
		//Run if stack is not empty
		while(!stack.isEmpty()) {
			source = stack.pop();
			
			//Check if source is already visited
			if(!visited.contains(source)) {
				visited.add(source);
				
				for(Node e : graph.getAdjacentNodes(source)) {
					stack.push(e.getName());
				}
			}
		}
				
		return visited;
	}
	
	public Set<String> doDepthFirstSearchRecursive(){
		
		Set<String> visited = new LinkedHashSet<String>();
		List<Node> nodes = new ArrayList<Node>(graph.getAdjNodes().keySet());
		
		// use nodes
		Node src = nodes.get(nodes.indexOf(new Node(source)));

		// call dfsRecursive method here
				
		return visited;
	}
	
	public void dfsRecursive(List<Node> nodes, Node src, Set<String> visited) {
		
		// implement me
		
	}
	
}
