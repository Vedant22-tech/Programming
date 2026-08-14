print("-------------------------------------------")
print("--------- Ticket Pricing Software ---------")
print("-------------------------------------------")

print("Please enter your age : ")
Age = int(input())

if(Age <= 5 ):
    print("Ticket is Free")
elif(Age > 5 and Age <= 18):
    print("Ticket is : 900")
elif(Age > 18 and Age <= 40):
    print("Ticket is : 1200")
else:
    print("Ticket is : 500")