/**
 * Class for node.
 */
class Node {
	//Todo
	String value;
	Node nextNode;
	node(String value,Node nextNode){
		this.value=value;
		this.nextNode=nextNode;

	}
 
	Node(final String val){
		this.value=val;
	}
}