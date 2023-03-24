package kr.ac.kopo.day14.homework02;

public abstract class PlainFigure extends Figure{

	private int width;
	protected int height;
	
	PlainFigure(){
		
	}

	public PlainFigure(int width, int heigh){
		this.width = width;
		this.height = heigh;
	}
	
	public int getWidth() {
		return width;
	}

	
//	@Override
//	public void setArea(double area) {
//		super.setArea(area);
//	}
	
}
