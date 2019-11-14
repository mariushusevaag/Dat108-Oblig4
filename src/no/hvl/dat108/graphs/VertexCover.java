/**
 * 
 */
package no.hvl.dat108.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @author tdoy
 *
 */
public class VertexCover {

	/**
	 * 
	 */

	private Graph graph;
	
	public VertexCover(Graph graph) {
		
		this.graph = graph;
		
	}
	
	public List<String> approxVertexCover() {
		
		List<String> approxmvc = new ArrayList<String>(); 						// set to hold our min vertex cover
		
		// collect the edges of the graph 
		Queue<Edge> queue = new LinkedList<Edge>(graph.getEdges()); 			// set of all vertices
		
		while(!queue.isEmpty()) {
			approxmvc.add(queue.peek().getSource());
			approxmvc.add(queue.peek().getDestination());
			
			List<Edge> remainingEdges = new ArrayList<Edge>(queue);
			for(Edge e : remainingEdges) {
				if(approxmvc.contains(e.getSource()) || approxmvc.contains(e.getDestination())) {
					queue.remove(e);
				}
			}
			
			
		}
		
		return approxmvc;		
	}
	
}
