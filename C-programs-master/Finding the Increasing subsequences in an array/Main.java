#include<stdio.h>
int main()
{
	int n,a[20],i,j;
  	scanf("%d",&n);
  for(i=0;i<n;i++)
  {
      	scanf("%d",&a[i]);
  }
  for(i=0;i<n;i++)
  {
    for(j=i+1;j<n;j++)
    {
		if(a[i]<a[j])
        {
          printf("%d,%d\n",a[i],a[j]);
        }
    }
  }
	return 0;
}