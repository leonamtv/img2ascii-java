package core;

public class MathUtil {

    public static int map ( int val, int inMin, int inMax, int outMin, int outMax ) {
        return ( val - inMin ) * ( outMax - outMin ) / ( inMax - inMin ) + outMin;
    }

}
