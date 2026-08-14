def Factorial(x):
   Fact = 1
   for i in range(1,x+1):
        Fact = Fact * i
   return Fact

def main():
    A = int(input("Enter number : "))

    Ret = Factorial(A)

    print(Ret)

if __name__ == "__main__":
    main()