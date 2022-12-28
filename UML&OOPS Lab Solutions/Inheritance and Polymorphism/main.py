n=int(input())

c=[]
for i in range(2*n-1):
	if  i==n-1:
		print(' '*2*i+str(i+1))
		continue
	if i>n-1:
		print(c[n-i-1])
		continue
	c.append(' '*2*i+str(i+1)+' '*(4*(n-i-1))+str(i+1))
	print(c[i])