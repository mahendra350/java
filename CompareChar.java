



public class CompareChar {


public static void main(String[] args)

{

String x="mahendra";

String y="kalyan";

char z[]=x.toCharArray();

char c[]=y.toCharArray();

for(int i=0;i<z.length;i++)

{

for(int j=0;j<c.length;j++)

{

if(z[i]==c[j])

{

System.out.println("characters of same "+z[i]);

System.out.println("location of same char :"+i);

}

}

}


}


}
