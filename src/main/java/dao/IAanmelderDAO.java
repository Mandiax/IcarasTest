package dao;

import model.Aanmelder;

public interface IAanmelderDAO {
	
	public Aanmelder findAanmelder (long id);

    public void persistAanmelder (Aanmelder aanmelder);
    
    public void updateAanmelder (Aanmelder aanmelder);
    
    public void deleteAanmelder (Aanmelder aanmelder);
	
}
