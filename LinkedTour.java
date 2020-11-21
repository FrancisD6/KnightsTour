package code;

import java.util.Scanner;

public class LinkedTour {
	private NodeTour first;
	private NodeTour left;
	private NodeTour right;

	private int number=1;
	private boolean flaga = true;

	public LinkedTour(int dimension)
	{ 
		first= new NodeTour();
		
		//NodeGrid coloumnmarker= new NodeGrid();
		
		NodeTour rowmarker=first;
		NodeTour columnmarker=first;
		for(int x=0;x<dimension-1;x++)
		{
			NodeTour temp= new NodeTour();
			columnmarker.setRight(temp);
			temp.setLeft(columnmarker);
			columnmarker=temp;
		}
		for(int y=0; y<dimension-1;y++)
		{
			NodeTour temp= new NodeTour();
			temp.setUp(rowmarker);
			rowmarker.setDown(temp);
			columnmarker=temp;
			
			for(int x=0; x<dimension-1; x++)
			{
				temp=new NodeTour();
				temp.setLeft(columnmarker);
				columnmarker.setRight(temp);
				temp.setUp(columnmarker.getUp().getRight());
				temp.getUp().setDown(temp);
				columnmarker=temp;
			}
			rowmarker=rowmarker.getDown();
		}
		rowmarker=first;
		columnmarker=first;
		NodeTour temp= first;
		for(int y=0;y<dimension;y++)
		{
			temp=rowmarker;
			for(int x=0;x<dimension;x++)
			{
				NodeTour temp2= temp;
				if(temp2.getUp()!=null)
					if(temp2.getUp().getUp()!=null)
					{
						if(temp2.getUp().getUp().getLeft()!=null)
							temp2.setset1(temp2.getUp().getUp().getLeft());
						if(temp2.getUp().getUp().getRight()!=null)
							temp2.setset2(temp2.getUp().getUp().getRight());
					}
				
				if(temp2.getRight()!=null)
					if(temp2.getRight().getRight()!=null)
					{
						if(temp2.getRight().getRight().getUp()!=null)
							temp2.setset3(temp2.getRight().getRight().getUp());
						if(temp2.getRight().getRight().getDown()!=null)
							temp2.setset4(temp2.getRight().getRight().getDown());
					}
				if(temp2.getDown()!=null)
					if(temp2.getDown().getDown()!=null)
					{
						if(temp2.getDown().getDown().getRight()!=null)
							temp2.setset5(temp2.getDown().getDown().getRight());
						if(temp2.getDown().getDown().getLeft()!=null)
							temp2.setset6(temp2.getDown().getDown().getLeft());
					}
				if(temp2.getLeft()!=null)
					if(temp2.getLeft().getLeft()!=null)
					{
						if(temp2.getLeft().getLeft().getRight()!=null)
							temp2.setset7(temp2.getLeft().getLeft().getDown());
						if(temp2.getLeft().getLeft().getLeft()!=null)
							temp2.setset8(temp2.getLeft().getLeft().getUp());
					}
				temp=temp.getRight();
			}
			rowmarker=rowmarker.getDown();
		}
	}
	
	public void knightstour()
	{
			knightpath(first,1);
	}
	
	public void testing()
	{
		knightpath(first,1);
	}
	public void display()
	{
		
		NodeTour temp=first;
		NodeTour rowmarker=first;
		
		while(temp!=null)
		{
			while(temp!=null)
			{
				System.out.print(temp.getData()+" ");
				temp=temp.getRight();
			}
			System.out.println("");
			temp=rowmarker.getDown();
			rowmarker=temp;
		}
		
	}
	
	
	public void knightpath(NodeTour node, int number)
	{
		node.setData(number);
		if(number==25)
		{
			System.out.println("Solution found");
			display();
		}
		if(number<25)
		{
			if(node.getset1()!=null&&node.getset1().getData()==0)
				knightpath(node.getset1(),number+1);
			 if(node.getset2()!=null&&node.getset2().getData()==0)
				knightpath(node.getset2(),number+1);
			 if(node.getset3()!=null&&node.getset3().getData()==0)
				knightpath(node.getset3(),number+1);
			 if(node.getset4()!=null&&node.getset4().getData()==0)
				knightpath(node.getset4(),number+1);
			 if(node.getset5()!=null&&node.getset5().getData()==0)
				knightpath(node.getset5(),number+1);
			 if(node.getset6()!=null&&node.getset6().getData()==0)
				knightpath(node.getset6(),number+1);
			 if(node.getset7()!=null&&node.getset7().getData()==0)
				knightpath(node.getset7(),number+1);
			 if(node.getset8()!=null&&node.getset8().getData()==0)
				knightpath(node.getset8(),number+1);
			
			
		}
		if(node.getData()!=1)
			node.setData(0);
		
	}
	
	
	
	
	
}
