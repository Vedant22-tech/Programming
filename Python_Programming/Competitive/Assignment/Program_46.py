Square = lambda No1 : No1 * No1

def main():
    Data = []

    R = int(input("Enter range : "))

    for i in range(0,R):
        i = int(input("Enter number : "))
        Data.append(i)

    Mdata = list(map(Square,Data))

    print(Mdata)

if __name__ == "__main__":
    main()