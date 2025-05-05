package lifttask1;

public class LiftService implements Lift
{

	@Override
	public void start(LiftEntity lift) 
	{
		
		System.out.println("selected lift"+lift.getSelectLift()+"selected floor"+lift.getSelectFloor());
	}

}
