import java.io.*;
class lcddisplay
{
	public static void main(String arghh[])throws IOException
	{
		String ss;
		BufferedReader br=new BufferedReader(new FileReader("question.txt"));
		while((ss=br.readLine())!=null)
		{
			if(ss.equals("0 0"))
			break;
			int s=Integer.parseInt(ss.substring(0,ss.indexOf(' ')));
			int n=Integer.parseInt(ss.substring(ss.indexOf(' ')+1));
			int r=2*s+3,k=n,e=0,d=0;
			String a[]=new String[r];
			generate(a,n+"",s);
		}
	}
	static void generate(String a[],String n,int ss)
	{
		for(int i=0;i<a.length;i++)
		{
			int j=0;
			String s="";
			while(j<n.length())
			{
				int b=(int)(n.charAt(j++))-48;
				s=s+data(a,b,ss,i)+" ";
			}
			System.out.println(s);
		}
		System.out.println("\n");
	}
	static String data(String a[],int n,int s,int r)
	{
		String x="";
		switch(n)
		{
			case 0:if(r==0||r==a.length-1)
			x=line(s);
			else if(r==(a.length-1)/2)
			x=empty(s);
			else
			x=both(s);
			break;
			case(1):if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=x+" ";
			else
			x=x+"|";
			break;
			case(2):if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=line(s);
			else if(r<(a.length-1)/2)
			x=right(s);
			else
			x=left(s);
			break;
			case(3):if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=line(s);
			else
			x=right(s);
			break;
			case(4):if(r==0||r==a.length-1)
			x=empty(s);
			else if(r>(a.length-1)/2)
			x=right(s);
			else if(r==(a.length)/2)
			x=line(s);
			else
			x=both(s);
			break;
			case(5):if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=line(s);
			else if(r<(a.length-1)/2)
			x=left(s);
			else
			x=right(s);
			break;
			case(6):if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=line(s);
			else if(r<(a.length-1)/2)
			x=left(s);
			else
			x=both(s);
			break;
			case(7):if(r==0)
			x=line(s);
			else if(r==a.length-1||r==(a.length-1)/2)
			x=empty(s);
			else
			x=right(s);
			break;
			case 8:if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=line(s);
			else
			x=both(s);
			break;
			case 9:if(r==0||r==a.length-1||r==(a.length-1)/2)
			x=line(s);
			else if(r>(a.length-1)/2)
			x=right(s);
			else
			x=both(s);
			break;
		}
		return x;
	}
	static String empty(int s)
	{
		String x="";
		for(int i=1;i<=s;i++)
		x=x+" ";
		x=" "+x+" ";
		return x;
	}
	static String line(int s)
	{
		String x="";
		for(int i=1;i<=s;i++)
		x=x+"-";
		x=" "+x+" ";
		return x;
	}
	static String both(int s)
	{
		String x="";
		for(int i=1;i<=s;i++)
		x=x+" ";
		x="|"+x+"|";
		return x;
	}
	static String left(int s)
	{
		String x="";
		for(int i=1;i<=s;i++)
		x=x+" ";
		x="|"+x+" ";
		return x;
	}
	static String right(int s)
	{
		String x="";
		for(int i=1;i<=s;i++)
		x=x+" ";
		x=" "+x+"|";
		return x;
	}
}
