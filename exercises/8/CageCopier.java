
public class CageCopier {

	public void copy(Cage c1, Cage c2) {
	    if(c1 == null || c2 == null)
	        return;

		c2.setId(c1.getId());
		c2.setName(c1.getName());

        Bird birds[] = c1.getBirds();
        Bird newBird[] = new Bird[2];
        if(birds != null)
        {
            newBird[0] = null;
            newBird[1] = null;
            for (int i = 0; i < birds.length; i++) {
                if(birds[i] != null)
                {
                    newBird[i] = new Bird();
                    newBird[i].setColor(birds[i].getColor());
                    newBird[i].setName(birds[i].getName());
                }
                else
                    newBird[i] = null;

            }

            c2.setBirds(newBird);
        }
        else
            c2.setBirds(null);

	}
}
