public class lab4
{

public static void main(String []args)
{
  
  int [] arr = new int[args.length/ 2];
  
  for (int i = 0; i < args.length; i++){
    arr[i]= Integer.parseInt(args[i]);
      System.out.println(arr[i]);
  
  // reverse array 
for( i = 0; i < arr.length / 2; i++)
{
    int x = arr[i];
    arr[i] = arr[arr.length - i - 1];
     x = arr[arr.length - i - 1];
}
}
}
}