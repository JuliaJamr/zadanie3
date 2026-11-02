public class SequenceCompressor {

    private int currentSize = 0;
    private int[] output;

    public SequenceCompressor(int[] output)
    {
        this.output = output;
    }

    public boolean compress(int[] input, int inSize)
    {
        currentSize = 0;
        for(int i=0;i<inSize;i++)
        {
            if(currentSize+1>=output.length) return false;

            output[currentSize]=input[i];
            currentSize++;

            int pom = 1;
            while(i+1<inSize && input[i+1]==input[i])
            {
                i++;
                pom++;
            }

            output[currentSize]=pom;
            currentSize++;
        }

        return true;
    }
}
