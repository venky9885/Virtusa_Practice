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
