N,K = map(int,input().split())
jo = []
pop_num = []
for i in range(1,N+1):
    jo.append(i)
temp=K-1
for i in range(N):
    #위치가 리스트를 넘지않으면
    if len(jo) > temp:
        #제거하고 답으로 추가
        pop_num.append(jo.pop(temp))
        #temp번째 수가 제거 되었고 (k-1)만큼 다음수가 시작이므로
        temp+=K-1
    #위치가 리스트를 넘으면
    elif len(jo) <= temp:
        temp = temp%len(jo)
        # 제거하고 답으로 추가
        pop_num.append(jo.pop(temp))
        # temp번째 수가 제거 되었고 (k-1)만큼 다음수가 시작이므로
        temp += K-1
print('<',end='')
for i in pop_num:
    if i==pop_num[-1]:print(i,end='')
    else: print("%s, "%(i),end='')
print('>',end='')
