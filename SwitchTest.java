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
   public static void xunHuan()//判断输入分数的级别
	 {   int num=0;
		
		while (num!=1000)
		{
		
		sop("*************************一点也不华丽的分割线*********************************");
		sop("请输入分数！");
		Scanner sc=new Scanner (System.in);
		num=sc.nextInt();
		int sum=num/10;
		switch(sum)
		{case 10:
			case 9:
			sop("优秀");
		break;
		case 8:
			case 7:
			sop("良好");
		break;
		case 6:
			sop("及格");
		break;
		case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
			sop("不及格");
		break;
		default ://注意，default也是可以放在case前面的，但是要在default的语句块后加上break。不然会执行到下一个break前的代码为止。
			sop("你数学是语文老师教的？？？？？");

		}
		}
		}
		public static void myMethod()//求1+3+5--------+99的值
	    {int sum=0;
		for(int i=1;i<=99;i+=2)
			{sum+=i;
		     sop("sum+i="+sum);
			
		    }		
		//sop("结果是:"+sum);
		}
    public static void myMethod1()//将输入的十进制数转换成二进制数。
   {
	   int num=1;
	   while(num!=4444)
	   {
	   sop("请输入一个十进制数！");
      Scanner sc=new Scanner(System.in);
	  num=sc.nextInt();
	  int k=num;
	  
    String  result="";
	for(;num>=1;)
	   {int a=num%2;
	    num=num/2;
	result=a+result;
	
	  }
sop("对应的二进制数为:"+result);
sop("调用类库中的方法:"+Integer.toBinaryString(k));
sop("*************************一点也不华丽的分割线*********************************");
sop("\n");

  }
   }
}
