#include<stdio.h>
int main()
{ int n,r, s=0,s1=0;
 scanf("%d",&n);
 // while(n>0 &&n<9)
 //goto s;
//   s:
 //{
    while(n>9)
  { 
    r=n%10;
    s=s+r;
    n=n/10;
  }
  
   n=n%10;
  s=s+n;
//printf("%d",s);

 if(!(s<=9))
 {
   r=s%10;
   s1=s1+r;
   s=s/10;
 }
 s=s%10;
 s1=s1+s;
  printf("%d",s1);
  return 0;
}