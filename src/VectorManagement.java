import org.apache.commons.lang3.ArrayUtils;

import java.util.Arrays;

public class VectorManagement {
    public static void main(String[] args) {
        Vectors bobby = new Vectors(2, 2, 3);
        double length = bobby.vectorLength();
        System.out.println(length);
        Vectors john = new Vectors(1, 2, 3);
        double multiply = john.scalarMultiply(bobby);
        System.out.println(multiply);
        Vectors vMultiply = john.vectorMultiply(bobby);
        System.out.println(vMultiply.toString());
        Vectors sum = john.sum(bobby);
        System.out.println(sum.toString());
        double cosinus = john.cosinus(bobby);
        System.out.println(cosinus);
        Vectors substract = john.substract(bobby);
        System.out.println(substract.toString());
        Vectors[] arrayOfVectors = Vectors.vectorGenerator(5);
        //System.out.println(arrayOfVectors);
    }
}
