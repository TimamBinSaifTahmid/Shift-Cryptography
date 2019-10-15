
package shiftcryptography;

public class ShiftCryptography {

void encript(int key,String str){
int i;
char temp;
    System.out.print("Encripted message is:");
for(i=0;i<str.length();i++){
   temp=str.charAt(i);
  if(temp>=65&&temp<=90){
      temp=(char)(((temp-64+key)%26)+64);
      if(temp==64)temp='Z';
}
else{
      temp=(char)(((temp-96+key)%26)+96);
      if(temp==96)temp='z';
}
    System.out.print(temp);  
}
    System.out.print("\n");
}
void decript(int key,String str){
  int i;
char temp;
    System.out.print("Decripted message is:");
for(i=0;i<str.length();i++){
   temp=str.charAt(i);
  if(temp>=65&&temp<=90){
      if(temp-64-key>0)temp=(char)(temp-key);
      else if(temp-64-key==0)temp='Z';
      else{
          temp=(char)(90+temp-64-key);
      }
}
else{
         if(temp-96-key>0)temp=(char)(temp-key);
      else if(temp-96-key==0)temp='z';
      else{
          temp=(char)(122+temp-96-key);
      }
}
    System.out.print(temp);  
}
    System.out.print("\n");
}
            
}
