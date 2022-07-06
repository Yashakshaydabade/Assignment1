package Assignment9;

	public class City 
	{
		String cityname;
		int distance;
		public String getCityname() {
			return cityname;
		}
		public void setCityname(String cityname) {
			this.cityname = cityname;
		}
		public int getDistance() {
			return distance;
		}
		public void setDistance(int distance) {
			this.distance = distance;
		}
	
		public void show() {
			
			System.out.println("city name:-"+getCityname());
			System.out.println("distance:-"+getDistance());
			System.out.println();
			
		}

}
