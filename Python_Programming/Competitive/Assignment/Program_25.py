def CheckPalindrome(Value):
    iSum = 0
    iRev = 0

    Temp = Value

    while(Value != 0):
        iDigit = Value % 10

        iRev = iRev *10 + iDigit

        Value = Value // 10

    if(iRev == Temp):
        return True
    else:
        return False

def main():
    No = int(input("Enter Number :" ))

    iRet = False

    iRet = CheckPalindrome(No)

    if(iRet):
        print("Palindrome")
    else:
        print("Not Palindrome")


if __name__ == "__main__":
    main()