package core_concept;

public class Subject {
	
	Topic topic = new Topic();
	
	public void study()
	{
		// study method depends on the understand method of Topic class
		topic.understand();
	}
	
}
