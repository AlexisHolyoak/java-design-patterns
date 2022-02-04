package factorymethod5;

public class MiniCooperFactory implements IAutoFactory {

	@Override
	public IAuto createAutomobile() {		
		MiniCooper mini = new MiniCooper();
        mini.setName("Mini Cooper S");    
        return mini;
	}	
}