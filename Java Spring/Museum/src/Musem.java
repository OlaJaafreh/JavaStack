import java.util.ArrayList;
import java.util.Collections;

public class Musem{

	public static void main(String[] args) {

		Painting paint = new Painting("Ola","Ol","jj","jn");
		Painting paint1 = new Painting("Ola1","Ol1","jj1","jn1");
		Painting paint2 = new Painting("Ola2","Ol2","jj2","jn2");
		
		Sculpture scul = new Sculpture("Ola","Ol","jj","jn");
		Sculpture scul1 = new Sculpture("Ola1","Ol1","jj1","jn1");
		
		ArrayList<Art> museum = new ArrayList<Art> ();
		museum.add(paint);
		museum.add(paint1);
		museum.add(paint2);
		
		museum.add(scul);
		museum.add(scul1);
		
		Collections.shuffle(museum);

        for (Art art: museum) {
            art.viewArt();
            System.out.println("--------------");
        }

		

	}

}
