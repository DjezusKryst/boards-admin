package boards.models.org;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Model {
	private String identity;
	private List<Story> stories;

	public Developer() {
		this(0,"NO NAME");
	}

	public Developer(int id,String identity) {
		super(id);
		this.identity = identity;
		stories=new ArrayList<>();
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public List<Story> getStories() {
		return stories;
	}

	public void setStories(List<Story> stories) {
		this.stories = stories;
	}

	@Override
	public String toString() {
		return identity;
	}
	
}