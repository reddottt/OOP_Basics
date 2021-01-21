package vector;

public class Vector {
    private double x;
    private double y;
    private double z;

    public static void main(String[] args){
        Vector[] vectors = Vector.returnVectors(2);
        System.out.println(vectors[0]);
        System.out.println(vectors[1]);
        System.out.println("Length of vectors[0]: " + vectors[0].length());
        System.out.println("Length of vectors[1]: " + vectors[1].length());
        System.out.println("Scalar Product of vectors: " + vectors[0].scalarProduct(vectors[1]));
        System.out.println("Cross Product of vectors: " + vectors[0].crossProduct(vectors[1]));
        System.out.println("Cos of vectors " + vectors[0].cos(vectors[1]));
        System.out.println("Add of vectors " + vectors[0].add(vectors[1]));
        System.out.println("Difference of vectors " + vectors[0].difference(vectors[1]));

    }

    public Vector(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length(){
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarProduct(Vector vector) {
        return x * vector.x + y * vector.y + z * vector.z;
    }

    public Vector crossProduct(Vector vector){
        return new Vector(
                this.y * vector.z - this.z * vector.y,
                this.z * vector.x - this.x * vector.z,
                this.x * vector.y - this.y * vector.x
        );
    }

    public double cos(Vector vector){
        return scalarProduct(vector) / (length() * vector.length());
    }

    public Vector add(Vector vector){
        return new Vector(
                this.x + vector.x,
                this.y + vector.y,
                this.z + vector.z
        );

    }

    public Vector difference(Vector vector){
        return new Vector(
                this.x - vector.x,
                this.y - vector.y,
                this.z - vector.z
        );
    }

    public static Vector[] returnVectors(int N){
        Vector[] vectors = new Vector[N];
        for(int i = 0; i < N; i++){
            vectors[i] = new Vector(Math.random() * 10, Math.random() * 10, Math.random() * 10);
        }
        return vectors;
    }

    public String toString(){
        return "Vector coords: x = " + this.x + " y = " + this.y + " z = " + this.z;
    }
}
