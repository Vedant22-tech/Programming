def Calculation(No1,No2):
    Add = No1 + No2
    print(Add)

    Sub = No1 - No2
    print(Sub)

    Mul = No1 * No2
    print(Mul)

    Div = No1 / No2
    print(Div)

def main():
    A = int(input("Enter Number1 : "))
    B = int(input("Enter Number2 : "))

    Calculation(A,B)

if __name__ == "__main__":
    main()