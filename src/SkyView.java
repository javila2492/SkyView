public class SkyView
{
    double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned)
    {
        view = new double[numCols][numRows];
        int idx = 0;
        for(int i = 0; i < numRows; i++)
        {
            int adx = 0;
            for(int j = 0; j < numCols; j++)
            {
                if(i % 2 == 0)
                {
                    view[j][i] = scanned[idx];
                    idx++;
                }
                else
                {
                    view[j][i] = scanned[idx + numCols - adx - 1];
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
