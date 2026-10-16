from MarvellousLibrary import filterX, mapX, reduceX

CheckEven = lambda No : (No % 2 == 0)
Increment = lambda No : No+1
Addition = lambda No1,No2 : No1 + No2

def main():
    Data = [13,12,8,10,11,20]

    print("Input data is :",Data)

    FData = list(filterX(CheckEven, Data))

    print("Data after filter : ",FData) 

    MData = list(mapX(Increment, FData))

    print("Data after map : ",MData)

    Rdata = reduceX(Addition, MData)

    print("Data after reduce : ",Rdata)

if __name__ == "__main__":
    main()