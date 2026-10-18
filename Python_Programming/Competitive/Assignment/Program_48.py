OddNo = lambda No1 : (No1 % 2 != 0)

def main():
    Data = []

    R = int(input("Enter range : "))

    for i in range(0,R):
        i = int(input("Enter number : "))
        Data.append(i)

    Fdata = list(filter(OddNo,Data))

    print(Fdata)

if __name__ == "__main__":
    main()