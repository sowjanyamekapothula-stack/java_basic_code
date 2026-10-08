import java.util.Scanner;
class Input{
   public static void main(String[] args)
   {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter numbers:");
     while(true){
         int n=sc.nextInt();
      if (n<=0){
        break;
}
System.out.println(n);
}
System.out.println("code stopped");
}
}