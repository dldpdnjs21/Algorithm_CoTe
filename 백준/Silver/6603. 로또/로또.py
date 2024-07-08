# {1, 2,..., 49}에서 k개 뽑고 그 뽑은 배열에서 6개를 고르는 경우의 수
def lotto(arr, s, index, cnt):
    if cnt==6:
        print(*arr)
        return
    for i in range(index, len(s)):
        # print("for문 1",arr, s)
        arr[cnt]= s[i]
        lotto(arr, s, i+1, cnt+1)
while True:
    s = list(map(int, input().split()))
    if s[0]==0:
        break
    arr = [0]*6
    lotto(arr, s[1:], 0, 0)
    print()