#include <stdio.h>
int main() {
	//Type your code
  
  int n,s=0,r;
  scanf("%d",&n);
  while(n>0)
  {
    r=n%10;
    n=n/10;
    s=s+r;
   // printf("%d",s);
  }
  //n=n%10;
  //s=s+n;
    printf("%d",s);  
	return 0; 
  
}