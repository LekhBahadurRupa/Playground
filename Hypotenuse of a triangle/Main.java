#include<stdio.h>
#include<math.h>
int main()
{
  //Type your code here
  float a, b, c;

  scanf("%f %f",&a, &b);
   // a = a*a;
   // b = b*b;
    //c = a + b;
    //cout << "Enter side a\n" << endl;
     c = hypot(a, b);
    //cout << "Enter side b\n" << endl;
    //cin >> b;
  	printf("%.2f", c);

  return 0;
}