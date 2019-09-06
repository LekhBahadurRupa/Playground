#include<stdio.h>
int main()
{
float diameter, angle, arc, pi=3.14;
scanf("%f %f",&diameter,&angle);
//diameter=diameter/2;
arc =2* (pi * diameter) * (angle / 360.0); 
printf("%.2f", arc);
return 0;
}
