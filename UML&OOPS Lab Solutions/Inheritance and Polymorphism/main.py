x, y = map(int, input().split(" "))
d, l = '', ''
for i in str(x):
    if(i == '5'):
        d += '6'
    elif(i == '6'):
        d += '5'
    else:
        d += i
for i in str(y):
    if(i == '5'):
        l += '6'
    elif(i == '6'):
        l += '5'
    else:
        l += i
ls = [x, y, int(d), int(l)]
sr = []
for i in range(4):
    for j in range(i+1, 4):
        sr.append(ls[i]+ls[j])
sr.sort()
print(sr[1], sr[-2])

# 22


# print(min(sr), max(sr))

# print(d,l)
# print(int(d)+int(l))
# print(int(d)-int(l))

# d+=i+' '


# c=[]
# for i in range(2*n-1):
# 	if  i==n-1:
# 		print(' '*2*i+str(i+1))
# 		continue
# 	if i>n-1:
# 		print(c[n-i-1])
# 		continue
# 	c.append(' '*2*i+str(i+1)+' '*(4*(n-i-1))+str(i+1))
# 	print(c[i])
