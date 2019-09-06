#include<stdio.h>
int main()
{
  //Type your code here
  int n,l,f,s;
  scanf("%d",&n);
  l=n%10;
  f=n/100;
  s=l+f;
  printf("%d",s);
  return 0;
}