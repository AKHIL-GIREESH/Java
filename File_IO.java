import java.io.*;

class File_IO
    {
        public static void main(String arg[])
            {
                FileInputStream fin=null;
                FileOutputStream fout=null;
                int i,j=0;
                char atr[]=new char[20];
                char ratr[]=new char[20];
                char patr[]=new char[20];
                char min;
                char maxvalue='1';
                int p=0;
                String sNew = "",sNew1 = "";
                try
                {
                    fin=new FileInputStream("test.txt");
                    fout=new FileOutputStream("test2.txt");
                }
                catch(Exception e)
                    {

                    }
                try{
                    do
                    {
                        
                        i=fin.read();
                        if(i!=-1)
                            {
                                sNew+=(char)i;
                            }

                    }while(i!=-1);
                   
                    String s=new String(atr);
                    int o=0;
                    System.out.println(j);
                    for(int m=0;m<sNew.length();m++)
                    {
                        sNew1+=sNew.charAt(m);
                        
                        
                    }
                    String s1=new String(ratr);
                    System.out.println(sNew+" "+sNew1+" "+sNew.length()+" "+sNew1.length()+" "+sNew.equals(sNew1));
                    if(!s.equals(s1))
                        {
                            System.out.println("false");
                        }
                    if(s.equals(s1))
                        { 
                            System.out.println("true");
                            for(int k=0;k<=j;k++)
                                {
                                    for(int l=0;l<=j;l++)
                                        {
                                            maxvalue=atr[1];
                                            if(atr[k]==atr[l])
                                                {
                                                    atr[l]='0';
                                                    
                                                } 
                                        }
                                    if(atr[i]!='0')
                                        {
                                            patr[p]=maxvalue;
                                            p++;
                                        }

                                }
                                int l=0;
                                do
                                {
                                    fout.write((byte)patr[1]);
                                    l++;
            
                                }while(l!=j);
                        }
                    else
                        {
                            int l=0;
                            do
                            {
                                
                                fout.write((byte)atr[l]);
                                l++;
        
                            }while(l!=j);
                            
                        }
                        
                    
                
                }
                catch(Exception e)
                {

                }
                try
                {
                    fin.close();
                    fout.close();
                }
                catch(Exception e)
                {

                }
            }
    }