def AreaOfCircle(No1):
    Pie = 3.14
    Area = Pie * (No1 * No1)

    return Area

def main():
    Radius = int(input("Enter Length : "))

    Ret = AreaOfCircle(Radius)

    print("Area of Circle is : ",Ret)

if __name__ == "__main__":
    main()