public class passingArrayToMethods {
    public static void main(String[] args) {
        int[] x = {10,34,67,56};

        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }
    // jab hum array ko method me pass krte hai to wo pass by reference hota hai...
    // means agr hum uper wale variable me change krte hai to to referance me change hoga
    public static void change(int[] y){
        y[2] = 87;
    }
}
