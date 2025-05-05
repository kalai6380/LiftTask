package lifttask1;

import java.util.ArrayList;
import java.util.Scanner;

public class LiftUsers {

	public static void main(String[] args) 
	{
		int a,selectLift,selectFloor;
		String res="";
		Scanner t=new Scanner(System.in);
		System.out.println("no of lifts");
		a=t.nextInt();
		
		ArrayList<LiftEntity> ka=new ArrayList<>();
		for(int i=1;i<=a;i++)
		{
			ka.add(new LiftEntity() );
		}
		while(true)
		{
			System.out.println("select lift to go 1to 5");
			selectLift=t.nextInt();
			System.out.println("select floor to go 1to 5");
			selectFloor=t.nextInt();
			
			LiftService user=new LiftService();
			  LiftEntity liftEntity = ka.get(selectLift - 1);
			  liftEntity.setSelectLift(selectLift);
			  liftEntity.setSelectFloor(selectFloor);
			user.start(liftEntity);
		
			
			System.out.println("do yo want to continue");
			res=t.next();
			if(res.equals("yes"))
			{
				continue;
			}
			else
			{
				break;
				
			}

		}
				
		
	}

}
