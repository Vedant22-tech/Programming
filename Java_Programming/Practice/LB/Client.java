//User Defined package import

import PPA.Infosystem;
import PPA.LB.pune;
import PPA.Marvellous;


class Client
{
    public static void main(String A[])
    {
        Marvellous mobj = new Marvellous();
        Infosystem iobj = new Infosystem();
        pune pobj = new pune();

        System.out.println("Inside main of Client");

        mobj.fun();
        iobj.gun();
        pobj.sun();

    }
}