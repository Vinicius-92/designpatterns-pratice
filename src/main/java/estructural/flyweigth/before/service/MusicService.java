package estructural.flyweigth.before.service;

import estructural.flyweigth.before.model.Music;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MusicService {
	private Map<String, Map<String, Music>> memory;
	
	public MusicService() {
		memory = new HashMap<String, Map<String, Music>>();
	}
	
	public void listenMusic(String user, String desc) {
		Map<String, Music> userPlayList = memory.get(user);
		if(userPlayList == null) {
			userPlayList = new HashMap<>();
			memory.put(user, userPlayList);
		}
		
		Music song = userPlayList.get(desc);
		if(song == null) {
			song = getMusicByString(desc);
			userPlayList.put(desc, song);
		}
		System.out.printf("%s is listening '%s'%n",
				user, song.getName());
		song.listening();
	}
	
	private Music getMusicByString(String desc) {
		String[] musicData = desc.split(";");
		return new Music(musicData[0], musicData[1], Integer.valueOf(musicData[2]));
	}
	
	public void report() {
		int musicInMemory = 0;
		Set<String> users = memory.keySet();
		for(String user: users) {
			int timeCounter = 0;
			System.out.println("---------");
			System.out.println(user + " has listen...");
			Collection<Music> musics = memory.get(user).values();
			for(Music music: musics) {
				System.out.printf("%s/%s %d times%n",
						music.getArtist(), music.getName(), music.getPlayerQty());
				timeCounter += (music.getPlayerQty() * music.getDurationInSeconds());
				musicInMemory++;
			}
			System.out.printf("%s has listen music for %d seconds%n", user, timeCounter);
		}
		System.out.println("Total of musics in memory: " + musicInMemory);
	}
}
