public class SkyView
{
    double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numCols][numRows];
        int idx = 0;
        for(int i = 0; i < numCols; i++)
        {
            int adx = 0;
            for(int j = 0; j < numRows; j++)
            {
                if(i % 2 == 0)
                {
                    view[i][j] = scanned[idx];
                    idx++;
                }
                else
                {
                    view[i][j] = scanned[idx + numRows - adx - 1];
                    adx++;
                }
            }
            idx += adx;
        }
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol)
    {
        double tot = 0;
        int counter = 0;
        for(int i = startCol; i < endCol; i++)
        {
            for(int j = startRow; j < endRow; j++)
            {
                tot += view[i][j];
                counter++;
            }
        }
        return tot/counter;
    }
}
