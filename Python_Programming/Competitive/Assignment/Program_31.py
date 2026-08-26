def AreaOfRectangle(No1,No2):
    Area = No1 * No2
    return Area

def main():
    length = int(input("Enter Length : "))
    width = int(input("Enter Width : "))

    Ret = AreaOfRectangle(length,width)

    print("Area of Rectangle is : ",Ret)

if __name__ == "__main__":
    main()