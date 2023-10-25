package test02.construct;

public class Hotel {
		//멤버 변수
		private Chef chef;
		
		//생성자
		public Hotel(Chef chef) {
			this.chef = chef;
		}

		//getter , setter
		public Chef getChef() {
			return chef;
		}

		public void setChef(Chef chef) {
			this.chef = chef;
		}
	
		
		
}
