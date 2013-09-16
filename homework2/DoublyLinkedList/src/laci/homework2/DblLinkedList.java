package laci.homework2;

public class DblLinkedList {

	private Node backTraceNode = null;
	private Node firstNode = null;
	private Node lastNode = null;
	
	
	public void add(String input) {
		Node tmpNode = new Node(input);
		if(backTraceNode !=null){
			backTraceNode.setPointerNode(tmpNode);
			tmpNode.setPrevNode(backTraceNode);
			lastNode = tmpNode;
		}else{
			firstNode=tmpNode;
		}
		backTraceNode = tmpNode;	
	}
	
	public String forwardPrint() {
		StringBuffer forwardResult = new StringBuffer();
		Node tmpNode = firstNode;
		while(tmpNode!=null){
			forwardResult.append(tmpNode.getValue()+" ");
			tmpNode = tmpNode.getPointerNode();
		}
		return forwardResult.toString();
	}
	
	public String reversePrint() {
		
		StringBuffer backResult = new StringBuffer();
		Node tmpNode = lastNode;
		while(tmpNode!=null){
			backResult.append(tmpNode.getValue() + " ");
			tmpNode = tmpNode.getPrevNode();
		}
		return backResult.toString();
	}

}
