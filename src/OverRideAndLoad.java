
public class OverRideAndLoad {
	public String findActionScenes() {
		return "Not a  Movie";
	}
	public String findActionScenes(int fight) {
		if(fight>=3&&fight<5) {
			return "Normal Action Movie";
		}else if(fight>=5&&fight<7) {
			return "Mid Action Movie";
		}
		else {
			return "Hardcore Action Movie";
			
		}
		
	}
	public String findActionScenes(String fightCount) {
		return fightCount;
	}

}

class OverRide extends OverRideAndLoad {
	public String findActionScenes(int fight) {
		if(fight>=0&&fight<3) {
			return "Movie has only few number of Fight Scenes";
		}
		else {
			return "Null";
		}
	}
}
