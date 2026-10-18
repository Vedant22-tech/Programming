DivBy5or7 = lambda No1 : ((No1 % 3 == 0) and (No1 % 5 == 0))

def main():
    Data = []

    R = int(input("Enter range : "))

    for i in range(0,R):
        i = int(input("Enter number : "))
        Data.append(i)

    Fdata = list(filter(DivBy5or7,Data))

    print(Fdata)

if __name__ == "__main__":
    main()