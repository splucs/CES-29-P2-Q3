package exe03;

public class MVCPatternDemo {
	public static void main(String[] args) {

		Controller studentController;
		Controller profController;
		
		try {
			studentController = ControllerFactory.createController("student");
			profController = ControllerFactory.createController("professor");
			
			studentController.updateView();
			profController.updateView();

			studentController.setName("John");
			profController.setName("Fenwick");

			studentController.updateView();
			profController.updateView();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
