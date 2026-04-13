class Solution {
    public double[] internalAngles(int[] sides) {
        double a = sides[0];
        double b = sides[1];
        double c = sides[2];
        if(a+b<=c||a+c<=b||b+c<=a){
            return new double [0];
        }
        double aA = Math.acos((b*b+c*c-a*a)/(2*b*c))*180/Math.PI;
        double aC = Math.acos((a*a+b*b-c*c)/(2*a*b))*180/Math.PI;
        double aB = Math.acos((a*a+c*c-b*b)/(2*a*c))*180/Math.PI;
        double[] angs={aA,aB,aC};
        java.util.Arrays.sort(angs);
        return angs;
    }
}