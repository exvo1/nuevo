package net.sf.l2j.gameserver.model.zone;

import java.util.ArrayList;
import java.util.List;

import net.sf.l2j.commons.random.Rnd;

import net.sf.l2j.gameserver.model.location.Location;

/**
 * An abstract zone with spawn locations, inheriting {@link ZoneType} behavior.<br>
 * <br>
 * Two lazy initialized {@link List}s can hold {@link Location}s.
 */
public abstract class SpawnZoneType extends ZoneType
{
	private List<Location> _locs = null;
	private List<Location> _chaoticLocs = null;
	//custom respawn in town data
	private List<Location> _spawnLocs = null;

	public SpawnZoneType(int id)
	{
		super(id);
	}
	
	/**
	 * Add a {@link Location} to either _locs or _chaoticLocs. Initialize the container if not yet initialized.
	 * @param loc : The Location to register.
	 * @param isChaotic : Set the location on the correct container.
	 */
	public final void addLoc(Location loc, boolean isChaotic)
	{
		if (isChaotic)
		{
			if (_chaoticLocs == null)
				_chaoticLocs = new ArrayList<>();
			
			_chaoticLocs.add(loc);
		}
		else
		{
			if (_locs == null)
				_locs = new ArrayList<>();
			
			_locs.add(loc);
		}
	}
	
	public final List<Location> getLocs()
	{
		return _locs;
	}
	
	/**
	 * @return a random {@link Location} from _locs {@link List}.
	 */
	public final Location getRandomLoc()
	{
		return Rnd.get(_locs);
	}
	
	/**
	 * @return a random {@link Location} from _chaoticLocs {@link List}. If _chaoticLocs isn't initialized, return a random Location from _locs.
	 */
	public final Location getRandomChaoticLoc()
	{
		return Rnd.get((_chaoticLocs != null) ? _chaoticLocs : _locs);
	}


	//custom respawn in town data
	public final void addSpawnLoc(Location loc)
	{
		if (_spawnLocs == null)
			_spawnLocs = new ArrayList<>();

		_spawnLocs.add(loc);
	}
	public final Location getSpawnLoc()
	{
		return Rnd.get((_spawnLocs != null) ? _spawnLocs : _locs);
	}
}