import java.util.Scanner;
public class adjacencymatrix {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of nodes");
        int n=s.nextInt();
        int start,end;
        int weight;
        var arr=new int[n][n];

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=0;
            }
        }
        System.out.println("is the graph directed or undirected(y/n)");
        char ch =s.next().charAt(0);

        for(int i=0;i<n;i++)
        {
            System.out.println("enter the start node");
            start=s.nextInt();
            System.out.println("enter the end node");
            end=s.nextInt();
            System.out.println("enter the weight");
            weight=s.nextInt();
            if(ch=='n')
            arr[start-1][end-1]=weight;
            else{
                arr[start-1][end-1]=weight;
                arr[end-1][start-1]=weight;
            }

        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
