   //USING RECURSION
   public static int joseph(int data, int k) {
       if (data == 1)
           return 1;
       else
           return (joseph(data-1,k)+k-1)%data+1;
   }
   public static void main(String[] args) {
       // Scanner sc=new Scanner(System.in);
       int res=joseph(40,17);
       System.out.println("Josephus can be at position "+res);

   }
