N,M = map(int,input().split())
NUM = list(map(int,input().split()))
sum = []
l = len(NUM)
for i in range(0,l-2):
	for j in range(i+1,l-1):
		for z in range(j+1,l):
			if(NUM[i]+NUM[j]+NUM[z]>M):
				continue
			else:
				sum.append(NUM[i]+NUM[j]+NUM[z])
print(max(sum))