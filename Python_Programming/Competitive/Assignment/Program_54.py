from functools import reduce

ProductNum = lambda No1,No2 :No1*No2

def main():
    Data = []

    R = int(input("Enter range : "))

    for i in range(0,R):
        i = int(input("Enter number : "))
        Data.append(i)

    Rdata = reduce(ProductNum,Data)

    print(Rdata)

if __name__ == "__main__":
    main()