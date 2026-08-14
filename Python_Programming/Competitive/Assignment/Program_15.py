def ChkDivisible(x):
    if(x % 3 == 0 and x % 5 == 0):
        print(x,"is divisible by 3 and 5")
    else:
        print(x,"is not is divisible by 3 and 5")

def main():
    A = int(input("Enter first number : "))

    ChkDivisible(A)

if __name__ == "__main__":
    main()