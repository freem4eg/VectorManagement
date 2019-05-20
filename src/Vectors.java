public class Vectors {

    double x;
    double y;
    double z;

    public Vectors(double myX, double myY, double myZ) {
        x = myX;
        y = myY;
        z = myZ;
    }

    public double vectorLength() {
        return Math.sqrt(x * x + y * y + z * z);
    }

    public double scalarMultiply(Vectors vector) {
        return vector.x * x + vector.y * y + vector.z * z;
}

    public Vectors vectorMultiply(Vectors vector) {
        return new Vectors(y*vector.z - z*vector.y, z*vector.x - x*vector.z, x*vector.y - y*vector.x);
    }

    public double cosinus(Vectors vector) {
        return scalarMultiply(vector) / (vectorLength() * vector.vectorLength());
    }

    public Vectors sum(Vectors vector) {
        return new Vectors(x+vector.x, y+vector.y, z+vector.z);
    }

    public Vectors substract(Vectors vector) {
        return new Vectors(x-vector.x, y-vector.y, z-vector.z);
    }

    public static Vectors[] vectorGenerator(int n) {
        Vectors[] vectors = new Vectors[n];
        for (int i = 0; i < n; i++) {
            vectors [i] =  new Vectors(Math.random()*10, Math.random()*10, Math.random()*10);
            System.out.println(vectors[i].toString());
        }
        return vectors;
    }

    public String toString() {
        return "Vector: "+x+", "+y+", "+z;
    }

}
