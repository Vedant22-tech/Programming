class Base:
    def fun(self):
        print("Inside base fun")

class Derived(Base):
    def sun(self):
        print("inside derived sun")

dobj = Derived()

dobj.fun()
dobj.sun() 

