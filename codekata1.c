#include<stdio.h>
void main()
{
int n;
scanf("%d",&n);
int a[10000],c[10000]={0};
for(int i=0;i<n;i++)
{
  scanf("%d",&a[i]);
  c[a[i]]++;
}
  int j=0;
for(int i=0;i<=10000;i++)
{
  if(c[i]>1)
  {
    printf("%d ",i);
    j=1;
  }
}
  if(j==0)
    printf("unique");
}
