from functools import reduce

MaxNum = lambda No1,No2 :No1 if(No1 > No2) else No2

def main():
    Data = []

    R = int(input("Enter range : "))

    for i in range(0,R):
        i = int(input("Enter number : "))
        Data.append(i)

    Rdata = reduce(MaxNum,Data)

    print(Rdata)

if __name__ == "__main__":
    main()