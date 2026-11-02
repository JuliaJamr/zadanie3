public class Main {

    public static void main(String[] args)
    {
        int[] input = {1,1,1,2,2,3,4,4,4,5,6};
        SequenceCompressor output = new SequenceCompressor(new int[10]);

        boolean wynik = output.compress(input,input.length);

        System.out.println(wynik);
    }
}
