def Square(x):
    Ans = x * x
    return Ans

def main():
    A = int(input("Enter first number : "))

    Ret = Square(A)

    print(Ret)

if __name__ == "__main__":
    main()