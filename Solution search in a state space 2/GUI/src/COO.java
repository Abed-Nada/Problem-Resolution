
public class COO {
	
    private int X;
    private int Y;
  
    public COO(int X,int Y) {
        this.X = X;
        this.Y = Y;
    }

	@Override
	public String toString() {
		return "COO [X=" + X + ", Y=" + Y + "]";
	}

	public int getX() {
		return X;
	}

	public void setX(int x) {
		X = x;
	}

	public int getY() {
		return Y;
	}

	public void setY(int y) {
		Y = y;
	}

	
}
