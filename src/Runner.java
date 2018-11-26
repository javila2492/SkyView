public class Runner
{
    public static void main(String[] args)
    {
        double[] scan = {.3, .7, .8, .4, 1.4, 1.1, .2, .5, .2, 1.6, .6, .9};
        double[] scan2 = {.3, .7, .8, .4, 1.4, 1.1};

        SkyView sv1 = new SkyView(4, 3, scan);
        SkyView sv2 = new SkyView(3, 2, scan2);

        for(int i = 0; i < sv1.view.length; i++)
        {
            for(int j = 0; j < sv1.view[i].length; j++)
            {
                System.out.print(" ");
                System.out.print(sv1.view[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        for(int i = 0; i < sv2.view.length; i++)
        {
            for(int j = 0; j < sv2.view[i].length; j++)
            {
                System.out.print(" ");
                System.out.print(sv2.view[i][j]);
            }
            System.out.println();
        }

        System.out.println("Average 1: " + sv1.getAverage(1, 3, 0, 2));
        System.out.println("Average 2: " + sv1.getAverage(0, 1, 0, 1));
    }
}
