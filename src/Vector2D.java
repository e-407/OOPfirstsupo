public class Vector2D {
    private float x;
    private float y;

    public Vector2D(float x, float y){
        this.x = x;
        this.y = y;
    }

    public float getX(){
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void add(Vector2D other){
        x += other.getX();
        y += other.getY();
    }

    public float scalarProduct(Vector2D other){
        return (x*other.getX()) + (y*other.getY());
    }

    public float magnitude(){
        return (float) Math.sqrt(x*x + y*y);
    }

    public void normalise(){
        float magnitude = magnitude();
        x /= magnitude;
        y /= magnitude;
    }

    public String toString(){
        return "(" + x + "," + y + ")";
    }

    public static void main(String[] args) {
        System.out.println("Testing (1.0,2.0) + (3.0,-1.0), expecting: (4.0,1.0)");
        Vector2D v1 = new Vector2D(1.0f, 2.0f);
        Vector2D v2 = new Vector2D(3.0f, -1.0f);
        v1.add(v2);
        if (v1.toString().equals("(4.0,1.0)")){
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing (1.0,2.0) . (3.0,-1.0), expecting: 1.0");
        Vector2D v3 = new Vector2D(1.0f, 2.0f);
        Vector2D v4 = new Vector2D(3.0f, -1.0f);
        float product = v3.scalarProduct(v4);

        if (product == 1.0f) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing |(3.0,4.0)|, expecting: 5.0");
        Vector2D v5 = new Vector2D(3.0f, 4.0f);
        float mag = v5.magnitude();

        if (mag == 5.0f) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }

        System.out.println("Testing normalise (3.0,4.0), expecting: (0.6,0.8)");
        v5.normalise();

        if (v5.toString().equals("(0.6,0.8)")) {
            System.out.println("Test successful");
        } else {
            System.out.println("Test failed");
        }
    }
}
