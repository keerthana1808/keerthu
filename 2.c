#include <stdio.h>
int main()
{
int g,a,b,d;
scanf("%d\n",&g);
scanf("%d %d %d",&a,&b,&d);
if(a>b&&a>d)
{
printf("%d",a);
}
else if(b>a&&b>d)
{
printf("%d",b);
}
else
{
printf("%d",d);
}
}
