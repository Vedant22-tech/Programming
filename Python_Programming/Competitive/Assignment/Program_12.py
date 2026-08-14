def ChkGreater(x, y):
    if(x > y):
        print(x,"is greater")
    else:
        print(y,"is greater")

def main():
    A = int(input("Enter first number : "))
    B = int(input("Enter second number : "))

    ChkGreater(A, B)

if __name__ == "__main__":
    main()