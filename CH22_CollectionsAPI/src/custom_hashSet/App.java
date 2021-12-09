package custom_hashSet;

import java.util.HashSet;
import java.util.Objects;

class Creature {
	private int id;
	public String name;
	
	public Creature(int id,String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Creature other = (Creature) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return "Creature [id=" + id + ", name=" + name + "]";
	}
}

public class App {
	public static void main(String[] args) {
		HashSet<Creature> creautres = new HashSet<>();
		
		creautres.add(new Creature(0, "고양이"));
		creautres.add(new Creature(1, "개"));
		creautres.add(new Creature(2, "돼지"));
		creautres.add(new Creature(3, "돼지"));
		creautres.add(new Creature(4, "소"));
		creautres.add(new Creature(5, "말"));
		creautres.add(new Creature(6, "비둘기"));

		System.out.println(creautres.contains(new Creature(0,"고양이"))); //위와 다른 객체
		
		creautres.forEach(System.out::println);
		
	}

}
