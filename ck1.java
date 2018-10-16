import java.util.*;
class Main {
  public static void main(String[] args) 
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int c=0;
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(int i=0;i<n;i++)
    {
      int a=sc.nextInt();
      if(hm.get(a)==null)
      hm.put(a,1);
      else
      hm.put(a,hm.get(a)+1);
    }
    for(int a:hm.keySet())
    {
      if(hm.get(a)>1)
      {
        c=1;
        System.out.print(a+" ");
      }
    }
    if(c==0)
    System.out.print("unique");
  }
}
