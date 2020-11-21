package code;

public class NodeTour {
	private int data;
	private NodeTour prev;
	private NodeTour next;
	private NodeTour up;
	private NodeTour down;
	private NodeTour left;
	private NodeTour right;
	private NodeTour set1;
	private NodeTour set2;
	private NodeTour set3;
	private NodeTour set4;
	private NodeTour set5;
	private NodeTour set6;
	private NodeTour set7;
	private NodeTour set8;
	
	public NodeTour(){
		data = 0;
	}
	
	public NodeTour(int data)
	{
		this.data = (int)(Math.random()*6+1);
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	//for grid array thingy
	public NodeTour getLeft() {
		return left;
	}
	public void setLeft(NodeTour left) {
		this.left = left;
	}
	public NodeTour getRight() {
		return right;
	}
	public void setRight(NodeTour right) {
		this.right = right;
	}
	
	public NodeTour getUp() {
		return up;
	}
	public void setUp(NodeTour up) {
		this.up = up;
	}
	public NodeTour getDown() {
		return down;
	}
	public void setDown(NodeTour down) {
		this.down = down;
	}
	public NodeTour getset1() {
		return set1;
	}
	public void setset1(NodeTour set1) {
		this.set1 = set1;
	}
	public NodeTour getset2() {
		return set2;
	}
	public void setset2(NodeTour set2) {
		this.set2 = set2;
	}
	public NodeTour getset3() {
		return set3;
	}
	public void setset3(NodeTour set3) {
		this.set3 = set3;
	}
	public NodeTour getset4() {
		return set4;
	}
	public void setset4(NodeTour set4) {
		this.set4 = set4;
	}
	public NodeTour getset5() {
		return set5;
	}
	public void setset5(NodeTour set5) {
		this.set5 = set5;
	}
	public NodeTour getset6() {
		return set6;
	}
	public void setset6(NodeTour set6) {
		this.set6 = set6;
	}
	public NodeTour getset7() {
		return set7;
	}
	public void setset7(NodeTour set7) {
		this.set7 = set7;
	}
	public NodeTour getset8() {
		return set8;
	}
	public void setset8(NodeTour set8) {
		this.set8 = set8;
	}
	public NodeTour getPrev() {
		return prev;
	}
	public void setPrev(NodeTour prev) {
		this.prev = prev;
	}
	public NodeTour getNext() {
		return next;
	}
	public void setNext(NodeTour next) {
		this.next = next;
	}
}
