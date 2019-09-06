#include <stdio.h>
int main() {
	int n;
  int r,t;
  scanf("%d",&n);
 while(n>99)
 {
   n=n/10;
 }
	r=n%10;
  printf("%d",r);
  
  return 0;
}