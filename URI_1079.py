n = int(input())
for i in range(1,n+1):
    lista = list(map(float,input().split()))
    x,y,z = lista
    sum = ((x / 10) * 2) + ((y / 10) * 3) + ((z / 10) * 5)
    print("%.1f" %sum)
