def SumOfNum(x):
   Sum = 0
   for i in range(1,x+1):
        Sum = Sum + i
   return Sum

def main():
    A = int(input("Enter number : "))

    Ret = SumOfNum(A)

    print(Ret)

if __name__ == "__main__":
    main()