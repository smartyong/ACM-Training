import java.util.*;
class SwitchTest 
{
	public static void main(String[] args) 
	{
       //xunHuan();
	  //myMethod();
	 myMethod1();
	}
	public static void sop(Object obj)
			{ System.out.println(obj);  }
   public static void xunHuan()//�ж���������ļ���
	 {   int num=0;
		
		while (num!=1000)
		{
		
		sop("*************************һ��Ҳ�������ķָ���*********************************");
		sop("�����������");
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		int sum=num/10;
		switch(sum)
		{case 10:
			case 9:
			sop("����");
		break;
		case 8:
			case 7:
			sop("����");
		break;
		case 6:
			sop("����");
		break;
		case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
			sop("������");
		break;
		default ://ע�⣬defaultҲ�ǿ��Է���caseǰ��ģ�����Ҫ��default����������break����Ȼ��ִ�е���һ��breakǰ�Ĵ���Ϊֹ��
			sop("����ѧ��������ʦ�̵ģ���������");

		}
		}
		}
		public static void myMethod()//��1+3+5--------+99��ֵ
	    {int sum=0;
		for(int i=1;i<=99;i+=2)
			{sum+=i;
		     sop("sum+i="+sum);
			
		    }		
		//sop("�����:"+sum);
		}
    public static void myMethod1()//�������ʮ������ת���ɶ���������
   {
	   int num=1;
	   while(num!=4444)
	   {
	   sop("������һ��ʮ��������");
      Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  int k=num;
	  
    String  result="";
	for(;num>=1;)
	   {int a=num%2;
	    num=num/2;
	result=a+result;
	
	  }
sop("��Ӧ�Ķ�������Ϊ:"+result);
sop("��������еķ���:"+Integer.toBinaryString(k));
sop("*************************һ��Ҳ�������ķָ���*********************************");
sop("\n");

  }
   }
}
