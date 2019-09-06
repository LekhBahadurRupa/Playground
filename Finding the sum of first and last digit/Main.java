#include <stdio.h>
int main() {
	//Type your code
  int n,nf,nl,f,l;
  scanf("%d",&n);
  nf=n; nl=n;
  while(nf>=99)
  {
    nf=nf/10;
  }
	nf=nf/10;
  //printf("%d",nf);
  
  while(nl>=99)
  {
    nl=nl%10;
  }

 // printf("%d",nl);  
  
  printf("%d",nf+nl);
	return 0;
}