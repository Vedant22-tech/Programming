def Cube(x):
    Ans = x**3
    return Ans

def main():
    A = int(input("Enter first number : "))

    Ret = Cube(A)

    print(Ret)

if __name__ == "__main__":
    main()