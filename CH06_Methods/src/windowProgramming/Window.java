package windowProgramming;

public class Window {
	private int width; // ����
	private int height; // ����
	private boolean isVisible; // ���� ���̴°�?
	private int top; // ��ġ
	private int left; // ��ġ

	// get set �޼ҵ� �����
	public void setWidth(int x) {
		this.width = x;
	}
	public int getWidth() {
		return width;
	}
	
	public void setHeight(int x) {
		this.height = x;
	}
	public int getHeigth() {
		return height;
	}
	
	public void setIsVisible(boolean x) {
		this.isVisible = x;
	}
	public boolean getIsVisible() {
		return isVisible;
	}
	
	public void setTop(int x) {
		this.top = x;
	}
	public int getTop() {
		return top;
	}
	
	public void setLeft(int x) {
		this.left = x;
	}
	public int getLeft() {
		return left;
	}
}
