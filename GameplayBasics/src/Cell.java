public class Cell {
    private int x;
    private int y;
    private boolean hasEnemy = false;
    public Cell(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public boolean getHasEnemy(){
        return this.hasEnemy;
    }
}
