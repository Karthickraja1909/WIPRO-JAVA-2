import java.io.*;

import java.util.*;

// Read only region start

class UserMainCode

{ public int secondLastDigitOf(int input1){
if(input1<0)

input1=(-1)*input1;

int c=0;

int l=Integer.toString(input1).length();

int r=0; if(l==1) return -1;

else

{ while(input1>0)

{

r=input1%10;

c++;

input1/=10;

if(c==2)

break;

}

return r;

}

}

}

